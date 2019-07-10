package com.wallet.service;

import java.util.ArrayList;

import com.wallet.bean.Transactions;
import com.wallet.bean.WalletBean;

public interface WalletServiceI {
	public WalletBean createAccount(WalletBean wbCreateAccount) ;
	public double balanceEnquiry(String accNo);
	public double deposit(String accNo,double dep);
	public double withdrawal(String accNo,double wAmt);
	public double transfer(String accNo,String ran,double tAmt);
	public ArrayList<Transactions> miniStatement(String accNo);
	
}