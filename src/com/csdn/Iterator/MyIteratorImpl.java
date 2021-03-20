package com.csdn.Iterator;

import java.util.List;

/**
 * @author £ºzhaoy
 * @date £ºCreated in 2021/3/19 10:15
 * @description£º
 * @modified By£º
 * @version: 1.0
 */

public class MyIteratorImpl<E> implements IMyIterator<E> {
	private List<E> list;
	private int cursor;
	private E element;
	private int size;

	public MyIteratorImpl(List<E> list) {
		this.list = list;
		this.size = list.size();
	}

	@Override
	public E next() {
		E element = list.get(cursor);
		cursor++;
		return element;
	}

	@Override
	public boolean hasNext() {
		return cursor != size;
	}
}