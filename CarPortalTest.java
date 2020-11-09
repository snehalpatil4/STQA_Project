package Jtesting;

import static org.junit.Assert.*;

import java.util.Scanner;

import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import org.junit.Test;

public class CarPortalTest {
	String s1=" ";
	String s2=" ";
	Scanner s=new Scanner(System.in);
	public static String value;
	@Test
	public void Return(){
		System.out.println("Enter car number");
		String car__no=s.next();
		System.out.println("Enter issuer id ");
		int issuer_id=s.nextInt();
	ReturnCar ad=new ReturnCar(car__no,issuer_id);	
}
	@Test
	public void Return_1(){
		String car__no=" ";
		int issuer_id=1101;
	ReturnCar ad=new ReturnCar(car__no,issuer_id);	
}
	@Test
	public void Return_2(){
		String car__no="MH141118";
		int issuer_id=0;
	ReturnCar ad=new ReturnCar(car__no,issuer_id);	
}
	@Test
	public void Rent(){
	System.out.println("Enter car number");
	String car_no=s.next();
	System.out.println("Enter name");
	String name_n=s.next();
	System.out.println("Enter issuer id ");
	int id_i=s.nextInt();
	System.out.println("Enter contact number");
	int cont_act=s.nextInt();
	RentCarForm ad=new RentCarForm(car_no,name_n,id_i,cont_act);	
}
	@Test
	public void Rent_2(){
	String car_no="MH123573";
	String name_n="Rahul";
	int id_i=0;
	int cont_act=237826;
	RentCarForm ad=new RentCarForm(car_no,name_n,id_i,cont_act);	
}
	@Test
	public void Rent_3(){
	String car_no="MH123573";
	String name_n=" ";
	int id_i=1101;
	int cont_act=237826;
	RentCarForm ad=new RentCarForm(car_no,name_n,id_i,cont_act);	
}
	@Test
	public void Rent_4(){
	String car_no=" ";
	String name_n="Riya";
	int id_i=1101;
	int cont_act=237826;
	RentCarForm ad=new RentCarForm(car_no,name_n,id_i,cont_act);	
}
	@Test
	public void Rent_5(){
	String car_no=" ";
	String name_n="Riya";
	int id_i=1101;
	int cont_act=0;
	RentCarForm ad=new RentCarForm(car_no,name_n,id_i,cont_act);	
}
	@Test
	public void Cars(){
		System.out.println("Enter car no: ");
		String cno=s.next();
		System.out.println("Enter chasis number ");
		String chasno=s.next();
		System.out.println("Enter name ");
		String name=s.next();
		System.out.println("Enter model ");
		String model=s.next();
		System.out.println("Enter capacity ");
		String capacity=s.next();
	CarsForm ad=new CarsForm(cno,chasno,name,model,capacity);	
}
	@Test
	public void Menu(){
	AdminSuccess ad=new AdminSuccess();	
	}
	@Test
	public void Login(){
		System.out.println("Enter UserId: \n Password: ");
		s1=s.next();
		s2=s.next();
	AdminLogin ad=new AdminLogin(s1,s2);	
}	
}
