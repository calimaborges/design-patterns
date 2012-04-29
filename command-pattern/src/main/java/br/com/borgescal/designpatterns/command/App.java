package br.com.borgescal.designpatterns.command;

import br.com.borgescal.designpatterns.command.implementations.commands.CeilingFanOffCommand;
import br.com.borgescal.designpatterns.command.implementations.commands.CeilingFanOnCommand;
import br.com.borgescal.designpatterns.command.implementations.commands.GarageDoorDownCommand;
import br.com.borgescal.designpatterns.command.implementations.commands.GarageDoorUpCommand;
import br.com.borgescal.designpatterns.command.implementations.commands.LightOffCommand;
import br.com.borgescal.designpatterns.command.implementations.commands.LightOnCommand;
import br.com.borgescal.designpatterns.command.implementations.commands.StereoOffCommand;
import br.com.borgescal.designpatterns.command.implementations.commands.StereoOnWithCDCommand;
import br.com.borgescal.designpatterns.command.implementations.invoker.RemoteControl;
import br.com.borgescal.designpatterns.command.implementations.receivers.CeilingFan;
import br.com.borgescal.designpatterns.command.implementations.receivers.GarageDoor;
import br.com.borgescal.designpatterns.command.implementations.receivers.Light;
import br.com.borgescal.designpatterns.command.implementations.receivers.Stereo;


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
        RemoteControl remoteControl = new RemoteControl();
        
        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        CeilingFan ceilingFan = new CeilingFan("Living Room");
        GarageDoor garageDoor = new GarageDoor("");
        Stereo stereo = new Stereo();
        
        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);
        
        CeilingFanOnCommand ceilingFanOn  = new CeilingFanOnCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff  = new CeilingFanOffCommand(ceilingFan);
        
        GarageDoorUpCommand garageDoorUp = new GarageDoorUpCommand(garageDoor);
        GarageDoorDownCommand garageDoorDown = new GarageDoorDownCommand(garageDoor);
        
        StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);
        
        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
        remoteControl.setCommand(2, ceilingFanOn, ceilingFanOff);
        remoteControl.setCommand(3, stereoOnWithCD, stereoOff);
        remoteControl.setCommand(4, garageDoorUp, garageDoorDown);
        
        System.out.println(remoteControl);
        
        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(3);
        remoteControl.onButtonWasPushed(4);
        remoteControl.offButtonWasPushed(4);
        
    }
}
