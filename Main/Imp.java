package Main;

import java.util.Scanner;

import Controller.BankingController;
import View.TransactionEntity;

public class Imp {
	public void loginCon() {
		BankingController bc=new BankingController();
		TransactionEntity te=new TransactionEntity();
	while(true) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("1.dept");
		System.out.println("2.with");
		System.out.println("3.checkBalance");
		System.out.println("choose one opt");
		int n=sc.nextInt();
		switch(n) {
		case 1:{
			bc.dept();
			break;
		}
		case 2:{
			bc.with();
			break;
		}
		case 3:{
			bc.Balance();
			break;
		}
		}
	}
	}
}
