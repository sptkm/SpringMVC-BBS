package org.bbspjt.domain;

import java.util.Date;

public class BoardVO {
	
	private Integer bdID;
	private String bdTitle;
	private String bdWriter;
	private Date bdDate;
	private String bdContent;

	
	public Integer getBdID() {
		return bdID;
	}
	public void setBdID(Integer bdID) {
		this.bdID = bdID;
	}
	public String getBdTitle() {
		return bdTitle;
	}
	public void setBdTitle(String bdTitle) {
		this.bdTitle = bdTitle;
	}
	public String getBdWriter() {
		return bdWriter;
	}
	public void setBdWriter(String bdWriter) {
		this.bdWriter = bdWriter;
	}
	public Date getBdDate() {
		return bdDate;
	}
	public void setBdDate(Date bdDate) {
		this.bdDate = bdDate;
	}
	public String getBdContent() {
		return bdContent;
	}
	public void setBdContent(String bdContent) {
		this.bdContent = bdContent;
	}

	@Override
	public String toString() {
		return "BoardVO [bdID=" + bdID + ", bdTitle=" + bdTitle + ", bdWriter=" + bdWriter + ", bdDate=" + bdDate
				+ ", bdContent=" + bdContent + "]";
	}
	
	
	

}
