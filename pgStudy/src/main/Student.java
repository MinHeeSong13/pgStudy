package main;

public class Student extends UniDepartment {
	private String studentNo; // 학번
	private String professorNo; // 지도교수번호
	private String deptNo; // 학과 코드
	private String graduateYn; // 졸업 여부
	private String absenceYn; // 휴학 여부
	private String returnYn; // 복학 여부
	private int totalPoint; // 총평점
	private int currentPoint; // 현재 학점
	private char clubYn; // 동아리 가입 여부
	private String[] joinClub; // 가입한 동아리
	private char tutionPayYn; // 등록금 납부 여부
	
	public Student(String uniDeptName, int tuition, int deptExpense, String deptNo, String studentNo,
			String professorNo, String deptNo2, String graduateYn, String absenceYn, String returnYn, int totalPoint,
			int currentPoint, char clubYn, String[] joinClub, char tutionPayYn) {
		super(uniDeptName, tuition, deptExpense, deptNo);
		this.studentNo = studentNo;
		this.professorNo = professorNo;
		deptNo = deptNo2;
		this.graduateYn = graduateYn;
		this.absenceYn = absenceYn;
		this.returnYn = returnYn;
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
	public String getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(String deptNo) {
		this.deptNo = deptNo;
	}
	public String getGraduateYn() {
		return graduateYn;
	}
	public void setGraduateYn(String graduateYn) {
		this.graduateYn = graduateYn;
	}
	public String getAbsenceYn() {
		return absenceYn;
	}
	public void setAbsenceYn(String absenceYn) {
		this.absenceYn = absenceYn;
	}
	public String getReturnYn() {
		return returnYn;
	}
	public void setReturnYn(String returnYn) {
		this.returnYn = returnYn;
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
