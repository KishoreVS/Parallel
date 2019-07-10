package com.wallet.dao;

 class AccountNotFoundException extends Exception {
	 public AccountNotFoundException(final String msg)
	 {
		System.out.println("Enter valid account details");
	 }
}
