package main;

import java.sql.Date;

public class SalaryTable extends EmployeeInfo{
	private int salaryLv; // 급여 등급
	private int salary; // 급여
	private Date createDt; // 생성일
	private Date updateDt; // 수정일
	
	public SalaryTable() {}
	
	public SalaryTable(int salaryLv, int salary) {
		super();
		this.salaryLv = salaryLv;
		this.salary = salary;
	}
	public int getSalaryLv() {
		return salaryLv;
	}
	public void setSalaryLv(int salaryLv) {
		this.salaryLv = salaryLv;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Date getCreateDt() {
		return createDt;
	}
	public void setCreateDt(Date createDt) {
		this.createDt = createDt;
	}
	public Date getUpdateDt() {
		return updateDt;
	}
	public void setUpdateDt(Date updateDt) {
		this.updateDt = updateDt;
	}
}
