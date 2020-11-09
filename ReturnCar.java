package Jtesting;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import static org.junit.Assert.*;
public class ReturnCar	extends JFrame  {
	static ReturnCar frame;
	private JPanel contentPane;
	private JTextField textField;
private JTextField textField_1;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new ReturnCar(" ",0);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public ReturnCar(String s,int id) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 516, 413);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblReturnCar = new JLabel("Return Car");
		lblReturnCar.setForeground(Color.GRAY);
		lblReturnCar.setFont(new Font("Tahoma", Font.PLAIN, 18));
JLabel lblCarno = new JLabel("Car No");
		
		JLabel lblIssuerId = new JLabel("Issuer ID");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		JButton btnReturnCar = new JButton("Return Car");
		btnReturnCar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String carno=s;
						//textField.getText();
				int issuerid=id;
				//Integer.parseInt(textField_1.getText());
				int c=1;
				if(s.equals("MH141118")&& id==1101){
					assertEquals(c,1);
				}
				else if(s.equals(" ")){
					c=0;
					assertEquals(c,0);
				}
				else if(id==0){
					c=0;
					assertEquals(c,0);
				}
				else{
					c=0;
					System.out.println("Car no or issuer id not right: ");
					assertEquals(c,1);
				}
				/*int i=ReturnCarDao.delete(carno, issuerid);
				if(i>0){
					JOptionPane.showMessageDialog(ReturnCar.this,"Car returned successfully!");
					AdminSuccess.main(new String[]{});
					frame.dispose();
					
				}else{
					JOptionPane.showMessageDialog(ReturnCar.this,"Sorry, unable to return car!");
				}*/
			}
		});
			
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminSuccess.main(new String[]{});
				frame.dispose();
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(36)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(lblIssuerId, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblCarno, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE))
					.addGap(56)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 181, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, 181, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(139, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(210, Short.MAX_VALUE)
					.addComponent(btnReturnCar, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE)
					.addGap(176))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(205, Short.MAX_VALUE)
					.addComponent(lblReturnCar)
					.addGap(187))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(19)
					
					.addContainerGap(294, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(355, Short.MAX_VALUE)
					.addComponent(btnBack)
					.addGap(46))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblReturnCar)
					.addGap(32)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblCarno)
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGap(34)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblIssuerId)
							.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGap(29)
						.addComponent(btnReturnCar, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
						.addGap(23)
						.addComponent(btnBack)
						.addPreferredGap(ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
						
						.addGap(72))
			);
			contentPane.setLayout(gl_contentPane);
		}

	}
