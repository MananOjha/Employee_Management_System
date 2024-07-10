package com.handle.employees;

public class Employee {
	private final Integer eId;
	
	private String eName;
	private Long ePhone;
	private String eEmail;
	private Double eSalary;
	private String designation;
	private Double exp;
	private Boolean isEligibleForBonus;

	public Employee(Integer eId, String eName, Long ePhone, String eEmail, Double eSalary, String designation,
			Double exp, Boolean isEligibleForBonus) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.ePhone = ePhone;
		this.eEmail = eEmail;
		this.eSalary = eSalary;
		this.designation = designation;
		this.exp = exp;
		this.isEligibleForBonus = isEligibleForBonus;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public Long getePhone() {
		return ePhone;
	}
	public void setePhone(Long ePhone) {
		this.ePhone = ePhone;
	}
	public String geteEmail() {
		return eEmail;
	}
	public void seteEmail(String eEmail) {
		this.eEmail = eEmail;
	}
	public Double geteSalary() {
		return eSalary;
	}
	public void seteSalary(Double eSalary) {
		this.eSalary = eSalary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public Double getExp() {
		return exp;
	}
	public void setExp(Double exp) {
		this.exp = exp;
	}
	public Boolean getIsEligibleForBonus() {
		return isEligibleForBonus;
	}
	public void setIsEligibleForBonus(Boolean isEligibleForBonus) {
		this.isEligibleForBonus = isEligibleForBonus;
	}
	public Integer geteId() {
		return eId;
	}
	
	public int hashCode() {
		return this.eId;
	}
	
	public boolean equals(Object arg) {
		return this.hashCode() == arg.hashCode();
	}
}
