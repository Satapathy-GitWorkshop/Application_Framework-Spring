package com.nt.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("oradao")
public class Bank_WithDrawAspectimpl implements IBank_WithDrawAspect {
	private static final String withdraw_query="update bankaccount set balance=balance-? where accno=?";

	//fieldlevel injcetion of JdbcTemplate
	@Autowired
	@Qualifier("orajt")
	private JdbcTemplate orajt;	
	@Override
	public int Withdraw(long accno, double balance) {
		int count =orajt.update(withdraw_query,balance,accno);
		System.out.println(count);
		return count;
	}

}
