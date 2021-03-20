package com.csdn.Iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ��zhaoy
 * @date ��Created in 2021/3/19 10:16
 * @description��
 * @modified By��
 * @version: 1.0
 */

public class BaggageAggregateImpl implements IBaggageAggregate {
	private List list;

	public BaggageAggregateImpl() {
		this.list = new ArrayList<>();
	}

	@Override
	public void add(Baggage baggage) {
		list.add(baggage);
	}

	@Override
	public void remove(Baggage baggage) {
		list.remove(baggage);
	}

	@Override
	public int size() {
		return list.size();
	}

	@Override
	public IMyIterator<Baggage> iterator() {
		return new MyIteratorImpl<Baggage>(list);
	}
}