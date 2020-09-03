package com.nt.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//Configure Target Class as SpringBean
@Component("cust")
//@Component(value = "cust")
public class Customer {

//Inject Dependent Values to Target bean
	@Autowired   //by default is byType
//	@Qualifier( value = "state")    to solve ambiguity error
private Bank bank;
//Business method
public void Transaction() {
	bank.deposite();
	bank.withdraw();
}
}
