package com.wallet.service;

public interface WalletServiceI {
	public void createAccount(WalletBean wbCreateAccount) ;
	public void balanceEnquiry(String accNo);
	public void deposit(String accNo,double dep);
	public void withdrawal(String accNo,double wAmt);
	public void transfer(String accNo,String ran,double tAmt);
	public void miniStatement();
}
