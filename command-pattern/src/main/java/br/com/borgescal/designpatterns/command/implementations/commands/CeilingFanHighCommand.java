package br.com.borgescal.designpatterns.command.implementations.commands;

import br.com.borgescal.designpatterns.command.implementations.receivers.CeilingFan;
import br.com.borgescal.designpatterns.command.implementations.receivers.CeilingFan.Speed;

public class CeilingFanHighCommand extends CeilingFanCommand {
	public CeilingFanHighCommand(CeilingFan ceilingFan) {
		super(ceilingFan);
	}
	
	@Override
	public Speed getSpeed() {
		return CeilingFan.Speed.HIGH;
	}
}
