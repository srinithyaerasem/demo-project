package Main;

import java.util.Scanner;

import Controller.BankingController;

public class Main {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	BankingController bc=new BankingController();
	while(true) {
		System.out.println("1.Login");
		System.out.println("2.Register");
		System.out.println("choose one opt");
		int opt=sc.nextInt();
		switch(opt) {
		case 1:{
			bc.Login();
			
		}
		case 2:{
			bc.Register();
		}
		
		}
	}
}
}
