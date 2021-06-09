package com.example.jsonparser.beans;

import com.fasterxml.jackson.databind.JsonNode;

public class BidResponse {
	private String id;
	private SeatBid[] seatbid;
	
	public SeatBid[] getSeatbid() {
		return seatbid;
	}
	public void setSeatbid(SeatBid[] seatbid) {
		this.seatbid = seatbid;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	
}
