package main;

import java.sql.Date;

public class SalaryTable extends Company{
	private int salaryLv; // 급여 등급
	private int salary; // 급여
	
	public SalaryTable() {}
	public SalaryTable(String name, String rrn, char gender, String nationality, String address, String phone,
			String email) {
		super(name, rrn, gender, nationality, address, phone, email);
	}
	public SalaryTable(String corName, String deptNo, int salaryLv, String comLocation, String rank) {
		super(corName, deptNo, salaryLv, comLocation, rank);
	}
	public SalaryTable(String goal, Date goalStart, Date goalEnd) {
		super(goal, goalStart, goalEnd);
	}
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
	
	
}
