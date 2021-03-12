package com.biancheng.principle;

/**
 * @author ��zhaoy
 * @date ��Created in 2021/3/12 9:23
 * @description��
 * @modified By��
 * @version: 1.0
 */

public class DIPtest {
	public static void main(String[] args) {
		Customer wang = new Customer();
		System.out.println("�˿͹���������Ʒ��");
		wang.shopping(new ShaoguanShop());
		wang.shopping(new WuyuanShop());
	}
}

//�̵�
interface Shop {
	public String sell(); //��
}

//�ع�����
class ShaoguanShop implements Shop {
	@Override
	public String sell() {
		return "�ع����ز����㹽��ľ������";
	}
}

//��Դ����
class WuyuanShop implements Shop {
	@Override
	public String sell() {
		return "��Դ���ز����̲衢�����㡭��";
	}
}

//�˿�
class Customer {
	public void shopping(Shop shop) {
		//����
		System.out.println(shop.sell());
	}
}