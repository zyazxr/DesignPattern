package com.csdn.share;

import java.math.BigDecimal;

/**
 * @author ��zhaoy
 * @date ��Created in 2021/3/17 11:17
 * @description��
 * @modified By��
 * @version: 1.0
 */
public class TrainShareTicket implements IShareTicket {
	private String from;//�ڲ�״̬
	private String to;//�ڲ�״̬

	private String seatType = "վƱ";//�ⲿ״̬

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
			case "Ӳ��":
				value = new BigDecimal("100");
				break;
			case "Ӳ��":
				value = new BigDecimal("200");
				break;
			default:
				value = new BigDecimal("50");
		}
		return value;
	}
}