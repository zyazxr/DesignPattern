package com.atguigu.uml.composition;

import java.util.ArrayList;
import java.util.List;

public class Computer {
	private Mouse mouse = new Mouse(); //�����Ժ�computer���ܷ���
	private Moniter moniter = new Moniter();//��ʾ�����Ժ�Computer���ܷ���
	private List<Moniter> moniter2 = new ArrayList<>();//��ʾ�����Ժ�Computer���ܷ���

	public void setMouse(Mouse mouse) {
		this.mouse = mouse;
	}
	public void setMoniter(Moniter moniter) {
		this.moniter = moniter;
	}
	
}
