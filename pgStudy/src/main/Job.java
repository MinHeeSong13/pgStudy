package main;

import java.sql.Date;

public class Job extends Person{
	private String jobCode; // 직업 코드 
	private String jType; // 1차직업군
	private String jDetailType; // 2차 직무
	private Date createDt; // 생성일
	private Date updateDt; // 수정일
	
	public Job() {}
	public Job(String pCode, String name, String rrn, String nationality, String postCode, String address, String phone,
			String email, String jobCode, double height, double weight, Date createDt, Date updateDt) {
		super(pCode, name, rrn, nationality, postCode, address, phone, email, jobCode, height, weight, createDt, updateDt);
	}
	public Job(String jobCode, String jType, String jDetailType, Date createDt, Date updateDt) {
		super();
		this.jobCode = jobCode;
		this.jType = jType;
		this.jDetailType = jDetailType;
		this.createDt = createDt;
		this.updateDt = updateDt;
	}
	public String getJobCode() {
		return jobCode;
	}
	public void setJobCode(String jobCode) {
		this.jobCode = jobCode;
	}
	public String getjType() {
		return jType;
	}
	public void setjType(String jType) {
		this.jType = jType;
	}
	public String getjDetailType() {
		return jDetailType;
	}
	public void setjDetailType(String jDetailType) {
		this.jDetailType = jDetailType;
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
