package com.wallet.service;

public class WalletService implements WalletServiceI {

	WalletDao wd=new WalletDao();
	@Override
	public void balanceEnquiry(String accNo) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deposit(String accNo, double dep) {
		// TODO Auto-generated method stub
	}
	@Override
	public void withdrawal(String accNo, double wAmt) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void transfer(String accNo, String ran, double tAmt) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void miniStatement() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void createAccount(WalletBean wbCreateAccount) {
		// TODO Auto-generated method stub
		
	}
}
