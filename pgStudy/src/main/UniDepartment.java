package main;

public class UniDepartment extends University{
	private String uniDeptName; // 학과명
	private int tuition; // 등록금
	private int deptExpense; //학과비
	private String deptNo; // 학과 코드
	
	public UniDepartment(String uniDeptName, int tuition, int deptExpense, String deptNo) {
		super();
		this.uniDeptName = uniDeptName;
		this.tuition = tuition;
		this.deptExpense = deptExpense;
		this.deptNo = deptNo;
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
	public String getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(String deptNo) {
		this.deptNo = deptNo;
	}
	
	
}
