package main;

import java.sql.Date;

public class UniDepartment extends University{
	private String uniDeptName; // 학과명
	private int tuition; // 등록금
	private int deptExpense; //학과비
	private String uniDeptNo; // 학과 코드
	private Date createDt; // 생성일
	private Date updateDt; // 수정일
	
	public UniDepartment() {}
	public UniDepartment(String ccode, String goal, Date goalStart, Date goalEnd) {
		super(ccode, goal, goalStart, goalEnd);
	}
	public UniDepartment(String uniName, String uniAddress, double empRate, int stuCnt, int noGraduateCnt,
			double adRate, double domRate, double graPointAvg, Date createDt, Date updateDt) {
		super(uniName, uniAddress, empRate, stuCnt, noGraduateCnt, adRate, domRate, graPointAvg, createDt, updateDt);
	}
	public UniDepartment(String pCode, String name, String rrn, String nationality, String postCode, String address,
			String phone, String email, String jobCode, double height, double weight, Date createDt, Date updateDt) {
		super(pCode, name, rrn, nationality, postCode, address, phone, email, jobCode, height, weight, createDt, updateDt);
	}
	public UniDepartment(String uniDeptName, int tuition, int deptExpense, String uniDeptNo) {
		super();
		this.uniDeptName = uniDeptName;
		this.tuition = tuition;
		this.deptExpense = deptExpense;
		this.uniDeptNo = uniDeptNo;
	}
	public String getUniDeptName() {
		return uniDeptName;
	}
	public void setUniDeptName(String uniDeptName) {
		this.uniDeptName = uniDeptName;
	}
	public int getTuition() {
		return tuition;
	}
	public void setTuition(int tuition) {
		this.tuition = tuition;
	}
	public int getDeptExpense() {
		return deptExpense;
	}
	public void setDeptExpense(int deptExpense) {
		this.deptExpense = deptExpense;
	}
	public String getuniDeptNo() {
		return uniDeptNo;
	}
	public void setuniDeptNo(String uniDeptNo) {
		this.uniDeptNo = uniDeptNo;
	}
	public String getUniDeptNo() {
		return uniDeptNo;
	}
	public void setUniDeptNo(String uniDeptNo) {
		this.uniDeptNo = uniDeptNo;
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
