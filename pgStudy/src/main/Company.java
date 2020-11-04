package main;

import java.sql.Date;

public class Company extends Community{
	private String corName; // 회사명
	private String corCode; // 회사코드
	private String comLocation; // 회사위치
	private int capAmount; // 자본금
	private String comType; // 기업구분 (대기업, 중소 등)
	
	public Company() {}
	public Company(String name, String rrn, String nationality, String postCode, String address, String phone,
			String email, String jobName, double height, double weight) {
		super(name, rrn, nationality, postCode, address, phone, email, jobName, height, weight);
	}
	public Company(String goal, Date goalStart, Date goalEnd) {
		super(goal, goalStart, goalEnd);
	}
	public String getCorName() {
		return corName;
	}
	public void setCorName(String corName) {
		this.corName = corName;
	}
	public String getCorCode() {
		return corCode;
	}
	public void setCorCode(String corCode) {
		this.corCode = corCode;
	}
	public String getComLocation() {
		return comLocation;
	}
	public void setComLocation(String comLocation) {
		this.comLocation = comLocation;
	}
	public int getCapAmount() {
		return capAmount;
	}
	public void setCapAmount(int capAmount) {
		this.capAmount = capAmount;
	}
	public String getComType() {
		return comType;
	}
	public void setComType(String comType) {
		this.comType = comType;
	}
	
}
