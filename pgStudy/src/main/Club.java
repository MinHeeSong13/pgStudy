package main;

import java.sql.Date;

public class Club extends University{
	private String clubName; // 동아리 이름
	private String clubNo; // 동아리 코드
	private String cBuildingName; // 동아리실 건물명
	private String cDetailRoom; // 동아리실 상세 주소(호수)
	private int clubMemCnt; // 동아리 구성원 수
	private String actContent; // 활동내용
	private Date createDt; // 생성일
	private Date updateDt; // 수정일
	
	public Club() {}
	public Club(String ccode, String goal, Date goalStart, Date goalEnd) {
		super(ccode, goal, goalStart, goalEnd);
	}
	public Club(String uniName, String uniAddress, double empRate, int stuCnt, int noGraduateCnt, double adRate,
			double domRate, double graPointAvg, Date createDt, Date updateDt) {
		super(uniName, uniAddress, empRate, stuCnt, noGraduateCnt, adRate, domRate, graPointAvg, createDt, updateDt);
	}
	public Club(String pCode, String name, String rrn, String nationality, String postCode, String address,
			String phone, String email, String jobCode, double height, double weight, Date createDt, Date updateDt) {
		super(pCode, name, rrn, nationality, postCode, address, phone, email, jobCode, height, weight, createDt, updateDt);
	}
	public Club(String clubName, String clubNo, String cBuildingName, String cDetailRoom, int clubMemCnt,
			String actContent, Date createDt, Date updateDt) {
		super();
		this.clubName = clubName;
		this.clubNo = clubNo;
		this.cBuildingName = cBuildingName;
		this.cDetailRoom = cDetailRoom;
		this.clubMemCnt = clubMemCnt;
		this.actContent = actContent;
		this.createDt = createDt;
		this.updateDt = updateDt;
	}
	public String getClubName() {
		return clubName;
	}
	public void setClubName(String clubName) {
		this.clubName = clubName;
	}
	public String getClubNo() {
		return clubNo;
	}
	public void setClubNo(String clubNo) {
		this.clubNo = clubNo;
	}
	public int getClubMemCnt() {
		return clubMemCnt;
	}
	public void setClubMemCnt(int clubMemCnt) {
		this.clubMemCnt = clubMemCnt;
	}
	public String getActContent() {
		return actContent;
	}
	public void setActContent(String actContent) {
		this.actContent = actContent;
	}
	public String getcBuildingName() {
		return cBuildingName;
	}
	public void setcBuildingName(String cBuildingName) {
		this.cBuildingName = cBuildingName;
	}
	public String getcDetailRoom() {
		return cDetailRoom;
	}
	public void setcDetailRoom(String cDetailRoom) {
		this.cDetailRoom = cDetailRoom;
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
