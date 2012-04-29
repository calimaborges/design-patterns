package br.com.borgescal.designpatterns.command.implementations.commands;

import br.com.borgescal.designpatterns.command.implementations.receivers.Light;
import br.com.borgescal.designpatterns.command.intefaces.Command;

public class LightOnCommand implements Command {
	Light light;
	
	public LightOnCommand(Light light) {
		this.light = light;
	}
	
	public void execute() {
		light.on();
	}
}
