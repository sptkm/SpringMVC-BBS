package org.bbspjt.domain;

public class MemberVO {

	private String memID;
	private String memPW;
	private String memName;
	private String memGender;
	private String memMail;
	
	public String getMemID() {
		return memID;
	}
	public void setMemID(String memID) {
		this.memID = memID;
	}
	public String getMemPW() {
		return memPW;
	}
	public void setMemPW(String memPW) {
		this.memPW = memPW;
	}
	public String getMemName() {
		return memName;
	}
	public void setMemName(String memName) {
		this.memName = memName;
	}
	public String getMemGender() {
		return memGender;
	}
	public void setMemGender(String memGender) {
		this.memGender = memGender;
	}
	public String getMemMail() {
		return memMail;
	}
	public void setMemMail(String memMail) {
		this.memMail = memMail;
	}
	
	@Override
	public String toString() {
		return "MemberVO [memID= " + memID + ", memPW" + memPW + ", memName" + memName + ", memGender" + memGender + ", memMail" + memMail + "]";
	}
	
	
	

}
