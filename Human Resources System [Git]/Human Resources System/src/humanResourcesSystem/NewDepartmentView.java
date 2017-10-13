package humanResourcesSystem;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class NewDepartmentView extends JFrame
{
	private JLabel departmentNameLbl, departmentLocationLbl, headOfDeptLbl;
	private JTextField departmentNameTF, departmentLocationTF, headOfDeptTF;
	private JPanel deptNamePanel, deptLocationPanel, headOfDeptPanel, saveBtnPanel;
	private JButton saveBtn;

	public NewDepartmentView ()
	{
		departmentNameLbl = new JLabel("Department Name:");
		departmentLocationLbl = new JLabel("Department Location:");
		headOfDeptLbl = new JLabel("Head of department");
		departmentNameTF = new JTextField();
		departmentLocationTF = new JTextField();
		headOfDeptTF = new JTextField();
		saveBtn = new JButton("Save");
		//**//
		deptNamePanel = new JPanel();
		//deptNamePanel.setLayout(new FlowLayout());
		deptNamePanel.setLayout(new GridLayout(1,2));
		deptNamePanel.add(departmentNameLbl);
		deptNamePanel.add(departmentNameTF);

		deptLocationPanel = new JPanel();
		//deptLocationPanel.setLayout(new FlowLayout());
		deptLocationPanel.setLayout(new GridLayout(1,2));
		deptLocationPanel.add(departmentLocationLbl);
		deptLocationPanel.add(departmentLocationTF);
		//**
		headOfDeptPanel = new JPanel();
		//headOfDeptPanel.setLayout(new FlowLayout());
		headOfDeptPanel.setLayout(new GridLayout(1,1));
		headOfDeptPanel.add(headOfDeptLbl);
		headOfDeptPanel.add(headOfDeptTF);
		//**
		saveBtnPanel = new JPanel();
		saveBtnPanel.setLayout(new FlowLayout());
		saveBtnPanel.add(saveBtn);

		setLayout(new GridLayout(4,1));
		add(deptNamePanel);
		add(deptLocationPanel);
		add(headOfDeptPanel);
		add(saveBtnPanel);
		setSize(500,200);
		//pack();
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

	public JTextField getHeadOfDept()
	{
		return headOfDeptTF;
	}
}
