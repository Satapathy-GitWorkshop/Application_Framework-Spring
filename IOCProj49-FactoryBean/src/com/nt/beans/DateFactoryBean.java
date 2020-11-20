package com.nt.beans;

import java.time.LocalDate;

import org.springframework.beans.factory.FactoryBean;

public class DateFactoryBean implements FactoryBean<LocalDate> {
	private int year;
	private int month;
	private int day;
	
	

	public DateFactoryBean(int year, int month, int day) {
		System.out.println("DateFactoryBean 3 param Constructor");
		this.year = year;
		this.month = month;
		this.day = day;
	}

	@Override
	public LocalDate getObject() throws Exception {
		System.out.println("DateFactoryBean.getObject()");
		return LocalDate.of(year, month, day);
	}

	@Override
	public Class<?> getObjectType() {
		// TODO Auto-generated method stub
		return LocalDate.class;
	}
	@Override
	public boolean isSingleton() {
		System.out.println("DateFactoryBean.isSingleton()");
		return true;
	}
}
