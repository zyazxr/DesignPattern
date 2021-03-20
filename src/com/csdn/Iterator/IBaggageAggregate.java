package com.csdn.Iterator;

/**
 * @author £ºzhaoy
 * @date £ºCreated in 2021/3/19 10:16
 * @description£º
 * @modified By£º
 * @version: 1.0
 */

public interface IBaggageAggregate {
	void add(Baggage baggage);

	void remove(Baggage baggage);

	int size();

	IMyIterator<Baggage> iterator();
}