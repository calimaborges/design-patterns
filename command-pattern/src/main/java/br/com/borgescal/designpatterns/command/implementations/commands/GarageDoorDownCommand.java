package br.com.borgescal.designpatterns.command.implementations.commands;

import br.com.borgescal.designpatterns.command.implementations.receivers.GarageDoor;
import br.com.borgescal.designpatterns.command.intefaces.Command;

public class GarageDoorDownCommand implements Command {
	GarageDoor garageDoor;
	
	public GarageDoorDownCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}
	
	public void execute() {
		garageDoor.down();
	}
	
	public void undo() {
		garageDoor.up();
	}
}
