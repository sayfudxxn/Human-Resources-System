package humanResourcesSystem;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewDepartmentController
{
	private Department department;
	private NewDepartmentView newDepartmentView;
	private Employee employee;

	public NewDepartmentController()
	{

	}

	public NewDepartmentController(NewDepartmentView newDepartmentView)
	{
		this.newDepartmentView = newDepartmentView;
		newDepartmentView.getSaveBtn().addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				String departmentName = newDepartmentView.getDepartmentName().toString();
				String departmentLocation = newDepartmentView.getDepartmentLocation().toString();
				department = new Department(departmentName, departmentLocation);

			}
		});
	}
}
