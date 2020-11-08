package main;

import java.sql.Date;

public class Join extends StudentInfo{
	private String studentNo; // 학번
	private String clubNo; // 동아리 코드
	private Date joinDt; // 가입일
	private Date leaveDt; // 탈퇴일
	
	public Join() {}
	public Join(String uniDeptName, int tuition, int deptExpense, String uniDeptNo) {
		super(uniDeptName, tuition, deptExpense, uniDeptNo);
	}
	public Join(String ccode, String goal, Date goalStart, Date goalEnd) {
		super(ccode, goal, goalStart, goalEnd);
	}
	public Join(String uniName, String uniAddress, double empRate, int stuCnt, int noGraduateCnt, double adRate,
			double domRate, double graPointAvg, Date createDt, Date updateDt) {
		super(uniName, uniAddress, empRate, stuCnt, noGraduateCnt, adRate, domRate, graPointAvg, createDt, updateDt);
	}
	public Join(String studentNo, String professorNo, String uniDeptNo, RegisterYn registerYn, int totalPoint,
			int currentPoint, char clubYn, char tutionPayYn, Date createDt, Date updateDt) {
		super(studentNo, professorNo, uniDeptNo, registerYn, totalPoint, currentPoint, clubYn, tutionPayYn, createDt, updateDt);
	}
	public Join(String pCode, String name, String rrn, String nationality, String postCode, String address,
			String phone, String email, String jobCode, double height, double weight, Date createDt, Date updateDt) {
		super(pCode, name, rrn, nationality, postCode, address, phone, email, jobCode, height, weight, createDt, updateDt);
	}
	public Join(String studentNo, Date joinDt,String clubNo, Date leaveDt) {
		super();
		this.studentNo = studentNo;
		this.clubNo = clubNo;
		this.joinDt = joinDt;
		this.leaveDt = leaveDt;
	}
	public String getStudentNo() {
		return studentNo;
	}
	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}
	public String getClubNo() {
		return clubNo;
	}
	public void setClubNo(String clubNo) {
		this.clubNo = clubNo;
	}
	public Date getJoinDt() {
		return joinDt;
	}
	public void setJoinDt(Date joinDt) {
		this.joinDt = joinDt;
	}
	public Date getLeaveDt() {
		return leaveDt;
	}
	public void setLeaveDt(Date leaveDt) {
		this.leaveDt = leaveDt;
	}
}
