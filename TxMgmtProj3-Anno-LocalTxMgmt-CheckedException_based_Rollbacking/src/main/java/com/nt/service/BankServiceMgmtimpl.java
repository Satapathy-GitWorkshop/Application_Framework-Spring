package com.nt.service;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.nt.dao.Bankimpl;


@Service("bankservice")
public class BankServiceMgmtimpl implements IBankServiceMgmt {
	
	@Autowired
	private Bankimpl dao;
	
	@Override
	//Applying TxMgmt service
	@Transactional(propagation=Propagation.REQUIRED,readOnly = false,timeout = 10,rollbackFor =  java.sql.SQLException.class)
	public boolean transferMoney(long srcAcc, long destAcc, double balance) throws SQLException {
		int count1,count2=0;
//local TxMgmt one single Resource
		count1=dao.withdraw(srcAcc, balance);
		count2=dao.deposite(destAcc, balance);
	if(count1==0||count2==0)
	    throw new SQLException("Problem in money transffering");
	else
		return true;
	}

}
