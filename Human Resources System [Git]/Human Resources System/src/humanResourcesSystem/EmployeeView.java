package humanResourcesSystem;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class EmployeeView extends JFrame
{
	private JLabel firstNameLbl, lastNameLbl, addressLbl, payLevelLbl, deptLbl, selectExistingEmployeeLbl;
	private JTextField firstNameTF, lastNameTF, addressTF, selectExistingEmployeeTF;
	private JRadioButton maleRadioBtn, femaleRadioBtn;
	private ButtonGroup grpGender;
	//*These comnbo boxes will be populated from an arrayList*//
	private JComboBox payLevelComboBox, deptComboBox;
	private JButton alterBtn, deleteBtn, addBtn, clearFormBtn, saveChangesBtn, closeBtn;

	private JPanel firstPanel, secondPanel, thirdPanel, fourthPanel, fifthPanel;

	public EmployeeView()
	{
		firstNameLbl = new JLabel("First Name:");
		lastNameLbl = new JLabel("Last Name:");
		addressLbl = new JLabel("Address:");
		payLevelLbl = new JLabel("Pay Level");
		deptLbl = new JLabel("Department");
		selectExistingEmployeeLbl = new JLabel("Select Existing Employee");

		maleRadioBtn = new JRadioButton("Male");
		femaleRadioBtn = new JRadioButton("Female");
		grpGender = new ButtonGroup();
		grpGender.add(maleRadioBtn);
		grpGender.add(femaleRadioBtn);

		payLevelComboBox = new JComboBox();
		deptComboBox = new JComboBox();

		firstNameTF = new JTextField(20);
		lastNameTF = new JTextField(20);
		addressTF = new JTextField(10);
		selectExistingEmployeeTF = new JTextField(5);

		alterBtn = new JButton("Alter");
		deleteBtn = new JButton("Delete");
		addBtn = new JButton("Add");
		clearFormBtn = new JButton("Clear Form");
		saveChangesBtn = new JButton("Save");
		closeBtn = new JButton("Close");

		firstPanel = new JPanel(new FlowLayout());
		firstPanel.add(firstNameLbl);
		firstPanel.add(firstNameTF);
		firstPanel.add(lastNameLbl);
		firstPanel.add(lastNameTF);

		secondPanel = new JPanel(new FlowLayout());
		secondPanel.add(maleRadioBtn);
		secondPanel.add(femaleRadioBtn);
		secondPanel.add(addressLbl);
		secondPanel.add(addressTF);

		thirdPanel = new JPanel(new FlowLayout());
		thirdPanel.add(payLevelLbl);
		thirdPanel.add(payLevelComboBox);
		thirdPanel.add(deptLbl);
		thirdPanel.add(deptComboBox);

		fourthPanel = new JPanel(new FlowLayout());
		fourthPanel.add(selectExistingEmployeeLbl);
		fourthPanel.add(selectExistingEmployeeTF);
		fourthPanel.add(alterBtn);
		fourthPanel.add(deleteBtn);

		fifthPanel = new JPanel(new FlowLayout());
		fifthPanel.add(addBtn);
		fifthPanel.add(clearFormBtn);
		fifthPanel.add(saveChangesBtn);
		fifthPanel.add(closeBtn);

		//first = rows //second = columns
		setLayout(new GridLayout(5,1));
		add(firstPanel);
		add(secondPanel);
		add(thirdPanel);
		add(fourthPanel);
		add(fifthPanel);
		pack();
		setVisible(true);
	}
}
