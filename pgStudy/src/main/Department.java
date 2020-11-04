package main;

public class Department extends Company{
	private String deptNo; // 부서코드
	private String deptName; // 부서명
	private int deptCnt; // 부서 인원
	private String asTask; // 담당업무
	
	public Department() {}
	
	public Department(String deptNo, String deptName, int deptCnt, String asTask) {
		super();
		this.deptNo = deptNo;
		this.deptName = deptName;
		this.deptCnt = deptCnt;
		this.asTask = asTask;
	}
	public Department(String deptName, int deptCnt, String asTask) {
		super();
		this.deptName = deptName;
		this.deptCnt = deptCnt;
		this.asTask = asTask;
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
	
	

}
