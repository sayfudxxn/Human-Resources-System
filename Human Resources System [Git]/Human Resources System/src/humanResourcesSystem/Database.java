package humanResourcesSystem;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Map;

public class Database implements Serializable
{
	private ArrayList<Department> departments;
	private Map<Integer, Employee> employees;

	public boolean setInformation(ArrayList<Department> tDept, Map<Integer, Employee> tEmpl)
	{
		if(departments == null || employees == null)
			return false;
		else
		{
			this.departments = tDept;
			this.employees = tEmpl;
			return true;
		}
	}
}