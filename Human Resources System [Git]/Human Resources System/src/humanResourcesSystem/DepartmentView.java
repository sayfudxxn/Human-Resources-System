package humanResourcesSystem;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class DepartmentView extends JFrame
{
	private JButton btnClose, btnAlter, btnSave, btnDelete;
	private JComboBox cbDepartments, cbDeptHead;
	private JTextField txtDeptName, txtLocation;
	private JTextArea txtEmployeeList;

	private Department curSelectedDept = null;

	public DepartmentView()
	{
		btnDelete = new JButton("Delete");
		btnAlter = new JButton("View/Alter");
		btnSave = new JButton("Save");
		btnClose = new JButton("Close");

	}

	public void populateComboBox()
	{

	}
}