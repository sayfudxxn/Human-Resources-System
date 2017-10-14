package humanResourcesSystem;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SystemData implements Serializable
{
	private static ArrayList<Department> departments = new ArrayList<>();
	private static Map<Integer, Employee> employees = new HashMap<>();

	public static boolean addDepartment(Department department)
	{
		if(!departments.contains(department))
		{
			departments.add(department);
			return true;
		}
		else return false;
	}

	public static boolean deleteDepartment(Department department)
	{
		if(departments.contains(department))
		{
			departments.remove(department);
			return true;
		}
		else return false;
	}

	public static boolean deleteEmployee(int employeeNumber)
	{
		if(employees.containsKey(employeeNumber))
		{
			employees.remove(employeeNumber);
			return true;
		}
		else return false;
	}

	public static ArrayList<Department> getAllDepartments()
	{
		return (ArrayList<Department>) departments.clone();
	}

	public static ArrayList<Employee> getAllEmployees()
	{
		return new ArrayList<Employee>(employees.values());
	}

	public static boolean addEmployee (Employee employee)
	{
		if(!employees.containsValue(employee))
		{
			employees.put(employee.getId(), employee);
			return true;
		}
		else return false;
	}

	public static Employee getEmployee(int empID)
	{
		if(employees.containsKey(empID))
			return employees.get(empID);
		else
			return null;
	}

	public static void loadFromDisk() throws IOException
	{
		FileInputStream fis = new FileInputStream("startup.txt");
	}

	public static void loadRawFile()
	{

	}

	public static void saveToDisk()
	{

	}
}