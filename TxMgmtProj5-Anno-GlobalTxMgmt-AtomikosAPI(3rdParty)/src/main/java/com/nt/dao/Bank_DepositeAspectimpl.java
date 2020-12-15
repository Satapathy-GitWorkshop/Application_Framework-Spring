package com.nt.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository("mysqldao")
public class Bank_DepositeAspectimpl implements IBank_DepositeAspect {
	private static final String deposite_query="update bank_account set balance=balance+? where accno=?";
	@Autowired
	@Qualifier("mysqljt")
	private JdbcTemplate mysqljt;	
	@Override
	public int Deposite(long accno, double balance) {
		int count =mysqljt.update(deposite_query,balance,accno);
		System.out.println(count);
		return count;
	}

}
