package com.atguigu.builder.improve;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//��Ʒ->Product
@Data
public class House {
	private String baise;
	private String wall;
	private String roofed;

//	public String getBaise() {
//		return baise;
//	}
//	public void setBaise(String baise) {
//		this.baise = baise;
//	}
//	public String getWall() {
//		return wall;
//	}
//	public void setWall(String wall) {
//		this.wall = wall;
//	}
//	public String getRoofed() {
//		return roofed;
//	}
//	public void setRoofed(String roofed) {
//		this.roofed = roofed;
//	}
//
//	@Override
//	public String toString() {
//		return "House [baise=" + baise + ", wall=" + wall + ", roofed=" + roofed + "]";
//	}
}
