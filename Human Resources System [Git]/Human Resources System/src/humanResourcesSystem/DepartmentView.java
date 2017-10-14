package humanResourcesSystem;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class DepartmentView extends JFrame
{
	private JLabel selectDeptLbl, headOfDeptLbl;
	private JButton btnClose, btnAlter, btnSave, btnDelete;
	private JComboBox cbDepartments, cbDeptHead;
	private JTextField txtDeptName, txtLocation;
	private JTextArea txtEmployeeList;
	private JPanel topPanel, midPanel, bottomPanel;


	public DepartmentView()
	{
		selectDeptLbl = new JLabel("Select Department");
		headOfDeptLbl = new JLabel("Head of Department");

		btnDelete = new JButton("Delete");
		btnAlter = new JButton("View/Alter");
		btnSave = new JButton("Save");
		btnClose = new JButton("Close");

		cbDepartments = new JComboBox();
		cbDeptHead = new JComboBox();

		txtDeptName = new JTextField();
		txtLocation = new JTextField();

		txtEmployeeList = new JTextArea(10,30);

		topPanel = new JPanel(new FlowLayout());
		topPanel.add(selectDeptLbl);
		topPanel.add(cbDepartments);
		topPanel.add(btnAlter);
		topPanel.add(btnDelete);

		midPanel = new JPanel(new FlowLayout());
		midPanel.add(txtEmployeeList);

		bottomPanel = new JPanel(new FlowLayout());
		bottomPanel.add(headOfDeptLbl);
		bottomPanel.add(cbDeptHead);
		bottomPanel.add(btnSave);
		bottomPanel.add(btnClose);

		add(topPanel, BorderLayout.NORTH);
		add(midPanel, BorderLayout.CENTER);
		add(bottomPanel, BorderLayout.SOUTH);
		setResizable(false);
		pack();
		setVisible(true);
	}

	public JButton getBtnClose()
	{
		return btnClose;
	}


	public JButton getBtnAlter()
	{
		return btnAlter;
	}


	public JButton getBtnSave()
	{
		return btnSave;
	}


	public JButton getBtnDelete()
	{
		return btnDelete;
	}

}