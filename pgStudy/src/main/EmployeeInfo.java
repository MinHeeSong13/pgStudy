package main;

public class EmployeeInfo extends Department{
	private String empNo; // 사번
	private String deptNo; // 부서 코드
	private int salaryLv; // 급여 등급
	private String rank; // 직급
	
	public EmployeeInfo() {}
	public EmployeeInfo(String deptName, int deptCnt, String asTask) {
		super(deptName, deptCnt, asTask);
	}
	public EmployeeInfo(String deptNo, String deptName, int deptCnt, String asTask) {
		super(deptNo, deptName, deptCnt, asTask);
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
	
	
}
