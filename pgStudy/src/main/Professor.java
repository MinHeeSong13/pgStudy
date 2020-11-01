package main;

public class Professor extends UniDepartment{
	private String professorNo;
	private String deptNo;
	private String teacher; // 교원(전임,초빙,겸임,시간강사)

	public Professor(String uniDeptName, int tuition, int deptExpense, String deptNo) {
		super(uniDeptName, tuition, deptExpense, deptNo);
	}

	public Professor(String uniDeptName, int tuition, int deptExpense, String deptNo, String professorNo,
			String deptNo2, String teacher) {
		super(uniDeptName, tuition, deptExpense, deptNo);
		this.professorNo = professorNo;
		deptNo = deptNo2;
		this.teacher = teacher;
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

	public String getTeacher() {
		return teacher;
	}

	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}
	

}
