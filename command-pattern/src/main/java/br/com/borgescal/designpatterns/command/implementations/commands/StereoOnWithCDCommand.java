package br.com.borgescal.designpatterns.command.implementations.commands;

import br.com.borgescal.designpatterns.command.implementations.receivers.Stereo;
import br.com.borgescal.designpatterns.command.intefaces.Command;

public class StereoOnWithCDCommand implements Command {
	Stereo stereo;
	
	public StereoOnWithCDCommand(Stereo stereo) {
		this.stereo = stereo;
	}
	
	public void execute() {
		stereo.on();
		stereo.setCD();
		stereo.setVolume(11);
	}
	
	public void undo() {
		stereo.off();
	}
} 
