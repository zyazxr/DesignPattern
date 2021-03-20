package com.csdn.command;

/**
 * @author ��zhaoy
 * @date ��Created in 2021/3/19 9:55
 * @description��
 * @modified By��
 * @version: 1.0
 */

public class RestartCommand implements ICommand {
	private LinuxSystem linuxSystem;

	public RestartCommand(LinuxSystem linuxSystem) {
		this.linuxSystem = linuxSystem;
	}

	@Override
	public void execute() {
		this.linuxSystem.restart();
	}
}