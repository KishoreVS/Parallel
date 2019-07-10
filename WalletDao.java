package com.wallet.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.wallet.bean.Transactions;
import com.wallet.bean.WalletBean;

public class WalletDao implements WalletDaoI {
	WalletBean wb;
	HashMap <String,WalletBean> hm=new HashMap<String,WalletBean>();
	HashMap <Transactions,String> hm1=new HashMap<Transactions,String>();
	@Override
	public WalletBean createAccount(WalletBean wbCreateAccount) {
		hm.put(wbCreateAccount.getAccNo(), wbCreateAccount);
		WalletBean acc=(WalletBean) hm.get(wbCreateAccount.getAccNo());
		return acc;
	}
	@Override
	public double balanceEnquiry(String accNo) {
		wb=(WalletBean) hm.get(accNo);
		double bal=wb.getBalance();
		return bal;
	}
	@Override
	public double deposit(String accNo, double dep) {
		wb=(WalletBean) hm.get(accNo);
		double bal=wb.getBalance();
		bal=bal+dep;
		wb.setBalance(bal);
		hm.put(accNo,wb);
		Transactions ts=new Transactions();
		ts.setAccNoFrom(accNo);
		ts.setAccNoTo(accNo);
		ts.setAmt(dep);
		ts.setBalance(bal);
		ts.setTransId(1222);//dummy number
		ts.settType("Deposit");
		hm1.put(ts,accNo);
		return bal;
	}
	@Override
	public double withdrawal(String accNo, double wAmt) {
		wb=(WalletBean) hm.get(accNo);
		double bal=wb.getBalance();
		bal=bal-wAmt;
		wb.setBalance(bal);	
		hm.put(accNo, wb);
		Transactions ts=new Transactions();
		ts.setAccNoFrom(accNo);
		ts.setAccNoTo(accNo);
		ts.setAmt(wAmt);
		ts.setTransId(1222);
		ts.settType("Withdrawal");
		hm1.put(ts,accNo);
		return bal;
	}
	@Override
	public double transfer(String accNo, String ran, double tAmt) {
		wb=(WalletBean) hm.get(accNo);
		double bal=wb.getBalance();
		wb=(WalletBean) hm.get(ran);
		double bal1=wb.getBalance();
		bal=bal-tAmt;
		bal1=bal1+tAmt;
		wb.setBalance(bal);	
		hm.put(accNo, wb);
		wb.setBalance(bal1);	
		hm.put(ran, wb);Transactions ts=new Transactions();
		ts.setAccNoFrom(accNo);
		ts.setAccNoTo(ran);
		ts.setAmt(tAmt);
		ts.setBalance(bal);
		ts.setTransId(1222);//dummy
		ts.settType("Fund Transfer");
		hm1.put(ts,accNo);
		return bal;
	}
	@Override
	public ArrayList<Transactions> miniStatement(String accNo) {
		ArrayList<Transactions> ts=new ArrayList<>(hm1.keySet());
		return ts;
	}
	
}
