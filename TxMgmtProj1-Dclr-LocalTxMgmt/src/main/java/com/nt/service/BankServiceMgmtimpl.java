package com.nt.service;

import com.nt.dao.Bankimpl;

public class BankServiceMgmtimpl implements IBankServiceMgmt {
	
	//injection dao
	private Bankimpl dao;
	public BankServiceMgmtimpl(Bankimpl dao) {
		this.dao = dao;
	}


	@Override
	public boolean transferMoney(long srcAcc, long destAcc, double balance) {
		int count1,count2=0;
//local TxMgmt one single Resource
		count1=dao.withdraw(srcAcc, balance);
		count2=dao.deposite(destAcc, balance);
	if(count1==0||count2==0)
		throw new IllegalArgumentException("check the Acc details");
	else
		return true;
	}

}
