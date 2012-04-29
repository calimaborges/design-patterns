package br.com.borgescal.designpatterns.command.implementations.commands;

import br.com.borgescal.designpatterns.command.implementations.receivers.CeilingFan;
import br.com.borgescal.designpatterns.command.intefaces.Command;

public class CeilingFanOnCommand implements Command {
	CeilingFan ceilingFan;
	
	public CeilingFanOnCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}
	
	public void execute() {
		ceilingFan.on();
	}
	
	public void undo() {
		ceilingFan.off();
	}
}
