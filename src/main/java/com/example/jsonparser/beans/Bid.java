package com.example.jsonparser.beans;

import java.util.Arrays;

public class Bid {
	
	
	private String id;
	private int impid;
    private double price;
    private String adm;
    private String[] adomain;
    private int w;
    private int h;
    private String crid; 
    
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getImpid() {
		return impid;
	}

	public void setImpid(int impid) {
		this.impid = impid;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getAdm() {
		return adm;
	}

	public void setAdm(String adm) {
		this.adm = adm;
	}

	public String[] getAdomain() {
		return adomain;
	}

	public void setAdomain(String[] adomain) {
		this.adomain = adomain;
	}

	public int getW() {
		return w;
	}

	public void setW(int w) {
		this.w = w;
	}

	public int getH() {
		return h;
	}

	public void setH(int h) {
		this.h = h;
	}

	public String getCrid() {
		return crid;
	}

	public void setCrid(String crid) {
		this.crid = crid;
	}

	@Override
	public String toString() {
		return "Bid [id=" + id + ", impid=" + impid + ", price=" + price + ", adm=" + adm + ", adomain="
				+ Arrays.toString(adomain) + ", w=" + w + ", h=" + h + ", crid=" + crid + "]";
	}

}
