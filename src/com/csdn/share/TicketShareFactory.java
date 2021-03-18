package com.csdn.share;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ：zhaoy
 * @date ：Created in 2021/3/17 11:17
 * @description：
 * @modified By：
 * @version: 1.0
 */
public class TicketShareFactory {
	private static Map<String,IShareTicket> CACHE_POOL = new HashMap<>();

	public static IShareTicket getTicketInfo(String from,String to){
		String key = from + "->" + to;
		if (TicketShareFactory.CACHE_POOL.containsKey(key)){
			System.out.println("使用缓存");
			return TicketShareFactory.CACHE_POOL.get(key);
		}
		System.out.println("未使用缓存");
		IShareTicket ticket = new TrainShareTicket(from,to);
		CACHE_POOL.put(key,ticket);
		return ticket;
	}
}