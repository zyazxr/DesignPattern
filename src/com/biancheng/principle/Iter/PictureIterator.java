package com.biancheng.principle.Iter;

/**
 * @author ��zhaoy
 * @date ��Created in 2021/3/18 20:10
 * @description��
 * @modified By��
 * @version: 1.0
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
public class PictureIterator {
	public static void main(String[] args) {
		new PictureFrame();
	}
}
//�����
class PictureFrame extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	ViewSpotSet ag; //��Դ���㼯�ӿ�
	ViewSpotIterator it; //��Դ����������ӿ�
	WyViewSpot ob;    //��Դ������
	PictureFrame() {
		super("�й�������塰��Դ���Ĳ��ַ羰ͼ");
		this.setResizable(false);
		ag = new WyViewSpotSet();
		ag.add(new WyViewSpot("����", "���徰������Դ��һ������5A�����ξ�������������������������˼�֡��������ݡ���Դ�˼ҡ�����԰���ٹ�����һ�����Ž������������ף�������ϸ��"));
		ag.add(new WyViewSpot("���", "��Ӵ���һ�������վ۾�Ϊ���ĹŴ��䣬�ǹ���4A�����ξ������佨�������أ��������Ļ��ɽ���������һ�ְ�������͵ĸо���"));
		ag.add(new WyViewSpot("˼Ϫ�Ӵ�", "˼Ϫ�Ӵ�λ����Դ��˼�����ڣ�ʼ����������Ԫ���꣨1199�꣩����ʱ�����������ԣ��㣩˼��Ϫˮ������"));
		ag.add(new WyViewSpot("�����", "�����С��й����Ļ���һ�塱�롰���Ҽ���̬ʾ���塱֮���������ݶ�Ϊ�����������������ɫ������С�������ʯ���������ۣ��ػ�����֡�"));
		ag.add(new WyViewSpot("�վ���", "�վ�����״Ϊɽ��ˮ���ͣ�С�ӳɴ��Բ�ͣ��ƴ�ׯ����һ�ܣ�����Ϊ��ɽ���ƣ������й��İ��ԡ���ɽǰˮ����ƣ������˳ơ�����塱��"));
		ag.add(new WyViewSpot("����", "�����������ġ�ɹ��Ļ���Դ�أ�Ҳ��һ������������ʷ�Ļ��ݹŴ壻����������ɽ�Ӵ��䣬���Χ��ˮ�ڳ�������״�����Ų���"));
		ag.add(new WyViewSpot("�ʺ���", "�ʺ�������Դ������ɫ�Ĵ������š������ţ��䲻���������������������������﹩����Ъ�ţ�����ȡ����ʫ����ˮ��������˫����ʺ硱��"));
		ag.add(new WyViewSpot("������", "�������ǹ���4A���������������Ȫ����й�����񡢲ʳ���̶�������¡�ɽ����ʯͦ�����ɣ�������һ����Ȼ��īɽˮ����"));
		it = ag.getIterator(); //��ȡ��Դ���������
		ob = it.first();
		this.showPicture(ob.getName(), ob.getIntroduce());
	}
	//��ʾͼƬ
	void showPicture(String Name, String Introduce) {
		Container cp = this.getContentPane();
		JPanel picturePanel = new JPanel();
		JPanel controlPanel = new JPanel();
		String FileName = "src/com/biancheng/principle/Iter/Picture/" + Name + ".jpg";
		JLabel lb = new JLabel(Name, new ImageIcon(FileName), JLabel.CENTER);
		JTextArea ta = new JTextArea(Introduce);
		lb.setHorizontalTextPosition(JLabel.CENTER);
		lb.setVerticalTextPosition(JLabel.TOP);
		lb.setFont(new Font("����", Font.BOLD, 20));
		ta.setLineWrap(true);
		ta.setEditable(false);
		//ta.setBackground(Color.orange);
		picturePanel.setLayout(new BorderLayout(5, 5));
		picturePanel.add("Center", lb);
		picturePanel.add("South", ta);
		JButton first, last, next, previous;
		first = new JButton("��һ��");
		next = new JButton("��һ��");
		previous = new JButton("��һ��");
		last = new JButton("��ĩ��");
		first.addActionListener(this);
		next.addActionListener(this);
		previous.addActionListener(this);
		last.addActionListener(this);
		controlPanel.add(first);
		controlPanel.add(next);
		controlPanel.add(previous);
		controlPanel.add(last);
		cp.add("Center", picturePanel);
		cp.add("South", controlPanel);
		this.setSize(630, 550);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		String command = arg0.getActionCommand();
		if (command.equals("��һ��")) {
			ob = it.first();
			this.showPicture(ob.getName(), ob.getIntroduce());
		} else if (command.equals("��һ��")) {
			ob = it.next();
			this.showPicture(ob.getName(), ob.getIntroduce());
		} else if (command.equals("��һ��")) {
			ob = it.previous();
			this.showPicture(ob.getName(), ob.getIntroduce());
		} else if (command.equals("��ĩ��")) {
			ob = it.last();
			this.showPicture(ob.getName(), ob.getIntroduce());
		}
	}
}
//��Դ������
class WyViewSpot {
	private String Name;
	private String Introduce;
	WyViewSpot(String Name, String Introduce) {
		this.Name = Name;
		this.Introduce = Introduce;
	}
	public String getName() {
		return Name;
	}
	public String getIntroduce() {
		return Introduce;
	}
}
//����ۺϣ���Դ���㼯�ӿ�
interface ViewSpotSet {
	void add(WyViewSpot obj);
	void remove(WyViewSpot obj);
	ViewSpotIterator getIterator();
}
//����ۺϣ���Դ���㼯
class WyViewSpotSet implements ViewSpotSet {
	private ArrayList<WyViewSpot> list = new ArrayList<WyViewSpot>();
	@Override
	public void add(WyViewSpot obj) {
		list.add(obj);
	}
	@Override
	public void remove(WyViewSpot obj) {
		list.remove(obj);
	}
	@Override
	public ViewSpotIterator getIterator() {
		return (new WyViewSpotIterator(list));
	}
}
//�������������Դ����������ӿ�
interface ViewSpotIterator {
	boolean hasNext();
	WyViewSpot first();
	WyViewSpot next();
	WyViewSpot previous();
	WyViewSpot last();
}
//�������������Դ���������
class WyViewSpotIterator implements ViewSpotIterator {
	private ArrayList<WyViewSpot> list = null;
	private int index = -1;
	WyViewSpot obj = null;
	public WyViewSpotIterator(ArrayList<WyViewSpot> list) {
		this.list = list;
	}
	@Override
	public boolean hasNext() {
		if (index < list.size() - 1) {
			return true;
		} else {
			return false;
		}
	}
	@Override
	public WyViewSpot first() {
		index = 0;
		obj = list.get(index);
		return obj;
	}
	@Override
	public WyViewSpot next() {
		if (this.hasNext()) {
			obj = list.get(++index);
		}
		return obj;
	}
	@Override
	public WyViewSpot previous() {
		if (index > 0) {
			obj = list.get(--index);
		}
		return obj;
	}
	@Override
	public WyViewSpot last() {
		index = list.size() - 1;
		obj = list.get(index);
		return obj;
	}
}