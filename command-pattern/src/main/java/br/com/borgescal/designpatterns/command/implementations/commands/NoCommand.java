package br.com.borgescal.designpatterns.command.implementations.commands;

import br.com.borgescal.designpatterns.command.intefaces.Command;

public class NoCommand implements Command {
	public void execute() { }
	public void undo() { }
}
