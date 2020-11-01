package main;

public class Club extends University{
	private String clubName;
	private String clubNo;
	private String clubLocaion; // 동아리실 위치
	private int clubMemCnt; // 동아리 구성원 수
	private String actContent; // 활동내용
	
	public Club(String clubName, String clubNo, String clubLocaion, int clubMemCnt, String actContent) {
		super();
		this.clubName = clubName;
		this.clubNo = clubNo;
		this.clubLocaion = clubLocaion;
		this.clubMemCnt = clubMemCnt;
		this.actContent = actContent;
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
	public String getClubLocaion() {
		return clubLocaion;
	}
	public void setClubLocaion(String clubLocaion) {
		this.clubLocaion = clubLocaion;
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
	
	

}
