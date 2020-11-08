package main;

import java.sql.Date;

public class Wedding extends Community{
	private String wdAddress; // 결혼식장 주소
	private char parkingYn; // 주차장 여부
	private int cost; // 비용
	private String banquetFood; // 연회 음식
	private Date wdDate; // 결혼날짜
	private int guestCnt; // 하객 수
	private int congrateMoney; // 축의금
	private String honeymoon; // 신혼여행지
	private String photographer; // 사진사
	private String officiate; // 주례사
	private String mc; // 사회자
	private Date createDt; // 생성일
	private Date updateDt; // 수정일
	
	public Wedding() {}
	public Wedding(String ccode, String goal, Date goalStart, Date goalEnd) {
		super(ccode, goal, goalStart, goalEnd);
	}
	public Wedding(String pCode, String name, String rrn, String nationality, String postCode, String address,
			String phone, String email, String jobCode, double height, double weight, Date createDt, Date updateDt) {
		super(pCode, name, rrn, nationality, postCode, address, phone, email, jobCode, height, weight, createDt, updateDt);
	}
	public Wedding(String wdAddress, char parkingYn, int cost, String banquetFood, Date wdDate, int guestCnt,
			int congrateMoney, String honeymoon, String photographer, String officiate, String mc, Date createDt,
			Date updateDt) {
		super();
		this.wdAddress = wdAddress;
		this.parkingYn = parkingYn;
		this.cost = cost;
		this.banquetFood = banquetFood;
		this.wdDate = wdDate;
		this.guestCnt = guestCnt;
		this.congrateMoney = congrateMoney;
		this.honeymoon = honeymoon;
		this.photographer = photographer;
		this.officiate = officiate;
		this.mc = mc;
		this.createDt = createDt;
		this.updateDt = updateDt;
	}
	public String getWdAddress() {
		return wdAddress;
	}
	public void setWdAddress(String wdAddress) {
		this.wdAddress = wdAddress;
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
	public int getGuestCnt() {
		return guestCnt;
	}
	public void setGuestCnt(int guestCnt) {
		this.guestCnt = guestCnt;
	}
	public int getCongrateMoney() {
		return congrateMoney;
	}
	public void setCongrateMoney(int congrateMoney) {
		this.congrateMoney = congrateMoney;
	}
	public String getHoneymoon() {
		return honeymoon;
	}
	public void setHoneymoon(String honeymoon) {
		this.honeymoon = honeymoon;
	}
	public String getPhotographer() {
		return photographer;
	}
	public void setPhotographer(String photographer) {
		this.photographer = photographer;
	}
	public String getOfficiate() {
		return officiate;
	}
	public void setOfficiate(String officiate) {
		this.officiate = officiate;
	}
	public String getMc() {
		return mc;
	}
	public void setMc(String mc) {
		this.mc = mc;
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
