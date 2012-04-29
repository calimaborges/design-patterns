package br.com.borgescal.designpatterns.command.implementations.commands;

import br.com.borgescal.designpatterns.command.implementations.receivers.Stereo;
import br.com.borgescal.designpatterns.command.intefaces.Command;

public class StereoOffCommand implements Command {
	Stereo stereo;
	
	public StereoOffCommand(Stereo stereo) {
		this.stereo = stereo;
	}
	
	public void execute() {
		stereo.off();
	}
	
	public void undo() {
		stereo.on();
	}
}
