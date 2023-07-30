package com.springDemo;

import org.springframework.beans.factory.annotation.Value;


public class MsSqlCustomerDal implements IcustomerDal{
    
	@Value("${MsSqldatabase.connectionString}")
    String connectionString;
	
	public String getConnectionString() {
		return connectionString;
	}

	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}

	@Override
	public void add() {
		System.out.println("it has been inserted into the MsSql database");
		System.out.println("The connection String:  "+connectionString );
		
	}
	

}
