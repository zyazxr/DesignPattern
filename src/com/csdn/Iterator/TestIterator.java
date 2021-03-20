package com.csdn.Iterator;

/**
 * @author ��zhaoy
 * @date ��Created in 2021/3/19 10:17
 * @description��
 * @modified By��
 * @version: 1.0
 */

public class TestIterator {
	public static void main(String[] args) {
		IBaggageAggregate iBaggageAggregate = initBaggage();
		System.out.println("��ǰ����Ԫ�ظ���Ϊ��" + iBaggageAggregate.size() + "��");
		IMyIterator<Baggage> it = iBaggageAggregate.iterator();
		while (it.hasNext()){
			Baggage baggage = it.next();
			System.out.println(baggage.getName());
		}
	}

	private static IBaggageAggregate initBaggage() {
		IBaggageAggregate iBaggageAggregate = new BaggageAggregateImpl();
		for (int i=0;i<10;i++){
			Baggage box = new Baggage("����" + (i+1));
			iBaggageAggregate.add(box);
		}
		return iBaggageAggregate;
	}
}