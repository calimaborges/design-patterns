package br.com.borgescal.designpatterns.command.implementations.commands;

import br.com.borgescal.designpatterns.command.implementations.receivers.Light;
import br.com.borgescal.designpatterns.command.intefaces.Command;

public class LightOffCommand implements Command {
	Light light;
	
	public LightOffCommand(Light light) {
		this.light = light;
	}
	
	public void execute() {
		light.off();
	}
	
	public void undo() {
		light.on();
	}
}
