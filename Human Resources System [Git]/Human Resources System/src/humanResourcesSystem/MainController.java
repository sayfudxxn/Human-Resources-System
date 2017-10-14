package humanResourcesSystem;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainController
{
	private NewDepartmentView newDepartmentView;
	private DepartmentView departmentView;
	private EmployeeView employeeView;
	private MainView mainView;

	public MainController()
	{
		mainView = new MainView();
		addNewDepartment();
		manageDepartment();
		manageEmployees();
		exitAndSave();
	}

	public void addNewDepartment()
	{
		mainView.getAddNewDeptBtn().addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				newDepartmentView =  new NewDepartmentView();
				newDepartmentView.setVisible(true);
				new NewDepartmentController(newDepartmentView);
			}
		});
	}

	public void manageDepartment()
	{
		mainView.getManageDeptBtn().addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				departmentView = new DepartmentView();
				departmentView.setVisible(true);
				new DepartmentController(departmentView);
			}
		});
	}

	public void manageEmployees()
	{
		mainView.getManageEmployeesBtn().addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				employeeView = new EmployeeView();
				employeeView.setVisible(true);
				new EmployeeController(employeeView);
			}
		});
	}

	public void productPayReport()
	{

	}

	public void exitAndSave()
	{
		mainView.getExitAndSaveBtn().addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				System.exit(0);
			}
		});
	}

	public MainView getMainView()
	{
		return mainView;
	}

}