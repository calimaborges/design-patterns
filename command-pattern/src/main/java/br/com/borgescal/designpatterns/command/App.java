package br.com.borgescal.designpatterns.command;

import br.com.borgescal.designpatterns.command.implementations.commands.GarageDoorOpenCommand;
import br.com.borgescal.designpatterns.command.implementations.commands.LightOnCommand;
import br.com.borgescal.designpatterns.command.implementations.invoker.SimpleRemoteControl;
import br.com.borgescal.designpatterns.command.implementations.receivers.GarageDoor;
import br.com.borgescal.designpatterns.command.implementations.receivers.Light;


/**
 * Command Pattern
 * ===============
 * 
 * **The Command Pattern** encapsulates a request as an object, thereby letting you
 * parameterize other objects with different requests, queue or log requests, and
 * support undoable operations. 
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        
        Light light = new Light();
        GarageDoor garageDoor = new GarageDoor();
        
        LightOnCommand lightOn = new LightOnCommand(light);
        GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(garageDoor);
        
        remote.setCommand(lightOn);
        remote.buttonWasPressed();
        remote.setCommand(garageOpen);
        remote.buttonWasPressed();
    }
}
