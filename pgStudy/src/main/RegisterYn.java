package main;

public enum RegisterYn{
	G("졸업"),A("휴학"),R("재학");

	private String regCode;
	private String regName;
	private RegisterYn(String regName) {
		this.regName = regName;
	}
	public String getRegCode() {
		return regCode;
	}
	public String getRegName() {
		return regName;
	}
}

