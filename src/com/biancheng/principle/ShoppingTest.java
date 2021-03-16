package com.biancheng.principle;

import java.util.ArrayList;

/**
 * @author ��zhaoy
 * @date ��Created in 2021/3/16 16:44
 * @description��
˵�����������������عء����e�ǡ�������Ʒ�깺��� 1 ����ɫС����װ�� 2 ����Դ�ز������� 7.9 Ԫ����1 ����Դ��ͼ������ 9.9 Ԫ������ 1 ����ɫС����װ�� 2 ���ع���壨���� 68 Ԫ���� 3 ���عغ�裨���� 180 Ԫ������ 1 ���д���װ��ǰ��ĺ�ɫС���Ӻ� 1 ����������������� 380 Ԫ������ 1 �������װ��ǰ����д��ӡ���ɫС���Ӻ� 1 ˫�������˶�Ь������ 198 Ԫ����

��󡰴���ӡ��е������У�{1 ˫�������˶�Ь������ 198 Ԫ������ɫС����{2 ���ع��㹽������ 68 Ԫ����3 ���عغ�裨���� 180 Ԫ��}���д���{1 ����������������� 380 Ԫ������ɫС����{2 ����Դ�ز������� 7.9 Ԫ����1 ����Դ��ͼ������ 9.9 Ԫ��}}}������Ҫ������ʾ���������ڴ�����е�������Ʒ��Ϣ������Ҫ֧�����ܼۡ�
 * @modified By��
 * @version: 1.0
 */

public class ShoppingTest {
	public static void main(String[] args) {
		float s = 0;
		Bags BigBag, mediumBag, smallRedBag, smallWhiteBag;
		Goods sp;
		BigBag = new Bags("�����");
		mediumBag = new Bags("�д���");
		smallRedBag = new Bags("��ɫС����");
		smallWhiteBag = new Bags("��ɫС����");
		sp = new Goods("��Դ�ز�", 2, 7.9f);
		smallRedBag.add(sp);
		sp = new Goods("��Դ��ͼ", 1, 9.9f);
		smallRedBag.add(sp);
		sp = new Goods("�ع��㹽", 2, 68);
		smallWhiteBag.add(sp);
		sp = new Goods("�عغ��", 3, 180);
		smallWhiteBag.add(sp);
		sp = new Goods("���������", 1, 380);
		mediumBag.add(sp);
		mediumBag.add(smallRedBag);
		sp = new Goods("�������˶�Ь", 1, 198);
		BigBag.add(sp);
		BigBag.add(smallWhiteBag);
		BigBag.add(mediumBag);
		System.out.println("��ѡ������Ʒ�У�");
		BigBag.show();
		s = BigBag.calculation();
		System.out.println("Ҫ֧�����ܼ��ǣ�" + s + "Ԫ");
	}
}
//���󹹼�����Ʒ
interface Articles {
	float calculation(); //����
	void show();
}
//��Ҷ��������Ʒ
class Goods implements Articles {
	private String name;     //����
	private int quantity;    //����
	private float unitPrice; //����
	public Goods(String name, int quantity, float unitPrice) {
		this.name = name;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
	}
	@Override
	public float calculation() {
		return quantity * unitPrice;
	}
	@Override
	public void show() {
		System.out.println(name + "(������" + quantity + "�����ۣ�" + unitPrice + "Ԫ)");
	}
}
//��֦����������
class Bags implements Articles {
	private String name;     //����
	private ArrayList<Articles> bags = new ArrayList<Articles>();
	public Bags(String name) {
		this.name = name;
	}
	public void add(Articles c) {
		bags.add(c);
	}
	public void remove(Articles c) {
		bags.remove(c);
	}
	public Articles getChild(int i) {
		return bags.get(i);
	}
	@Override
	public float calculation() {
		float s = 0;
		for (Object obj : bags) {
			s += ((Articles) obj).calculation();
		}
		return s;
	}
	@Override
	public void show() {
		for (Object obj : bags) {
			((Articles) obj).show();
		}
	}
}