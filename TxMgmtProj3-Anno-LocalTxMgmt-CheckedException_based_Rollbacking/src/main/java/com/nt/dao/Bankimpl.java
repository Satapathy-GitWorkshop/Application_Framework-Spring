package com.nt.dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("bank")
public class Bankimpl implements IBank {
     private static final String withdarw_query="update  bankaccount set balance=balance-? where accno=?";
     private static final String deposite_query="update  bankaccount set balance=balance+? where accno=?";
    
   @Autowired
     private JdbcTemplate jt;


	@Override
	public int withdraw(long accno, double balance) {
		//withdraw logic 
		int retval=jt.update(withdarw_query,balance,accno);
		System.out.println(retval);
		return retval;
	}

	@Override
	public int deposite(long accno, double balance) {
		//deposite money  logic 
				int retval=jt.update(deposite_query,balance,accno);
				System.out.println(retval);
				return retval;
	}

}//class
