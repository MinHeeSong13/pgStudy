package main;

public class StudentInfo extends UniDepartment {
	private String studentNo; // 학번
	private String professorNo; // 지도교수번호
	private String uniDeptNo; // 학과 코드
	@SuppressWarnings("unused")
	private enum registerYn{
		G,A,R // G : 졸업, A : 휴학, R : 재학
	}
	private int totalPoint; // 총평점
	private int currentPoint; // 현재 학점
	private char clubYn; // 동아리 가입 여부
	private String[] joinClub; // 가입한 동아리
	private char tutionPayYn; // 등록금 납부 여부
	
	
	public StudentInfo(String uniDeptName, int tuition, int deptExpense, String uniuniDeptNo) {
		super(uniDeptName, tuition, deptExpense, uniuniDeptNo);
	}
	public StudentInfo(String uniDeptName, int tuition, int deptExpense, String uniuniDeptNo, String studentNo,
			String professorNo, String uniDeptNo, int totalPoint, int currentPoint, char clubYn, String[] joinClub,
			char tutionPayYn) {
		super(uniDeptName, tuition, deptExpense, uniuniDeptNo);
		this.studentNo = studentNo;
		this.professorNo = professorNo;
		this.uniDeptNo = uniDeptNo;
		this.totalPoint = totalPoint;
		this.currentPoint = currentPoint;
		this.clubYn = clubYn;
		this.joinClub = joinClub;
		this.tutionPayYn = tutionPayYn;
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
	public String[] getJoinClub() {
		return joinClub;
	}
	public void setJoinClub(String[] joinClub) {
		this.joinClub = joinClub;
	}
	public char getTutionPayYn() {
		return tutionPayYn;
	}
	public void setTutionPayYn(char tutionPayYn) {
		this.tutionPayYn = tutionPayYn;
	}
	
	
}
