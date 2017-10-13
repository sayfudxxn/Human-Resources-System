package humanResourcesSystem;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainController
{
	private NewDepartmentView newDepartmentView;
	private Department department;
	private MainView mainView;

	public MainController()
	{
		mainView = new MainView();
		addNewDepartment();
		//saveBtnClicked();
	}
	public void saveBtnClicked()
	{
		newDepartmentView.getSaveBtn().addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				department = new Department(newDepartmentView.getDepartmentName().toString(), newDepartmentView.getDepartmentLocation().toString());
			}
		});
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

}