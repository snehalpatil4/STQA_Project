package Jtesting;

import java.awt.BorderLayout;

import javax.swing.*;

public class ViewCars extends JFrame {
	JFrame view;
public static void main(String args[]){
	new ViewCars();
}
public ViewCars(){
		JFrame frame  = new JFrame("View cars Available");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 400);
		JPanel panel = new JPanel();
		JLabel b1;
		b1 = new JLabel("Below cars are available");
		DefaultListModel<String> l = new DefaultListModel< >();
		l.addElement("car_no: MH141118  model: Swift  Rent: 1000/day");
		l.addElement("car_no: MH125319  model: Indica Rent: 500/day");
		l.addElement("car_no: MH141468  model: Ritz   Rent: 700/day");	
		l.addElement("car_no: MH147188  model: i10    Rent: 800/day");
		l.addElement("car_no: MH141418  model: i20	  Rent: 1200/day ");
		JList<String> b = new JList< >(l);
		panel.add(b1);
		panel.add(b);
		frame.getContentPane().add(BorderLayout.PAGE_START,panel);
		frame.getContentPane().add(BorderLayout.PAGE_START,b1);
		frame.getContentPane().add(BorderLayout.CENTER,b);
		frame.setVisible(true);
			
}
}
