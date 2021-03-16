package com.biancheng.principle;
import javax.xml.parsers.*;
import org.w3c.dom.*;
import java.io.*;
/**
 * @author ��zhaoy
 * @date ��Created in 2021/3/12 16:17
 * @description��
 * @modified By��
 * @version: 1.0
 */
//Ŀ�꣺������
interface Motor
{
	public void drive();
}
//������1�����ܷ�����
class ElectricMotor
{
	public void electricDrive()
	{
		System.out.println("���ܷ���������������");
	}
}
//������2�����ܷ�����
class OpticalMotor
{
	public void opticalDrive()
	{
		System.out.println("���ܷ���������������");
	}
}
//����������
class ElectricAdapter implements Motor
{
	private ElectricMotor emotor;
	public ElectricAdapter()
	{
		emotor=new ElectricMotor();
	}
	@Override
	public void drive()
	{
		emotor.electricDrive();
	}
}
//����������
class OpticalAdapter implements Motor
{
	private OpticalMotor omotor;
	public OpticalAdapter()
	{
		omotor=new OpticalMotor();
	}
	@Override
	public void drive()
	{
		omotor.opticalDrive();
	}
}
//�ͻ��˴���
class MotorAdapterTest
{
	public static void main(String[] args)
	{
		System.out.println("������ģʽ���ԣ�");
		Motor motor=(Motor)ReadXML.getObject();
		motor.drive();
	}
}

class ReadXML
{
	public static Object getObject()
	{
		try
		{
			DocumentBuilderFactory dFactory=DocumentBuilderFactory.newInstance();
			DocumentBuilder builder=dFactory.newDocumentBuilder();
			Document doc;
			doc=builder.parse(new File("src/com/biancheng/principle/config.xml"));
			NodeList nl=doc.getElementsByTagName("className");
			Node classNode=nl.item(0).getFirstChild();
			String cName=" com.biancheng.principle."+classNode.getNodeValue();
			System.out.println(cName);
			Class<?> c=Class.forName(cName);
			Object obj=c.newInstance();
			return obj;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
	}
}