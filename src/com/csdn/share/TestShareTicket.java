package com.csdn.share;

/**
 * @author ：zhaoy
 * @date ：Created in 2021/3/17 11:18
 * @description：
 * @modified By：
 * @version: 1.0
 */
public class TestShareTicket {

	public static void main(String[] args) {
		IShareTicket ticket = TicketShareFactory.getTicketInfo("深圳","广州");
		ticket.setSeat("硬座");
		ticket.info();//首次创建对象
		ticket = TicketShareFactory.getTicketInfo("深圳","广州");
		ticket.setSeat("硬卧");
		ticket.info();//外部状态改变了，但是内部状态共享，依然可以使用缓存
		ticket = TicketShareFactory.getTicketInfo("深圳","广州");
		ticket.setSeat("站票");
		ticket.info();//外部状态改变了，但是内部状态共享，依然可以使用缓存
	}
}