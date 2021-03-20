package com.csdn.command;

/**
 * @author ��zhaoy
 * @date ��Created in 2021/3/19 9:54
 * @description��
 * @modified By��
 * @version: 1.0
 */
public class CdCommand implements ICommand {
	private LinuxSystem linuxSystem;

	public CdCommand(LinuxSystem linuxSystem) {
		this.linuxSystem = linuxSystem;
	}

	@Override
	public void execute() {
		linuxSystem.cd();
	}
}