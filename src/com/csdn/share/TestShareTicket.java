package com.csdn.share;

/**
 * @author ��zhaoy
 * @date ��Created in 2021/3/17 11:18
 * @description��
 * @modified By��
 * @version: 1.0
 */
public class TestShareTicket {

	public static void main(String[] args) {
		IShareTicket ticket = TicketShareFactory.getTicketInfo("����","����");
		ticket.setSeat("Ӳ��");
		ticket.info();//�״δ�������
		ticket = TicketShareFactory.getTicketInfo("����","����");
		ticket.setSeat("Ӳ��");
		ticket.info();//�ⲿ״̬�ı��ˣ������ڲ�״̬������Ȼ����ʹ�û���
		ticket = TicketShareFactory.getTicketInfo("����","����");
		ticket.setSeat("վƱ");
		ticket.info();//�ⲿ״̬�ı��ˣ������ڲ�״̬������Ȼ����ʹ�û���
	}
}