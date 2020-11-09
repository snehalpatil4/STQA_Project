package Jtesting;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import static org.junit.Assert.*;
public class AdminSuccess extends JFrame{
	static AdminSuccess frame;
	private JPanel contentPane;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new AdminSuccess();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public AdminSuccess() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 433);
		contentPane = new JPanel();
		contentPane.setForeground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblCarSection = new JLabel("Rental Cars Data");
		lblCarSection.setFont(new Font("Tahoma", Font.PLAIN, 22));
		
		JButton btnNewButton = new JButton("New Car");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			CarsForm.main(new String[]{});
			frame.dispose();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		JButton btnViewCars = new JButton("View Cars");
		btnViewCars.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewCars.main(new String[]{});
				frame.dispose();
			}
		});
		btnViewCars.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		JButton btnRentCar = new JButton("Rent Car");
		btnRentCar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RentCarForm.main(new String[]{});
				frame.dispose();
			}
		});
		/*JButton btnReturnCar = new JButton("Return Car");
		btnReturnCar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ReturnCar.main(new String[]{});
				frame.dispose();
			}
		});*/
		btnRentCar.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		
		JButton btnReturnCar = new JButton("Return Car");
		btnReturnCar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ReturnCar.main(new String[]{});
				frame.dispose();
			}
		});
		btnReturnCar.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap(81, Short.MAX_VALUE)
					.addComponent(lblCarSection)
					.addGap(54))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(132)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						
						.addComponent(btnReturnCar, GroupLayout.PREFERRED_SIZE, 191, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnRentCar, GroupLayout.PREFERRED_SIZE, 191, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnViewCars, GroupLayout.PREFERRED_SIZE, 191, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 191, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(101, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblCarSection)
					.addGap(18)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnViewCars, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnRentCar, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
					.addGap(18).addComponent(btnReturnCar, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					
					.addContainerGap(16, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}

}

