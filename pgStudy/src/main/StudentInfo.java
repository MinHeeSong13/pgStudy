package main;

import java.sql.Date;
import java.util.List;

public class StudentInfo extends UniDepartment {
	private String studentNo; // 학번
	private String professorNo; // 지도교수번호
	private String uniDeptNo; // 학과 코드
	private RegisterYn registerYn; // 재학 여부
	private int totalPoint; // 총평점
	private int currentPoint; // 현재 학점
	private char clubYn; // 동아리 가입 여부
	private char tutionPayYn; // 등록금 납부 여부
	private Date createDt; // 생성일
	private Date updateDt; // 수정일
	
	public StudentInfo() {}
	public StudentInfo(String uniDeptName, int tuition, int deptExpense, String uniDeptNo) {
		super(uniDeptName, tuition, deptExpense, uniDeptNo);
	}
	public StudentInfo(String ccode, String goal, Date goalStart, Date goalEnd) {
		super(ccode, goal, goalStart, goalEnd);
	}
	public StudentInfo(String uniName, String uniAddress, double empRate, int stuCnt, int noGraduateCnt, double adRate,
			double domRate, double graPointAvg, Date createDt, Date updateDt) {
		super(uniName, uniAddress, empRate, stuCnt, noGraduateCnt, adRate, domRate, graPointAvg, createDt, updateDt);
	}
	public StudentInfo(String pCode, String name, String rrn, String nationality, String postCode, String address,
			String phone, String email, String jobCode, double height, double weight, Date createDt, Date updateDt) {
		super(pCode, name, rrn, nationality, postCode, address, phone, email, jobCode, height, weight, createDt, updateDt);
	}
	public StudentInfo(String studentNo, String professorNo, String uniDeptNo, RegisterYn registerYn, int totalPoint,
			int currentPoint, char clubYn, char tutionPayYn, Date createDt, Date updateDt) {
		super();
		this.studentNo = studentNo;
		this.professorNo = professorNo;
		this.uniDeptNo = uniDeptNo;
		this.registerYn = registerYn;
		this.totalPoint = totalPoint;
		this.currentPoint = currentPoint;
		this.clubYn = clubYn;
		this.tutionPayYn = tutionPayYn;
		this.createDt = createDt;
		this.updateDt = updateDt;
	}
	public String getStudentNo() {
		return studentNo;
	}
	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
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
	public int getTotalPoint() {
		return totalPoint;
	}
	public void setTotalPoint(int totalPoint) {
		this.totalPoint = totalPoint;
	}
	public int getCurrentPoint() {
		return currentPoint;
	}
	public void setCurrentPoint(int currentPoint) {
		this.currentPoint = currentPoint;
	}
	public char getClubYn() {
		return clubYn;
	}
	public void setClubYn(char clubYn) {
		this.clubYn = clubYn;
	}
	public char getTutionPayYn() {
		return tutionPayYn;
	}
	public void setTutionPayYn(char tutionPayYn) {
		this.tutionPayYn = tutionPayYn;
	}
	public String getUniDeptNo() {
		return uniDeptNo;
	}
	public void setUniDeptNo(String uniDeptNo) {
		this.uniDeptNo = uniDeptNo;
	}
	public RegisterYn getRegisterYn() {
		return registerYn;
	}
	public void setRegisterYn(RegisterYn registerYn) {
		this.registerYn = registerYn;
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
