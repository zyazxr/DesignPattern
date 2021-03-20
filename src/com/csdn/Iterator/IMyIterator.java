package com.csdn.Iterator;

/**
 * @author £ºzhaoy
 * @date £ºCreated in 2021/3/19 10:15
 * @description£º
 * @modified By£º
 * @version: 1.0
 */

public interface IMyIterator<E> {
	E next();

	boolean hasNext();
}