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

	public Employee()
	{

	}

}