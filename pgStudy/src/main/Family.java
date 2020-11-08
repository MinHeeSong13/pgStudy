package main;

import java.sql.Date;
import java.util.List;

public class Family extends Wedding{
	private List<String> member; // 구성원
	private char comAnimalYn; // 반려동물 여부
	private List<String> AnimalType; // 반려동물 종류
	private int comAnimalCnt; // 반려동물 수
	private Date createDt; // 생성일
	private Date updateDt; // 수정일
	
	public Family() {}
	public Family(String location, char parkingYn, int cost, String banquetFood, Date wdDate, int guestCnt,
			int congrateMoney, String honeymoon, String photographer, String officiate, String mc, Date createDt,
			Date updateDt) {
		super(location, parkingYn, cost, banquetFood, wdDate, guestCnt, congrateMoney, honeymoon, photographer, officiate, mc,
				createDt, updateDt);
	}
	public Family(String ccode, String goal, Date goalStart, Date goalEnd) {
		super(ccode, goal, goalStart, goalEnd);
	}
	public Family(String pCode, String name, String rrn, String nationality, String postCode, String address,
			String phone, String email, String jobCode, double height, double weight, Date createDt, Date updateDt) {
		super(pCode, name, rrn, nationality, postCode, address, phone, email, jobCode, height, weight, createDt, updateDt);
	}
	public Family(List<String> member, char comAnimalYn, List<String> animalType, int comAnimalCnt, Date createDt,
			Date updateDt) {
		super();
		this.member = member;
		this.comAnimalYn = comAnimalYn;
		AnimalType = animalType;
		this.comAnimalCnt = comAnimalCnt;
		this.createDt = createDt;
		this.updateDt = updateDt;
	}
	public List<String> getMember() {
		return member;
	}
	public void setMember(List<String> member) {
		this.member = member;
	}
	public char getComAnimalYn() {
		return comAnimalYn;
	}
	public void setComAnimalYn(char comAnimalYn) {
		this.comAnimalYn = comAnimalYn;
	}
	public List<String> getAnimalType() {
		return AnimalType;
	}
	public void setAnimalType(List<String> animalType) {
		AnimalType = animalType;
	}
	public int getComAnimalCnt() {
		return comAnimalCnt;
	}
	public void setComAnimalCnt(int comAnimalCnt) {
		this.comAnimalCnt = comAnimalCnt;
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
