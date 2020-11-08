package main;

import java.sql.Date;

public class Company extends Community{
	private String corName; // 회사명
	private String comAddress; // 회사주소
	private int capAmount; // 자본금
	private int anRevenue; // 연매출
	private int empCnt; // 직원 수
	private String comType; // 기업구분 (대기업, 중소 등)
	private Date createDt; // 생성일
	private Date updateDt; // 수정일
	
	public Company() {}
	public Company(String ccode, String goal, Date goalStart, Date goalEnd) {
		super(ccode, goal, goalStart, goalEnd);
	}
	public Company(String pCode, String name, String rrn, String nationality, String postCode, String address,
			String phone, String email, String jobCode, double height, double weight, Date createDt, Date updateDt) {
		super(pCode, name, rrn, nationality, postCode, address, phone, email, jobCode, height, weight, createDt, updateDt);
	}
	public Company(String corName, String comAddress, int capAmount, int anRevenue, int empCnt, String comType,
			Date createDt, Date updateDt) {
		super();
		this.corName = corName;
		this.comAddress = comAddress;
		this.capAmount = capAmount;
		this.anRevenue = anRevenue;
		this.empCnt = empCnt;
		this.comType = comType;
		this.createDt = createDt;
		this.updateDt = updateDt;
	}
	public String getCorName() {
		return corName;
	}
	public void setCorName(String corName) {
		this.corName = corName;
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
	public String getComAddress() {
		return comAddress;
	}
	public void setComAddress(String comAddress) {
		this.comAddress = comAddress;
	}
	public int getAnRevenue() {
		return anRevenue;
	}
	public void setAnRevenue(int anRevenue) {
		this.anRevenue = anRevenue;
	}
	public int getEmpCnt() {
		return empCnt;
	}
	public void setEmpCnt(int empCnt) {
		this.empCnt = empCnt;
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
