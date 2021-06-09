package com.example.jsonparser.beans;


public class SeatBid {
	private Bid[] bid;
	private String seat;
	
	public Bid[] getBid() {
		return bid;
	}
	public void setBid(Bid[] bid) {
		this.bid = bid;
	}
	public String getSeat() {
		return seat;
	}
	public void setSeat(String seat) {
		this.seat = seat;
	}
}
