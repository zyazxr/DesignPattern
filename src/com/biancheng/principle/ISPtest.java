package com.biancheng.principle;

/**
 * @author ��zhaoy
 * @date ��Created in 2021/3/12 9:37
 * @description��
 * @modified By��
 * @version: 1.0
 */
public class ISPtest {
	public static void main(String[] args) {
		InputModule input = StuScoreList.getInputModule();
		CountModule count = StuScoreList.getCountModule();
		PrintModule print = StuScoreList.getPrintModule();
		input.insert();
		input.delete();
		count.countTotalScore();
		print.printStuInfo();
		//print.delete();
	}
}
//����ģ��ӿ�
interface InputModule {
	void insert();
	void delete();
	void modify();
}
//ͳ��ģ��ӿ�
interface CountModule {
	void countTotalScore();
	void countAverage();
}
//��ӡģ��ӿ�
interface PrintModule {
	void printStuInfo();
	void queryStuInfo();
}
//ʵ����
class StuScoreList implements InputModule, CountModule, PrintModule {
	private StuScoreList() {
	}
	public static InputModule getInputModule() {
		return (InputModule) new StuScoreList();
	}
	public static CountModule getCountModule() {
		return (CountModule) new StuScoreList();
	}
	public static PrintModule getPrintModule() {
		return (PrintModule) new StuScoreList();
	}
	@Override
	public void insert() {
		System.out.println("����ģ���insert()���������ã�");
	}
	@Override
	public void delete() {
		System.out.println("����ģ���delete()���������ã�");
	}
	@Override
	public void modify() {
		System.out.println("����ģ���modify()���������ã�");
	}
	@Override
	public void countTotalScore() {
		System.out.println("ͳ��ģ���countTotalScore()���������ã�");
	}
	@Override
	public void countAverage() {
		System.out.println("ͳ��ģ���countAverage()���������ã�");
	}
	@Override
	public void printStuInfo() {
		System.out.println("��ӡģ���printStuInfo()���������ã�");
	}
	@Override
	public void queryStuInfo() {
		System.out.println("��ӡģ���queryStuInfo()���������ã�");
	}
}