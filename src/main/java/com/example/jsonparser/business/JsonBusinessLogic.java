package com.example.jsonparser.business;

import org.springframework.stereotype.Service;

import com.example.jsonparser.beans.Bid;
import com.example.jsonparser.beans.BidResponse;
import com.example.jsonparser.beans.SeatBid;

@Service
public class JsonBusinessLogic {

	public Bid getHighestBid(BidResponse br) {

		Bid maxBid = null;
		double maxPrice = 0;

		SeatBid[] seatbids = br.getSeatbid();

		for (SeatBid seatbid : seatbids) {
			Bid[] bids = seatbid.getBid();

			for (Bid bid : bids) {
				if (maxPrice < bid.getPrice()) {
					maxPrice = bid.getPrice();
					maxBid = bid;
				}
			}
		}

		System.out.println(maxPrice);
		System.out.println(maxBid);

		return maxBid;
	}
}
