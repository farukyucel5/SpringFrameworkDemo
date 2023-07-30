package com.springDemo;

public class CustomerManager implements ICustomerService{
	IcustomerDal customerDal;
	

	
	 
	public CustomerManager(IcustomerDal customerDal) {
		this.customerDal = customerDal;
	}


	public void add() {
		//conditions
		customerDal.add();
	}

}
