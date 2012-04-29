package br.com.borgescal.designpatterns.command.implementations.invoker;

import br.com.borgescal.designpatterns.command.intefaces.Command;

public class SimpleRemoteControl {
	Command slot;

	public SimpleRemoteControl() { }
	
	public void setCommand(Command command) {
		slot = command;
	}
	
	public void buttonWasPressed() {
		slot.execute();
	}
}
