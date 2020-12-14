package com.nt.dao;

public interface IBank {
   public int withdraw(long accno,double balance);
   public int deposite(long account,double balance);
}
