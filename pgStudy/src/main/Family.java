package main;

public class Family extends Wedding{
	private String member; // 구성원
	private char comAnimalYn; // 반려동물 여부
	private String comAnimal; // 반려동물
	private int comAnimalCnt; // 반려동물 수
	
	public Family() {}
	public Family(String location, char parkingYn, int cost, String banquetFood) {
		super(location, parkingYn, cost, banquetFood);
	}
	public Family(String name, String rrn, char gender, String nationality, String address, String phone,
			String email) {
		super(name, rrn, gender, nationality, address, phone, email);
	}
	public Family(String goal) {
		super(goal);
	}
	public Family(String member, char comAnimalYn, String comAnimal, int comAnimalCnt) {
		super();
		this.member = member;
		this.comAnimalYn = comAnimalYn;
		this.comAnimal = comAnimal;
		this.comAnimalCnt = comAnimalCnt;
	}
	public String getMember() {
		return member;
	}
	public void setMember(String member) {
		this.member = member;
	}
	public char getComAnimalYn() {
		return comAnimalYn;
	}
	public void setComAnimalYn(char comAnimalYn) {
		this.comAnimalYn = comAnimalYn;
	}
	public String getComAnimal() {
		return comAnimal;
	}
	public void setComAnimal(String comAnimal) {
		this.comAnimal = comAnimal;
	}
	public int getComAnimalCnt() {
		return comAnimalCnt;
	}
	public void setComAnimalCnt(int comAnimalCnt) {
		this.comAnimalCnt = comAnimalCnt;
	}
	
	

}
