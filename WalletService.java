package com.wallet.service;

import java.util.ArrayList;

import com.wallet.bean.Transactions;
import com.wallet.bean.WalletBean;
import com.wallet.dao.WalletDao;

public class WalletService implements WalletServiceI {

	WalletDao wd=new WalletDao();

	@Override
	public WalletBean createAccount(WalletBean wbCreateAccount) {
		return wd.createAccount(wbCreateAccount);
	}

	@Override
	public double balanceEnquiry(String accNo) {
		return wd.balanceEnquiry(accNo);
	}

	@Override
	public double deposit(String accNo, double dep) {
		return wd.deposit(accNo, dep);
	}

	@Override
	public double withdrawal(String accNo, double wAmt) {
		return wd.withdrawal(accNo, wAmt);
	}

	@Override
	public double transfer(String accNo, String ran, double tAmt) {
		return wd.transfer(accNo, ran, tAmt);
	}

	@Override
	public ArrayList<Transactions> miniStatement(String accNo) {
		return wd.miniStatement(accNo);
	
	}

	
	
}