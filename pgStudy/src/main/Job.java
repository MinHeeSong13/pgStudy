package main;

public class Job extends Community{
	private String jobName; // 직업명
	private String corName; // 회사명
	private String salary; // 급여
	private String comLocation; // 회사위치
	private String rank; // 직급
	
	public Job() {}
	public Job(String name, String rrn, char gender, String nationality, String address, String phone, String email) {
		super(name, rrn, gender, nationality, address, phone, email);
	}
	public Job(String goal) {
		super(goal);
	}
	public Job(String jobName, String corName, String salary, String comLocation, String rank) {
		super();
		this.jobName = jobName;
		this.corName = corName;
		this.salary = salary;
		this.comLocation = comLocation;
		this.rank = rank;
	}
	public String getJobName() {
		return jobName;
	}
	public void setJobName(String jobName) {
		this.jobName = jobName;
	}
	public String getCorName() {
		return corName;
	}
	public void setCorName(String corName) {
		this.corName = corName;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getComLocation() {
		return comLocation;
	}
	public void setComLocation(String comLocation) {
		this.comLocation = comLocation;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	
	

}
