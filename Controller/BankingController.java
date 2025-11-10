package Controller;

import java.util.Scanner;

import Main.Imp;
import Model.BankingModel;
import View.BankingEntity;
import View.TransactionEntity;

public class BankingController implements BankingModel {
	//double b = 300;
	Scanner sc = new Scanner(System.in);
	BankingEntity e = new BankingEntity();
	Imp i = new Imp();

	@Override
	public void Login() {
		// TODO Auto-generated method stub
		System.out.println("Enter Email");
		String email = sc.nextLine();
		System.out.println("Enter Password");
		String pass = sc.nextLine();
		if (e.getEmail().equals(email) && e.getPassword().equals(pass)) {
			i.loginCon();
			return;
		} else {
			System.out.println("check email and pass");
		}

	}

	@Override
	public void Register() {
		System.out.println("Enter Email");
		e.setEmail(sc.nextLine());
		System.out.println("Enter UserName");
		e.setUsername(sc.nextLine());
		System.out.println("Enter Password");
		e.setPassword(sc.nextLine());
		System.out.println("register succ");
		return;
		// TODO Auto-generated method stub

	}

	TransactionEntity te = new TransactionEntity();

	@Override
	public void dept() {
		// TODO Auto-generated method stub
		double t = te.getBal();
		//System.out.println(t);
		System.out.println("Enter dept Amount");

		double d = sc.nextDouble();
		t = t + d;
		te.setBal(t);
		//System.out.println(te.getBal());
		

	}

	@Override
	public void with() {
		// TODO Auto-generated method stub
		double b=te.getBal();
		System.out.println("enter amount");
		double s = sc.nextDouble();
		b = b - s;
		te.setBal(b);
		//System.out.println(b);
	}

	@Override
	public void Balance() {
		System.out.println(te.getBal());
		// TODO Auto-generated method stub

	}

}
