package com.biancheng.principle;
import javax.xml.parsers.*;
import org.w3c.dom.*;
import java.io.*;
/**
 * @author ：zhaoy
 * @date ：Created in 2021/3/12 16:17
 * @description：
 * @modified By：
 * @version: 1.0
 */
//目标：发动机
interface Motor
{
	public void drive();
}
//适配者1：电能发动机
class ElectricMotor
{
	public void electricDrive()
	{
		System.out.println("电能发动机驱动汽车！");
	}
}
//适配者2：光能发动机
class OpticalMotor
{
	public void opticalDrive()
	{
		System.out.println("光能发动机驱动汽车！");
	}
}
//电能适配器
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
//光能适配器
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
//客户端代码
class MotorAdapterTest
{
	public static void main(String[] args)
	{
		System.out.println("适配器模式测试：");
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