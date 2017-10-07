package humanResourcesSystem;

import java.util.ArrayList;
import java.util.HashMap;

public class Database
{
	private ArrayList<Department> departments;
	private HashMap<Integer, Employee> employees;

	public boolean setInformation(ArrayList<Department> departments, HashMap<Integer, Employee> employees)
	{
		if(departments == null || employees == null)
			return false;
		else
		{
			this.departments = departments;
			this.employees = employees;
			return true;
		}
	}
}