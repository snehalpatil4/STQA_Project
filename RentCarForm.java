package Jtesting;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import static org.junit.Assert.*;
import java.awt.Font;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.LayoutStyle.ComponentPlacement;


public class RentCarForm extends JFrame{
	static RentCarForm frame;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new RentCarForm(" "," ",0,0);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public RentCarForm(String car_num,String na_me,int id_d,int cont_ct){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 404);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		JLabel lblAddCar = new JLabel("Rent Car");
		lblAddCar.setForeground(Color.GRAY);
		lblAddCar.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel lblCarNo = new JLabel("CarNo:");
		
		JLabel lblcno = new JLabel("Issue-Id:");
		
		JLabel lblname = new JLabel("Issuer-Name:");
		
		JLabel lblModel = new JLabel("Issuer-Contact");
		
	
		textField = new JTextField();
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		
		JButton btnAddcars = new JButton("Add Car");
		btnAddcars.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String carno=car_num;
					//textField.getText();
			int Id=id_d;
					//Integer.parseInt(textField_1.getText());
			System.out.print(""+Id);
			String name=na_me;
					//textField_2.getText();
			int contact=cont_ct;
					//Integer.parseInt(textField_3.getText());
			int c=1;
			
			if(carno.isEmpty()||name.isEmpty()||Id==0||contact==0){
				System.out.println("Empty Field not allowed");
				assertEquals(c,1);
			}
			else if(carno!=null && name!=null && Id!=0 && contact!=0)
			{
				c=0;
				assertEquals(c,0);
			}
			else if(carno.equals(" ")){
				c=0;
				assertEquals(c,0);
			}
			else if(name.equals(" ")){
				c=0;
				assertEquals(c,0);
			}
			else if(Id==0){
				c=0;
				assertEquals(c,0);
			}
			else if(contact==0){
				c=0;
				assertEquals(c,0);
			}
			
/*			int i=CarDao.save(carno, chasisno, name, model, quantity);
			if(i>0){
				JOptionPane.showMessageDialog(CarsForm.this,"Car added successfully!");
				AdminSuccess.main(new String[]{});
				frame.dispose();
				
			}else{
				JOptionPane.showMessageDialog(CarsForm.this,"Sorry, unable to save!");
			}*/
			}
		});
		
		JButton btnBack = new JButton("Back");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(150)
							.addComponent(lblAddCar))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addComponent(lblcno, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblCarNo)
								.addComponent(lblname, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblModel, GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)	
							.addGap(47)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING))
								.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(125, Short.MAX_VALUE))
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
					.addGap(161)
					.addComponent(btnAddcars, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(162, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(359, Short.MAX_VALUE)
					.addComponent(btnBack)
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblAddCar)
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCarNo)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblcno)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblname)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblModel)
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE))
					.addGap(30)
					.addComponent(btnAddcars, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnBack)
					.addContainerGap(53, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
	

}
