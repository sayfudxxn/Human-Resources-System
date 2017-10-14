package humanResourcesSystem;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class NewDepartmentView extends JFrame
{
	private JLabel departmentNameLbl, departmentLocationLbl;
	private JTextField departmentNameTF, departmentLocationTF;
	private JPanel deptNamePanel, deptLocationPanel, saveBtnPanel;
	private JButton saveBtn;

	public NewDepartmentView ()
	{
		departmentNameLbl = new JLabel("Department Name:");
		departmentLocationLbl = new JLabel("Department Location:");

		departmentNameTF = new JTextField(20);
		departmentLocationTF = new JTextField(18);

		saveBtn = new JButton("Save");

		deptNamePanel = new JPanel(new FlowLayout());
		deptNamePanel.add(departmentNameLbl);
		deptNamePanel.add(departmentNameTF);

		deptLocationPanel = new JPanel(new FlowLayout());
		deptLocationPanel.add(departmentLocationLbl);
		deptLocationPanel.add(departmentLocationTF);

		saveBtnPanel = new JPanel(new FlowLayout());
		saveBtnPanel.add(saveBtn);

		add(deptNamePanel, BorderLayout.NORTH);
		add(deptLocationPanel, BorderLayout.CENTER);
		add(saveBtnPanel, BorderLayout.SOUTH);
		setResizable(false);
		pack();
		setVisible(true);
	}

	public JButton getSaveBtn()
	{
		return saveBtn;
	}

	public JTextField getDepartmentName()
	{
		return departmentNameTF;
	}

	public JTextField getDepartmentLocation()
	{
		return departmentLocationTF;
	}
}
