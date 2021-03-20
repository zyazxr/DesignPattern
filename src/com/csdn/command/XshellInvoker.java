package com.csdn.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @author £∫zhaoy
 * @date £∫Created in 2021/3/19 9:56
 * @description£∫
 * @modified By£∫
 * @version: 1.0
 */

public class XshellInvoker {
	private List<ICommand> commandList = new ArrayList<>();

	public XshellInvoker(List<ICommand> commandList) {
		this.commandList = commandList;
	}

	/**
	 * ÷¥––÷∏∂®√¸¡Ó
	 * @param command
	 */
	public void execute(ICommand command){
		command.execute();
	}

	/**
	 * ÷¥––√¸¡Ó∫Í
	 */
	public void executeCdAndLs(){
		for (ICommand command : commandList){
			if (command instanceof LsCommand || command instanceof CdCommand){
				command.execute();
			}
		}
	}

	public void executeAll(){
		for (ICommand command : commandList){
			command.execute();
		}
	}
}