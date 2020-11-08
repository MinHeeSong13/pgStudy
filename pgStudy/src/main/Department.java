package main;

import java.sql.Date;

public class Department extends Company{
	private String deptNo; // 부서코드
	private String deptName; // 부서명
	private int deptCnt; // 부서 인원
	private String asTask; // 담당업무
	private Date createDt; // 생성일
	private Date updateDt; // 수정일
	
	public Department() {}
	public Department(String ccode, String goal, Date goalStart, Date goalEnd) {
		super(ccode, goal, goalStart, goalEnd);
	}
	public Department(String corName, String comAddress, int capAmount, int anRevenue, int empCnt, String comType,
			Date createDt, Date updateDt) {
		super(corName, comAddress, capAmount, anRevenue, empCnt, comType, createDt, updateDt);
	}
	public Department(String pCode, String name, String rrn, String nationality, String postCode, String address,
			String phone, String email, String jobCode, double height, double weight, Date createDt, Date updateDt) {
		super(pCode, name, rrn, nationality, postCode, address, phone, email, jobCode, height, weight, createDt, updateDt);
	}
	public Department(String deptNo, String deptName, int deptCnt, String asTask, Date createDt, Date updateDt) {
		super();
		this.deptNo = deptNo;
		this.deptName = deptName;
		this.deptCnt = deptCnt;
		this.asTask = asTask;
		this.createDt = createDt;
		this.updateDt = updateDt;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public int getDeptCnt() {
		return deptCnt;
	}
	public void setDeptCnt(int deptCnt) {
		this.deptCnt = deptCnt;
	}
	public String getAsTask() {
		return asTask;
	}
	public void setAsTask(String asTask) {
		this.asTask = asTask;
	}
	public String getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(String deptNo) {
		this.deptNo = deptNo;
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
