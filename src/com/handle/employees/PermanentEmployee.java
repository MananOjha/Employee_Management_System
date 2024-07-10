package com.handle.employees;

public class PermanentEmployee extends Employee{
	
	private Integer stocks;

	

	public PermanentEmployee(Integer eId, String eName, Long ePhone, String eEmail, Double eSalary, String designation,
			Double exp, Boolean isEligibleForBonus, Integer stocks) {
		super(eId, eName, ePhone, eEmail, eSalary, designation, exp, isEligibleForBonus);
		this.stocks = stocks;
	}

	public Integer getStocks() {
		return stocks;
	}

	public void setStocks(Integer stocks) {
		this.stocks = stocks;
	}
}
