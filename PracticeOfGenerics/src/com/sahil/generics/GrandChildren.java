package com.sahil.generics;

import java.util.List;

public class GrandChildren 
{
	private String grandChildName;
	private int gID;
	private int gAge;
	
	private List<AddInfo> additionalInfo;
	private List<Tution> tutions;
	
	public String getGrandChildName() {
		return grandChildName;
	}
	public void setGrandChildName(String grandChildName) {
		this.grandChildName = grandChildName;
	}
	public int getgID() {
		return gID;
	}
	public void setgID(int gID) {
		this.gID = gID;
	}
	public int getgAge() {
		return gAge;
	}
	public void setgAge(int i) {
		this.gAge = i;
	}
	public List<AddInfo> getAdditionalInfo() {
		return additionalInfo;
	}
	public void setAdditionalInfo(List<AddInfo> additionalInfo) {
		this.additionalInfo = additionalInfo;
	}
	public List<Tution> getTutions() {
		return tutions;
	}
	public void setTutions(List<Tution> tutions) {
		this.tutions = tutions;
	}
	
}
