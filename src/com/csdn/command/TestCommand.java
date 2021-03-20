package com.csdn.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ��zhaoy
 * @date ��Created in 2021/3/19 9:56
 * @description��
 * @modified By��
 * @version: 1.0
 */

public class TestCommand {

	public static void main(String[] args) {
		LinuxSystem linuxSystem = new LinuxSystem();
		List<ICommand> commandList = new ArrayList<>();
		commandList.add(new CdCommand(linuxSystem));
		commandList.add(new LsCommand(linuxSystem));
		commandList.add(new RestartCommand(linuxSystem));

		XshellInvoker xshellInvoker = new XshellInvoker(commandList);

		xshellInvoker.execute(new LsCommand(linuxSystem));//ִ��ָ������
		System.out.println("------------------------");
		xshellInvoker.executeCdAndLs();//ָ���ض������
		System.out.println("------------------------");
		xshellInvoker.executeAll();//ִ��ȫ������
	}
}
