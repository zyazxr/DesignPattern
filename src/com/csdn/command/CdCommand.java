package com.csdn.command;

/**
 * @author £ºzhaoy
 * @date £ºCreated in 2021/3/19 9:54
 * @description£º
 * @modified By£º
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