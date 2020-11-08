package main;

import java.sql.Date;

public class Community extends Person{
	private String ccode; // 공동체 코드
	private String goal; // 공동체의 목표
	private Date goalStart; // 목표 시작시간
	private Date goalEnd; // 목표 끝난 시간

	public Community() {}	
	public Community(String pCode, String name, String rrn, String nationality, String postCode, String address,
			String phone, String email, String jobCode, double height, double weight, Date createDt, Date updateDt) {
		super(pCode, name, rrn, nationality, postCode, address, phone, email, jobCode, height, weight, createDt, updateDt);
	}
	public Community(String ccode, String goal, Date goalStart, Date goalEnd) {
		super();
		this.ccode = ccode;
		this.goal = goal;
		this.goalStart = goalStart;
		this.goalEnd = goalEnd;
	}
	public String getCcode() {
		return ccode;
	}
	public void setCcode(String ccode) {
		this.ccode = ccode;
	}
	public String getGoal() {
		return goal;
	}
	public void setGoal(String goal) {
		this.goal = goal;
	}
	public Date getGoalStart() {
		return goalStart;
	}
	public void setGoalStart(Date goalStart) {
		this.goalStart = goalStart;
	}
	public Date getGoalEnd() {
		return goalEnd;
	}
	public void setGoalEnd(Date goalEnd) {
		this.goalEnd = goalEnd;
	}
	
}
