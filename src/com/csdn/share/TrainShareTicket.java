package com.csdn.share;

import java.math.BigDecimal;

/**
 * @author £ºzhaoy
 * @date £ºCreated in 2021/3/17 11:17
 * @description£º
 * @modified By£º
 * @version: 1.0
 */
public class TrainShareTicket implements IShareTicket {
	private String from;//ÄÚ²¿×´Ì¬
	private String to;//ÄÚ²¿×´Ì¬

	private String seatType = "Õ¾Æ±";//Íâ²¿×´Ì¬

	public TrainShareTicket(String from, String to) {
		this.from = from;
		this.to = to;
	}

	@Override
	public void setSeat(String seatType){
		this.seatType = seatType;
	}

	@Override
	public void info() {
		System.out.println(from + "->" + to + ":" + seatType + this.getPrice(seatType));
	}

	private BigDecimal getPrice(String seatType){
		BigDecimal value = null;
		switch (seatType){
			case "Ó²×ù":
				value = new BigDecimal("100");
				break;
			case "Ó²ÎÔ":
				value = new BigDecimal("200");
				break;
			default:
				value = new BigDecimal("50");
		}
		return value;
	}
}