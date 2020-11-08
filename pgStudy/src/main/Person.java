package main;

import java.sql.Date;

public class Person {
	private String pCode; // 사람코드. 대리키 (P + 시퀀스)
	private String name; // 이름
	private String rrn; // 주민등록번호
	private String nationality; // 국적
	private String postCode; // 우편번호
	private String address; // 주소
	private String phone; // 전화번호
	private String email; // 이메일
	private String jobCode; // 직업코드 
	private double height; // 키
	private double weight; // 몸무게
	private Date createDt; // 생성일
	private Date updateDt; // 수정일
	
	public Person() {}
	public Person(String pCode, String name, String rrn, String nationality, String postCode, String address,
			String phone, String email, String jobCode, double height, double weight, Date createDt, Date updateDt) {
		super();
		this.pCode = pCode;
		this.name = name;
		this.rrn = rrn;
		this.nationality = nationality;
		this.postCode = postCode;
		this.address = address;
		this.phone = phone;
		this.email = email;
		this.jobCode = jobCode;
		this.height = height;
		this.weight = weight;
		this.createDt = createDt;
		this.updateDt = updateDt;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRrn() {
		return rrn;
	}
	public void setRrn(String rrn) {
		this.rrn = rrn;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPostCode() {
		return postCode;
	}
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}
	public String getJobCode() {
		return jobCode;
	}
	public void setJobCode(String jobCode) {
		this.jobCode = jobCode;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
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
	public String getpCode() {
		return pCode;
	}
	public void setpCode(String pCode) {
		this.pCode = pCode;
	}
	
}
