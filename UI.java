package UIP;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JList;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseWheelEvent;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JSeparator;

public class UI {

	private JFrame frame;
	private JTextField textStaffEmail;
	private JTextField textStaffName2;
	private JTextField textStaffPost;
	private JTextField textStaffName;
	private JTable table;
	private JTextField textLeaveStart;
	private JTextField textLeaveEnd;
	private JTextField textTDays;
	private JTextField textLeaveType;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UI window = new UI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public UI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1007, 608);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		table = new JTable();
		table.setBounds(0, 111, 989, 181);
		frame.getContentPane().add(table);
		
		Object[] columns = {"employeeName","employeePosition","employeeEmail","employeeSuper"};
		DefaultTableModel model = new DefaultTableModel();
		model.setColumnIdentifiers(columns);
		table.setModel(model);
		
		
		table.setBackground(Color.darkGray);
		table.setForeground(Color.white);
		Font font = new Font ("",1,15);
		table.setFont(font);
		table.setRowHeight(20);
		
		
		JLabel lblStaffAdddelete = new JLabel("Staff Add/Delete");
		lblStaffAdddelete.setBounds(12, 13, 319, 25);
		frame.getContentPane().add(lblStaffAdddelete);
		
		textStaffEmail = new JTextField();
		textStaffEmail.setBounds(554, 38, 116, 22);
		frame.getContentPane().add(textStaffEmail);
		textStaffEmail.setColumns(10);
		
		textStaffName2 = new JTextField();
		textStaffName2.setBounds(798, 38, 116, 22);
		frame.getContentPane().add(textStaffName2);
		textStaffName2.setColumns(10);
		
		textStaffPost = new JTextField();
		textStaffPost.setBounds(325, 38, 116, 22);
		frame.getContentPane().add(textStaffPost);
		textStaffPost.setColumns(10);
		
		textStaffName = new JTextField();
		textStaffName.setBounds(100, 38, 116, 22);
		frame.getContentPane().add(textStaffName);
		textStaffName.setColumns(10);
		
		textStaffName.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent event){
			System.out.print("Mandatory");
		}
		});
		
		JLabel lblStaffName = new JLabel("Staff Name :");
		lblStaffName.setBounds(22, 40, 97, 19);
		frame.getContentPane().add(lblStaffName);
		
		JLabel lblStaffPost = new JLabel("Staff Position :");
		lblStaffPost.setBounds(228, 40, 85, 19);
		frame.getContentPane().add(lblStaffPost);
		
		JLabel lblStaffEmail = new JLabel("Staff Email :");
		lblStaffEmail.setBounds(464, 41, 97, 16);
		frame.getContentPane().add(lblStaffEmail);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnAdd.setBounds(12, 73, 97, 25);
		frame.getContentPane().add(btnAdd);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBounds(278, 73, 97, 25);
		frame.getContentPane().add(btnDelete);
		
		JButton btnApplyLeave = new JButton("Apply Leave");
		btnApplyLeave.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0)	{	
			}
		});

		btnApplyLeave.setBounds(12, 355, 162, 25);
		frame.getContentPane().add(btnApplyLeave);
		
		JLabel lblStaffManager = new JLabel("Staff Manager :");
		lblStaffManager.setBounds(689, 40, 97, 19);
		frame.getContentPane().add(lblStaffManager);
		
		JLabel lblLeaveApplication = new JLabel("Leave Application");
		lblLeaveApplication.setBounds(10, 305, 201, 16);
		frame.getContentPane().add(lblLeaveApplication);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setBounds(138, 73, 97, 25);
		frame.getContentPane().add(btnUpdate);
		
		textLeaveStart = new JTextField();
		textLeaveStart.setBounds(138, 323, 116, 22);
		frame.getContentPane().add(textLeaveStart);
		textLeaveStart.setColumns(10);
		
		textLeaveEnd = new JTextField();
		textLeaveEnd.setBounds(380, 323, 116, 22);
		frame.getContentPane().add(textLeaveEnd);
		textLeaveEnd.setColumns(10);
		
		textTDays = new JTextField();
		textTDays.setBounds(630, 323, 116, 22);
		frame.getContentPane().add(textTDays);
		textTDays.setColumns(10);
		
		textLeaveType = new JTextField();
		textLeaveType.setBounds(861, 323, 116, 22);
		frame.getContentPane().add(textLeaveType);
		textLeaveType.setColumns(10);
		
		JLabel lblLeaveStartDate = new JLabel("Leave Start Date :");
		lblLeaveStartDate.setBounds(20, 326, 124, 16);
		frame.getContentPane().add(lblLeaveStartDate);
		
		JButton btnDeclineLeave = new JButton("Decline Leave");
		btnDeclineLeave.setBounds(390, 358, 162, 22);
		frame.getContentPane().add(btnDeclineLeave);
		
		table_1 = new JTable();
		table_1.setBounds(0, 393, 989, 167);
		frame.getContentPane().add(table_1);
		
		Object[] columns_1 = {"employeeName","employeeSuper","LType","LeaveStart","LeaveEnd","TDays"};
		DefaultTableModel model_1 = new DefaultTableModel();
		model_1.setColumnIdentifiers(columns_1);
		table_1.setModel(model_1);
		
		table_1.setBackground(Color.white);
		table_1.setForeground(Color.blue);
		Font font_1 = new Font ("",1,15);
		table_1.setFont(font);
		table_1.setRowHeight(20);
		
		JLabel lblLeaveEndDate = new JLabel("Leave End Date :");
		lblLeaveEndDate.setBounds(266, 323, 124, 22);
		frame.getContentPane().add(lblLeaveEndDate);
		
		JLabel lblTotalLeaveDays = new JLabel("Total Leave Days :");
		lblTotalLeaveDays.setBounds(508, 322, 132, 25);
		frame.getContentPane().add(lblTotalLeaveDays);
		
		JLabel lblLeaveType = new JLabel("Leave Type : ");
		lblLeaveType.setBounds(769, 326, 116, 16);
		frame.getContentPane().add(lblLeaveType);
		
		JButton btnApproveLeave = new JButton("Approve Leave");
		btnApproveLeave.setBounds(200, 355, 162, 25);
		frame.getContentPane().add(btnApproveLeave);
		
		
		
		
		Object[] row = new Object [4];
		btnAdd.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
			row[0] = textStaffName.getText();
			row[1] = textStaffPost.getText();
			row[2] = textStaffEmail.getText();
			row[3] = textStaffName2.getText();
			
			model.addRow(row);
			}
			
		});
		
		table.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseClicked(MouseEvent e){
					int i = table.getSelectedRow();
					textStaffName.setText(model.getValueAt(i,0).toString());
					textStaffPost.setText(model.getValueAt(i,1).toString());
					textStaffEmail.setText(model.getValueAt(i,2).toString());
					textStaffName2.setText(model.getValueAt(i,3).toString());
				}
				
		
					});
					
		btnUpdate.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
			
				int i = table.getSelectedRow();
				if (i >=0)
				{
					model.setValueAt(textStaffName.getText(), i, 0);
					model.setValueAt(textStaffPost.getText(), i, 1);
					model.setValueAt(textStaffEmail.getText(), i, 2);
					model.setValueAt(textStaffName2.getText(), i, 3);
				}
				else {
					System.out.println("Update Error");
				}
			}});
					
		btnDelete.addActionListener(new ActionListener(){
				@Override
			public void actionPerformed(ActionEvent e){
				
				int i= table.getSelectedRow();
				if(i >= 0){
					model.removeRow(i);
					}
				else{
					System.out.println("Delete Error");
				}
			
			}
		});
		String[] columnNames_1 = {"Staff Name", "Line Manager", "Leave Type", "Start Date", "End Date"};
		
		Object[] row_1 = new Object [6];
		btnApplyLeave.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
			row_1[0] = textStaffName.getText();
			row_1[2] = textLeaveType.getText();
			row_1[3] = textLeaveStart.getText();
			row_1[4] = textLeaveEnd.getText();
			row_1[5] = textTDays.getText();
			
			
			model_1.addRow(row_1);
			}
			
		});
		
		table_1.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseClicked(MouseEvent e){
					int i = table_1.getSelectedRow();
					textLeaveStart.setText(model_1.getValueAt(i,3).toString());
					textLeaveEnd.setText(model_1.getValueAt(i,4).toString());
					textTDays.setText(model_1.getValueAt(i,5).toString());
					textLeaveType.setText(model_1.getValueAt(i,2).toString());
				}
				
		
					});
					
		btnApproveLeave.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
			
				int i = table_1.getSelectedRow();
				if (i >=0)
				{
					model_1.setValueAt(textStaffName.getText(), i, 0);
					model_1.setValueAt(textStaffName2.getText(), i, 1);
					model_1.setValueAt(textLeaveStart.getText(), i, 3);
					model_1.setValueAt(textLeaveEnd.getText(), i, 4);
					model_1.setValueAt(textLeaveType.getText(),i,2);
					model_1.setValueAt(textTDays.getText(),i,5);
				}
				else {
					System.out.println("Error");
				}
			}});
					
		btnDeclineLeave.addActionListener(new ActionListener(){
				@Override
			public void actionPerformed(ActionEvent e){
				
				int i= table_1.getSelectedRow();
				if(i >= 0){
					model_1.removeRow(i);
					}
				else{
					System.out.println("Error");
				}
			
			}
		});
		
		
		
	}
}
