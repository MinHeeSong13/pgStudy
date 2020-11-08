package main;

import java.sql.Date;

public class EmployeeInfo extends Department{
	private String empNo; // 사번
	private String deptNo; // 부서 코드
	private String rank; // 직급
	private int salaryLv; // 급여 등급
	private Date createDt; // 생성일
	private Date updateDt; // 수정일
	
	public EmployeeInfo() {}
	public EmployeeInfo(String ccode, String goal, Date goalStart, Date goalEnd) {
		super(ccode, goal, goalStart, goalEnd);
	}
	public EmployeeInfo(String corName, String comAddress, int capAmount, int anRevenue, int empCnt, String comType,
			Date createDt, Date updateDt) {
		super(corName, comAddress, capAmount, anRevenue, empCnt, comType, createDt, updateDt);
	}
	public EmployeeInfo(String deptNo, String deptName, int deptCnt, String asTask, Date createDt, Date updateDt) {
		super(deptNo, deptName, deptCnt, asTask, createDt, updateDt);
	}
	public EmployeeInfo(String pCode, String name, String rrn, String nationality, String postCode, String address,
			String phone, String email, String jobCode, double height, double weight, Date createDt, Date updateDt) {
		super(pCode, name, rrn, nationality, postCode, address, phone, email, jobCode, height, weight, createDt, updateDt);
	}
	public EmployeeInfo(String empNo, String deptNo, String rank, int salaryLv, Date createDt, Date updateDt) {
		super();
		this.empNo = empNo;
		this.deptNo = deptNo;
		this.rank = rank;
		this.salaryLv = salaryLv;
		this.createDt = createDt;
		this.updateDt = updateDt;
	}
	public String getEmpNo() {
		return empNo;
	}
	public void setEmpNo(String empNo) {
		this.empNo = empNo;
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
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
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
