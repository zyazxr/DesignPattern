package com.csdn.Iterator;

/**
 * @author ��zhaoy
 * @date ��Created in 2021/3/19 10:16
 * @description��
 * @modified By��
 * @version: 1.0
 */

public interface IBaggageAggregate {
	void add(Baggage baggage);

	void remove(Baggage baggage);

	int size();

	IMyIterator<Baggage> iterator();
}