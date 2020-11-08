package main;

import java.sql.Date;

public class ProfessorInfo extends UniDepartment{
	private String professorNo; // 교수번호
	private String uniDeptNo; // 학과코드
	private String teacher; // 교원(전임,초빙,겸임,시간강사)
	private Date createDt; // 생성일
	private Date updateDt; // 수정일

	public ProfessorInfo() {}
	public ProfessorInfo(String uniDeptName, int tuition, int deptExpense, String uniDeptNo) {
		super(uniDeptName, tuition, deptExpense, uniDeptNo);
	}
	public ProfessorInfo(String ccode, String goal, Date goalStart, Date goalEnd) {
		super(ccode, goal, goalStart, goalEnd);
	}
	public ProfessorInfo(String uniName, String uniAddress, double empRate, int stuCnt, int noGraduateCnt,
			double adRate, double domRate, double graPointAvg, Date createDt, Date updateDt) {
		super(uniName, uniAddress, empRate, stuCnt, noGraduateCnt, adRate, domRate, graPointAvg, createDt, updateDt);
	}
	public ProfessorInfo(String pCode, String name, String rrn, String nationality, String postCode, String address,
			String phone, String email, String jobCode, double height, double weight, Date createDt, Date updateDt) {
		super(pCode, name, rrn, nationality, postCode, address, phone, email, jobCode, height, weight, createDt, updateDt);
	}
	public ProfessorInfo(String professorNo, String uniDeptNo, String teacher, Date createDt, Date updateDt) {
		super();
		this.professorNo = professorNo;
		this.uniDeptNo = uniDeptNo;
		this.teacher = teacher;
		this.createDt = createDt;
		this.updateDt = updateDt;
	}
	public String getProfessorNo() {
		return professorNo;
	}
	public void setProfessorNo(String professorNo) {
		this.professorNo = professorNo;
	}
	public String getuniDeptNo() {
		return uniDeptNo;
	}
	public void setuniDeptNo(String uniDeptNo) {
		this.uniDeptNo = uniDeptNo;
	}
	public String getTeacher() {
		return teacher;
	}
	public void setTeacher(String teacher) {
		this.teacher = teacher;
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
