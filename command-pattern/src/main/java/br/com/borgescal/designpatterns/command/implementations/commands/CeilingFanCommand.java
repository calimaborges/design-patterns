package br.com.borgescal.designpatterns.command.implementations.commands;

import br.com.borgescal.designpatterns.command.implementations.receivers.CeilingFan;
import br.com.borgescal.designpatterns.command.intefaces.Command;

public abstract class CeilingFanCommand implements Command {
	CeilingFan ceilingFan;
	CeilingFan.Speed prevSpeed;
	
	public CeilingFanCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}
	
	public void execute() {
		prevSpeed = ceilingFan.getSpeed();
		ceilingFan.setSpeed(getSpeed());
	}
	
	public void undo() {
		ceilingFan.setSpeed(prevSpeed);
	}
	
	public abstract CeilingFan.Speed getSpeed();
}
