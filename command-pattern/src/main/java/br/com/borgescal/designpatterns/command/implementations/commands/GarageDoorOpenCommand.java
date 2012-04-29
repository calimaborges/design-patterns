package br.com.borgescal.designpatterns.command.implementations.commands;

import br.com.borgescal.designpatterns.command.implementations.receivers.GarageDoor;
import br.com.borgescal.designpatterns.command.intefaces.Command;

public class GarageDoorOpenCommand implements Command {
	GarageDoor garageDoor;
	
	public GarageDoorOpenCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}
	
	public void execute() {
		garageDoor.up();
	}
}
