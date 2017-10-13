package humanResourcesSystem;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainView extends JFrame
{
	private JButton addNewDeptBtn,
	manageDeptBtn,
	manageEmployeesBtn,
	producePayReportBtn,
	exitAndSaveBtn;
	private JPanel topPanel, midPanel, bottomPanel;

	public MainView()
	{
		addNewDeptBtn = new JButton("Add New Department");
		manageDeptBtn = new JButton("Manage Departments");
		manageEmployeesBtn = new JButton("Manage Employees");
		producePayReportBtn = new JButton("Produce Pay Report");
		exitAndSaveBtn = new JButton("Exit and Save");

		topPanel = new JPanel(new FlowLayout());
		topPanel.add(addNewDeptBtn);
		topPanel.add(manageDeptBtn);
		midPanel = new JPanel(new FlowLayout());
		midPanel.add(manageEmployeesBtn);
		midPanel.add(producePayReportBtn);
		bottomPanel = new JPanel(new FlowLayout());
		bottomPanel.add(exitAndSaveBtn);

		add(topPanel, BorderLayout.NORTH);
		add(midPanel, BorderLayout.CENTER);
		add(bottomPanel, BorderLayout.SOUTH);
		setResizable(false);
		pack();
		setVisible(true);
	}

	public JButton getAddNewDeptBtn()
	{
		return addNewDeptBtn;
	}

	public JButton getManageDeptBtn()
	{
		return manageDeptBtn;
	}

	public JButton getManageEmployeesBtn()
	{
		return manageEmployeesBtn;
	}

	public JButton getProducePayReportBtn()
	{
		return producePayReportBtn;
	}

	public JButton getExitAndSaveBtn()
	{
		return exitAndSaveBtn;
	}

}
