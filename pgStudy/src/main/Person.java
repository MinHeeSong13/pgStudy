package main;

public class Person {
	private String name; // 이름
	private String rrn; // 주민등록번호
	private String nationality; // 국적
	private String postCode; // 우편번호
	private String address; // 주소
	private String phone; // 전화번호
	private String email; // 이메일
	private String jobName; // 직업명 (학생, 교수, 회사원 등)
	private double height; // 키
	private double weight; // 몸무게
	
	public Person() {}
	public Person(String name, String rrn, String nationality, String postCode, String address, String phone,
			String email, String jobName, double height, double weight) {
		super();
		this.name = name;
		this.rrn = rrn;
		this.nationality = nationality;
		this.postCode = postCode;
		this.address = address;
		this.phone = phone;
		this.email = email;
		this.jobName = jobName;
		this.height = height;
		this.weight = weight;
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
	public String getJobName() {
		return jobName;
	}
	public void setJobName(String jobName) {
		this.jobName = jobName;
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
	
}
