package main;

import java.sql.Date;

public class Company extends Community{
	private String corName; // 회사명
	private String deptNo; // 부서코드
	private int salaryLv; // 급여 등급
	private String comLocation; // 회사위치
	private String rank; // 직급
	
	public Company() {}
	public Company(String name, String rrn, char gender, String nationality, String address, String phone,
			String email) {
		super(name, rrn, gender, nationality, address, phone, email);
	}
	
	public Company(String goal, Date goalStart, Date goalEnd) {
		super(goal, goalStart, goalEnd);
	}
	public Company(String corName, String deptNo, int salaryLv, String comLocation, String rank) {
		super();
		this.corName = corName;
		this.deptNo = deptNo;
		this.salaryLv = salaryLv;
		this.comLocation = comLocation;
		this.rank = rank;
	}
	public String getdeptNo() {
		return deptNo;
	}
	public void setdeptNo(String deptNo) {
		this.deptNo = deptNo;
	}
	public String getCorName() {
		return corName;
	}
	public void setCorName(String corName) {
		this.corName = corName;
	}
	public int getSalary() {
		return salaryLv;
	}
	public void setSalary(int salaryLv) {
		this.salaryLv = salaryLv;
	}
	public String getComLocation() {
		return comLocation;
	}
	public void setComLocation(String comLocation) {
		this.comLocation = comLocation;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	public String getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(String deptNo) {
		this.deptNo = deptNo;
	}
	public int getSalaryLv() {
		return salaryLv;
	}
	public void setSalaryLv(int salaryLv) {
		this.salaryLv = salaryLv;
	}

}
