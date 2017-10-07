package humanResourcesSystem;

import java.util.ArrayList;

public class Department implements Comparable<Department>
{

	private String name;
	private String location;
	private Employee headOfDept;

	private ArrayList<Employee> employees;

	public Department(String name, String location)
	{
		if(name == null || location == null)
			new NullPointerException("Name or Location is empty");
		this.name = name;
		this.location = location;
		//headOfDept = new Employee();
		employees = new ArrayList<>();
	}

	public Employee getHead()
	{
		return headOfDept;
	}

	public boolean setHead (Employee who)
	{
		if(employees.contains(who))
		{
			headOfDept = who;
			return true;
		}
		else return false;
	}

	public boolean join (Employee person)
	{
		if(employees.contains(person))
			return false;
		else
		{
			if(person.getCurDepartment() == this)
			{
				employees.add(person);
				return true;
			}
		}
		return false;
	}

	public boolean leave (Employee person)
	{
		if(person == headOfDept || !employees.contains(person))
			return false;
		else
		{
			employees.remove(person);
			return true;
		}
	}

	public boolean contains (Employee whoToFind)
	{
		if(whoToFind == null)
			return false;

		for(Employee e: employees)
			if(e == whoToFind)
				return true;
		return false;
	}

	@Override
	public String toString()
	{
		return "Department Name " + name;
	}

	@Override
	public boolean equals (Object other)
	{
		boolean result = false;
		if(other instanceof Department)
		{
			Department otherDept = (Department) other;
			if(name.equalsIgnoreCase(otherDept.name))
				result = true;
		}
		return result;
	}

	@Override
	public int compareTo(Department otherDept)
	{
		return this.name.compareTo(otherDept.name);
	}
}
