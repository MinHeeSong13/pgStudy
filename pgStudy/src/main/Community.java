package main;

import java.sql.Date;

public class Community extends Person{
	private String goal; // 공동체의 목표
	private Date goalStart; // 목표 시작시간
	private Date goalEnd; // 목표 끝난 시간

	public Community() {}	
	public Community(String name, String rrn, String nationality, String postCode, String address, String phone,
			String email, String jobName, double height, double weight) {
		super(name, rrn, nationality, postCode, address, phone, email, jobName, height, weight);
	}
	public Community(String goal, Date goalStart, Date goalEnd) {
		super();
		this.goal = goal;
		this.goalStart = goalStart;
		this.goalEnd = goalEnd;
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
