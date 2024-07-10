package com.handle.employees;

public class ContractEmployee extends Employee{
	private Integer contractPeriod;
	
	

	public ContractEmployee(Integer eId, String eName, Long ePhone, String eEmail, Double eSalary, String designation,
			Double exp, Boolean isEligibleForBonus, Integer contractPeriod) {
		super(eId, eName, ePhone, eEmail, eSalary, designation, exp, isEligibleForBonus);
		this.contractPeriod = contractPeriod;
	}

	public Integer getContractPeriod() {
		return contractPeriod;
	}

	public void setContractPeriod(Integer contractPeriod) {
		this.contractPeriod = contractPeriod;
	}

	
	
	

}
