package main;

public class Person {
	private String name; // 이름
	private String rrn; // 주민등록번호
	private char gender; // 성별
	private String nationality; // 국적
	private String address; // 주소
	private String phone; // 전화번호
	private String email; // 이메일
	
	public Person() {}
	
	public Person(String name, String rrn, char gender, String nationality, String address, String phone,
			String email) {
		super();
		this.name = name;
		this.rrn = rrn;
		this.gender = gender;
		this.nationality = nationality;
		this.address = address;
		this.phone = phone;
		this.email = email;
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
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
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

}
