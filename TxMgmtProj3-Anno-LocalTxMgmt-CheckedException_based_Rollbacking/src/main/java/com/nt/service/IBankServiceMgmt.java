package com.nt.service;

import java.sql.SQLException;

public interface IBankServiceMgmt {
public boolean transferMoney(long srcAcc,long destAcc,double balance) throws SQLException;
}
