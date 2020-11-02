package main;

public class Department extends Job{
	private String deptName; // 부서명
	private int deptCnt; // 부서 인원
	private String asTask; // 담당업무
	
	public Department() {}
	public Department(String name, String rrn, char gender, String nationality, String address, String phone,
			String email) {
		super(name, rrn, gender, nationality, address, phone, email);
	}
	public Department(String jobName, String corName, String salary, String comLocation, String rank) {
		super(jobName, corName, salary, comLocation, rank);	}
	public Department(String goal) {
		super(goal);
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
	
	

}
