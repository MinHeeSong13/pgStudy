package main;

import java.sql.Date;

public class University extends Community{
	private String uniName; // 학교명
	private String uniAddress; // 학교 주소
	private double empRate; // 취업률
	private int stuCnt; // 재적학생 수
	private int noGraduateCnt; // 졸업안한 학생 수 (ex.졸업유예)
	private double adRate; // 입학경쟁률
	private double domRate; // 기숙사 경쟁률
	private double graPointAvg; // 평균졸업평점
	private Date createDt; // 생성일
	private Date updateDt; // 수정일
	
	public University() {}
	public University(String ccode, String goal, Date goalStart, Date goalEnd) {
		super(ccode, goal, goalStart, goalEnd);
	}
	public University(String pCode, String name, String rrn, String nationality, String postCode, String address,
			String phone, String email, String jobCode, double height, double weight, Date createDt, Date updateDt) {
		super(pCode, name, rrn, nationality, postCode, address, phone, email, jobCode, height, weight, createDt, updateDt);
	}
	public University(String uniName, String uniAddress, double empRate, int stuCnt, int noGraduateCnt, double adRate,
			double domRate, double graPointAvg, Date createDt, Date updateDt) {
		super();
		this.uniName = uniName;
		this.uniAddress = uniAddress;
		this.empRate = empRate;
		this.stuCnt = stuCnt;
		this.noGraduateCnt = noGraduateCnt;
		this.adRate = adRate;
		this.domRate = domRate;
		this.graPointAvg = graPointAvg;
		this.createDt = createDt;
		this.updateDt = updateDt;
	}
	public String getUniName() {
		return uniName;
	}
	public void setUniName(String uniName) {
		this.uniName = uniName;
	}
	public String getUniAddress() {
		return uniAddress;
	}
	public void setUniAddress(String uniAddress) {
		this.uniAddress = uniAddress;
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
	public int getNoGraduateCnt() {
		return noGraduateCnt;
	}
	public void setNoGraduateCnt(int noGraduateCnt) {
		this.noGraduateCnt = noGraduateCnt;
	}
	public Date getCreateDt() {
		return createDt;
	}
	public void setCreateDt(Date createDt) {
		this.createDt = createDt;
	}
	public Date getUpdateDt() {
		return updateDt;
	}
	public void setUpdateDt(Date updateDt) {
		this.updateDt = updateDt;
	}
}
