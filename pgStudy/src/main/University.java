package main;

public class University extends Community{
	private String uniName; // 학교명
	private String uniLocation;
	private double empRate; // 취업률
	private int stuCnt; // 재적학생 수
	private double adRate; // 입학경쟁률
	private double domRate; // 기숙사 경쟁률
	private double graPointAvg; // 평균졸업평점
	
	public University() {}
	public University(String name, String rrn, char gender, String nationality, String address, String phone,
			String email) {
		super(name, rrn, gender, nationality, address, phone, email);
	}
	public University(String goal) {
		super(goal);
	}
	public University(String uniName, String uniLocation, double empRate, int stuCnt, double adRate, double domRate,
			double graPointAvg) {
		super();
		this.uniName = uniName;
		this.uniLocation = uniLocation;
		this.empRate = empRate;
		this.stuCnt = stuCnt;
		this.adRate = adRate;
		this.domRate = domRate;
		this.graPointAvg = graPointAvg;
	}
	public String getUniName() {
		return uniName;
	}
	public void setUniName(String uniName) {
		this.uniName = uniName;
	}
	public String getUniLocation() {
		return uniLocation;
	}
	public void setUniLocation(String uniLocation) {
		this.uniLocation = uniLocation;
	}
	public double getEmpRate() {
		return empRate;
	}
	public void setEmpRate(double empRate) {
		this.empRate = empRate;
	}
	public int getStuCnt() {
		return stuCnt;
	}
	public void setStuCnt(int stuCnt) {
		this.stuCnt = stuCnt;
	}
	public double getAdRate() {
		return adRate;
	}
	public void setAdRate(double adRate) {
		this.adRate = adRate;
	}
	public double getDomRate() {
		return domRate;
	}
	public void setDomRate(double domRate) {
		this.domRate = domRate;
	}
	public double getGraPointAvg() {
		return graPointAvg;
	}
	public void setGraPointAvg(double graPointAvg) {
		this.graPointAvg = graPointAvg;
	}
	
	

}
