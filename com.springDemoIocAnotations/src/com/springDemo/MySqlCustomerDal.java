package com.springDemo;

import org.springframework.beans.factory.annotation.Value;

public class MySqlCustomerDal implements IcustomerDal {
	@Value("${MySqldatabase.connectionString}")
    String connectionString;
	
	public String getConnectionString() {
		return connectionString;
		
	}

	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}

	@Override
	public void add() {
		System.out.println("It has been inserted into the MySql database");
		System.out.println("The connection String:  "+connectionString );
		
	}

}
