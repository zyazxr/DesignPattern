package com.biancheng.principle;

/**
 * @author ��zhaoy
 * @date ��Created in 2021/3/12 9:21
 * @description��
 * @modified By��
 * @version: 1.0
 */

public class LSPtest {
	public static void main(String[] args) {
		Bird bird1 = new Swallow();
		Bird bird2 = new BrownKiwi();
		bird1.setSpeed(120);
		bird2.setSpeed(120);
		System.out.println("�������300���");
		try {
			System.out.println("���ӽ�����" + bird1.getFlyTime(300) + "Сʱ.");
			System.out.println("��ά�񽫷���" + bird2.getFlyTime(300) + "Сʱ��");
		} catch (Exception err) {
			System.out.println("����������!");
		}
	}
}

//����
class Bird {
	double flySpeed;

	public void setSpeed(double speed) {
		flySpeed = speed;
	}

	public double getFlyTime(double distance) {
		return (distance / flySpeed);
	}
}

//������
class Swallow extends Bird {
}

//��ά����
class BrownKiwi extends Bird {
	@Override
	public void setSpeed(double speed) {
		flySpeed = 0;
	}
}

//�������д����ԭ���ǣ���ά������д������� setSpeed(double speed) ��������Υ���������滻ԭ����ȷ�������ǣ�
// ȡ����ά��ԭ���ļ̳й�ϵ��������ͼ�ά��ĸ�һ��ĸ��࣬�綯���࣬���Ƕ��б��ܵ���������ά��ķ����ٶ���ȻΪ 0���������ٶȲ�Ϊ 0�����Լ�����䱼�� 300 ǧ����Ҫ���ѵ�ʱ��