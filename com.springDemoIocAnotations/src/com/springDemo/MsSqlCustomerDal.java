package com.springDemo;

import org.springframework.stereotype.Component;

@Component("database")
public class MsSqlCustomerDal implements IcustomerDal{

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
