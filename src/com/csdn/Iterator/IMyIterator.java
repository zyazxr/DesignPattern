package com.csdn.Iterator;

/**
 * @author ��zhaoy
 * @date ��Created in 2021/3/19 10:15
 * @description��
 * @modified By��
 * @version: 1.0
 */

public interface IMyIterator<E> {
	E next();

	boolean hasNext();
}