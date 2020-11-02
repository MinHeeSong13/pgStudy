package main;

import java.sql.Date;

public class Wedding extends Community{
	private String location; // 결혼식장 위치
	private char parkingYn; // 주차장 여부
	private int cost; // 비용
	private String banquetFood; // 연회 음식
	private Date wdDate; // 결혼날짜
	
	public Wedding() {}
	
	public Wedding(String name, String rrn, char gender, String nationality, String address, String phone,
			String email) {
		super(name, rrn, gender, nationality, address, phone, email);
	}

	public Wedding(String goal) {
		super(goal);
	}
	
	public Wedding(String location, char parkingYn, int cost, String banquetFood, Date wdDate) {
		super();
		this.location = location;
		this.parkingYn = parkingYn;
		this.cost = cost;
		this.banquetFood = banquetFood;
		this.wdDate = wdDate;
	}

	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public char getParkingYn() {
		return parkingYn;
	}
	public void setParkingYn(char parkingYn) {
		this.parkingYn = parkingYn;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public String getBanquetFood() {
		return banquetFood;
	}
	public void setBanquetFood(String banquetFood) {
		this.banquetFood = banquetFood;
	}

	public Date getWdDate() {
		return wdDate;
	}

	public void setWdDate(Date wdDate) {
		this.wdDate = wdDate;
	}
	
}
