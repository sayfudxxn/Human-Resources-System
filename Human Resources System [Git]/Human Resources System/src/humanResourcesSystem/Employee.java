package humanResourcesSystem;

import java.io.Serializable;

public class Employee implements Serializable
{

	public static boolean MALE = true;
	public static boolean FEMALE = false;
	private static final int MAX_LEVEL = 10;
	private static int nextEmpID = 10000;
	private static transient double[] salaryValues = { 0,
			44245.75,
			48670.32,
			53537.35,
			58891.07,
			64780.20,
			71258.22,
			80946.95,
			96336.34,
			104232.78,
			112693.07
	};


	private int id;
	private String firstName;
	private String lastName;
	private boolean gender;
	private String address;
	private int payLevel;
	private Department curDepartment;

	public Employee (String firstName, String lastName, boolean gender, String address, int payLevel, Department curDepartment)
	{
		if (firstName == null || lastName == null || address == null)
			new NullPointerException("First name or last name or address is missing");
		if(payLevel < 1 || payLevel > MAX_LEVEL)
			new EmployeeException("Pay Level needs to be higher than 1 or less than max level");
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.payLevel = payLevel;
		this.curDepartment = curDepartment;

		if(nextEmpID > 29999)
			new EmployeeException("EmployeeId too full");
		else
			id = nextEmpID;
	}

	public boolean setCurDepartment (Department newDept)
	{
		if(curDepartment != null && curDepartment.getHead() == this)
			return false;
		else
		{
			if(curDepartment != null)
				curDepartment.leave(this);
			curDepartment = newDept;
			if(newDept != null)
				newDept.join(this);
		}
		return true;
	}

	public int getId ()
	{
		return id;
	}

	public String getFirstName ()
	{
		return firstName;
	}

	public void setFirstName (String firstName)
	{
		this.firstName = firstName;
	}

	public String getLastName ()
	{
		return lastName;
	}

	public void setLastName (String lastName)
	{
		this.lastName = lastName;
	}

	public boolean isGender ()
	{
		return gender;
	}

	public void setGender (boolean gender)
	{
		this.gender = gender;
	}

	public String getAddress ()
	{
		return address;
	}

	public void setAddress (String address)
	{
		this.address = address;
	}

	public int getPayLevel ()
	{
		return payLevel;
	}

	public void setPayLevel (int payLevel)
	{
		this.payLevel = payLevel;
	}

	public Department getCurDepartment ()
	{
		return curDepartment;
	}

	public static double[] getSalaryValues ()
	{
		return salaryValues;
	}

	/*public static void setSalaryValues (double[] salaryValues)
	{
		Employee.salaryValues = salaryValues;
	}*/
	@Override
	public String toString()
	{
		return "First Name: " + firstName + " Last Name: " + lastName;
	}
}