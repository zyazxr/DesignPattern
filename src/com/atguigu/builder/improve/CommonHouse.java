package com.atguigu.builder.improve;

public class CommonHouse extends HouseBuilder {

	@Override
	public void buildBasic() {
		// TODO Auto-generated method stub
		System.out.println(" ��ͨ���Ӵ�ػ�5�� ");
		house.setBaise("test");
//		System.out.println(house);
	}

	@Override
	public void buildWalls() {
		// TODO Auto-generated method stub
		System.out.println(" ��ͨ������ǽ10cm ");
		house.setWall("10cm");
	}

	@Override
	public void roofed() {
		// TODO Auto-generated method stub
		System.out.println(" ��ͨ�����ݶ� ");
		house.setRoofed("��");
	}

}
