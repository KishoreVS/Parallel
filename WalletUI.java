package com.wallet.ui;

import java.util.Random;
import java.util.Scanner;

import com.wallet.bean.WalletBean;
import com.wallet.service.WalletService;

public class WalletUI {
public static void main(String[] args) {
	int ch;
	char c;
	
	WalletService ws=new WalletService();
	do
	{
		
	System.out.println("************\tXYZ WALLET APPLICATION\t*************");
	System.out.println("1.Create Account");
	System.out.println("2.Balance Enquiry");
	System.out.println("3.Deposit");
	System.out.println("4.Withdrawal");
	System.out.println("5.Fund Transfer");
	System.out.println("6.Print Transactions");
	System.out.println("Enter your choice");
	Scanner s=new Scanner(System.in);
	ch=s.nextInt();
	switch(ch)
	{
	case 1:
	{	System.out.println("Enter your name:");
		String name=s.next();
		System.out.println("Enter your mobile number:");
		String num=s.next();
		Integer r=getRandomNumberInRange(32312,525253);
		String accNo=r.toString();
		System.out.println("Enter amount to create Account");
		double balance=s.nextDouble();
		WalletBean wbCreateAccount=new WalletBean(accNo,name,num,balance);
		System.out.println("Account Creation Complete ");
		System.out.println("Account Details\n_________________\nAccount Number:"+accNo);
		System.out.println("Account Holder Name:"+name);
		System.out.println("Balance:"+balance);
		ws.createAccount(wbCreateAccount);
	}
	case 2:
	{	System.out.println("Enter your Account Number:");
		String accNo=s.next();
		ws.balanceEnquiry(accNo);
	}
	case 3:
	{	System.out.println("Enter your Account Number:");
		String accNo=s.next();
		System.out.println("Enter deposit Amount");
		double dep=s.nextDouble();
		ws.deposit(accNo,dep);
	}
	case 4:
	{	System.out.println("Enter your Account Number:");
		String accNo=s.next();
		System.out.println("Enter Withdrawal Amount");
		double wAmt=s.nextDouble();
		ws.withdrawal(accNo,wAmt);
	}
	case 5:
	{	System.out.println("Enter your Account Number:");
		String accNo=s.next();
		System.out.println("Enter Receipent's Account Number");
		String ran=s.next();
		System.out.println("Enter Transfer Amount");
		double tAmt=s.nextDouble();
		ws.transfer(accNo,ran,tAmt);
	}
	case 6:
	{
		ws.miniStatement();
	}
	default:
		System.out.println("Exitting Application");
		System.exit(0);
	}
	System.out.println("Do you want to continue(y/n)");
	c=s.next().charAt(0);
	if(c=='y'||c=='Y')
		continue;
	else
		System.out.println("Exiting from Wallet Application");
		
		
}while(ch!=6);
}

private static int getRandomNumberInRange(int min, int max) 
{

	Random r = new Random();
	return r.nextInt((max - min) + 1) + min;
}
