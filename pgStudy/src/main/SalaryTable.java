package main;

public class SalaryTable extends EmployeeInfo{
	private int salaryLv; // 급여 등급
	private int salary; // 급여
	
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
	
}
