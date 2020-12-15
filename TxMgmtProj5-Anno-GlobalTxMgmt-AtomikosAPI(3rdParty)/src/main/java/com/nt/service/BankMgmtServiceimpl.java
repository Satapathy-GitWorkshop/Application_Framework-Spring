package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.nt.dao.Bank_DepositeAspectimpl;
import com.nt.dao.Bank_WithDrawAspectimpl;

@Service("bankService")
public class BankMgmtServiceimpl implements IBankMgmtService {
     @Autowired
	private Bank_WithDrawAspectimpl bwth;
      @Autowired
     private Bank_DepositeAspectimpl bdep;
      
	@Override
	//Applying  mode of TranasactionManagement 
	@Transactional(propagation = Propagation.REQUIRED,readOnly = false)
	public String transferMoney(long srcAcc, long destAcc, double balance) {
	int retval1=bwth.Withdraw(srcAcc, balance);
	int retval2=bdep.Deposite(destAcc, balance);

	//checking update query status
	if(retval1==0||retval2==0) 
		throw new IllegalArgumentException("Problem in MoneyTransfer");
	else 
				return "MoneyTransfered from "+srcAcc+" to"+destAcc;

	}		
}//class
