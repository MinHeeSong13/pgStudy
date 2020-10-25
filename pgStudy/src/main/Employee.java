package main;

import java.sql.Date;

public class Employee extends Department {
	
	private String empId;
	private String empName;
	private String empNo;
	private String email;
	private String phone;
	private int salary;
	private Date hireDate;
	private Date entDate;
	private String jobNo;
	
	public Employee() {
		super();
	}

	public Employee(String empId, String empName, String empNo, String email, String phone, int salary, Date hireDate,
			Date entDate, String jobNo) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empNo = empNo;
		this.email = email;
		this.phone = phone;
		this.salary = salary;
		this.hireDate = hireDate;
		this.entDate = entDate;
		this.jobNo = jobNo;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpNo() {
		return empNo;
	}

	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}

	public Date getEntDate() {
		return entDate;
	}

	public void setEntDate(Date entDate) {
		this.entDate = entDate;
	}

	public String getJobNo() {
		return jobNo;
	}

	public void setJobNo(String jobNo) {
		this.jobNo = jobNo;
	}
	
	
	
	

}
