package main;

public class Community extends Person{
	private String goal; // 공동체의 목표

	public Community() {}

	public Community(String name, String rrn, char gender, String nationality, String address, String phone,
			String email) {
		super(name, rrn, gender, nationality, address, phone, email);
	}

	public Community(String goal) {
		super();
		this.goal = goal;
	}

	public String getGoal() {
		return goal;
	}

	public void setGoal(String goal) {
		this.goal = goal;
	}
	
	

}
