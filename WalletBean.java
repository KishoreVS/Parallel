package com.wallet.bean;

public class WalletBean {
	private String accNo;
		private String name;
		private String num;
		private double balance;
		private double dep;
		private double tAmt;

		public WalletBean(String accNo, String name, String num, double balance) {
			this.accNo=accNo;
			this.name=name;
			this.num=num;
			this.balance=balance;
		}
		//setters and getters
		public String getAccNo() {
			return accNo;
		}

		public void setAccNo(String accNo) {
			this.accNo = accNo;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getNum() {
			return num;
		}

		public void setNum(String num) {
			this.num = num;
		}

		public double getBalance() {
			return balance;
		}

		public void setBalance(double balance) {
			this.balance = balance;
		}


}
