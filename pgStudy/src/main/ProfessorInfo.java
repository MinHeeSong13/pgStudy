package main;

public class ProfessorInfo extends UniDepartment{
	private String professorNo; // 교수번호
	private String uniDeptNo; // 학과코드
	private String teacher; // 교원(전임,초빙,겸임,시간강사)

	public ProfessorInfo(String uniDeptName, int tuition, int deptExpense, String uniuniDeptNo) {
		super(uniDeptName, tuition, deptExpense, uniuniDeptNo);
	}
	public ProfessorInfo(String uniDeptName, int tuition, int deptExpense, String uniuniDeptNo, String professorNo,
			String uniDeptNo, String teacher) {
		super(uniDeptName, tuition, deptExpense, uniuniDeptNo);
		this.professorNo = professorNo;
		this.uniDeptNo = uniDeptNo;
		this.teacher = teacher;
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
	

}
