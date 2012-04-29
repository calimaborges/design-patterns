package br.com.borgescal.designpatterns.command;

import br.com.borgescal.designpatterns.command.implementations.commands.CeilingFanHighCommand;
import br.com.borgescal.designpatterns.command.implementations.commands.CeilingFanMediumCommand;
import br.com.borgescal.designpatterns.command.implementations.commands.CeilingFanOffCommand;
import br.com.borgescal.designpatterns.command.implementations.commands.GarageDoorDownCommand;
import br.com.borgescal.designpatterns.command.implementations.commands.GarageDoorUpCommand;
import br.com.borgescal.designpatterns.command.implementations.commands.LightOffCommand;
import br.com.borgescal.designpatterns.command.implementations.commands.LightOnCommand;
import br.com.borgescal.designpatterns.command.implementations.commands.MacroCommand;
import br.com.borgescal.designpatterns.command.implementations.commands.StereoOffCommand;
import br.com.borgescal.designpatterns.command.implementations.commands.StereoOnWithCDCommand;
import br.com.borgescal.designpatterns.command.implementations.invoker.RemoteControl;
import br.com.borgescal.designpatterns.command.implementations.receivers.CeilingFan;
import br.com.borgescal.designpatterns.command.implementations.receivers.GarageDoor;
import br.com.borgescal.designpatterns.command.implementations.receivers.Light;
import br.com.borgescal.designpatterns.command.implementations.receivers.Stereo;
import br.com.borgescal.designpatterns.command.intefaces.Command;


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
        Stereo stereo = new Stereo("");
        
        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);
        
        CeilingFanHighCommand ceilingFanHigh  = new CeilingFanHighCommand(ceilingFan);
        CeilingFanMediumCommand ceilingFanMedium  = new CeilingFanMediumCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff  = new CeilingFanOffCommand(ceilingFan);
        
        GarageDoorUpCommand garageDoorUp = new GarageDoorUpCommand(garageDoor);
        GarageDoorDownCommand garageDoorDown = new GarageDoorDownCommand(garageDoor);
        
        StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);
        
        Command[] partyOn = { livingRoomLightOn, stereoOnWithCD, ceilingFanHigh };
        Command[] partyOff = { livingRoomLightOff, stereoOff, ceilingFanOff };
        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);
        
        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
        remoteControl.setCommand(2, ceilingFanHigh, ceilingFanOff);
        remoteControl.setCommand(3, ceilingFanMedium, ceilingFanOff);
        remoteControl.setCommand(4, stereoOnWithCD, stereoOff);
        remoteControl.setCommand(5, garageDoorUp, garageDoorDown);
        remoteControl.setCommand(6, partyOnMacro, partyOffMacro);
        
        System.out.println(remoteControl);
        
        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();
        
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();
        
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();
        
        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(3);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();
        
        remoteControl.onButtonWasPushed(4);
        remoteControl.offButtonWasPushed(4);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();
        
        remoteControl.onButtonWasPushed(5);
        remoteControl.offButtonWasPushed(5);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();
        
        remoteControl.onButtonWasPushed(6);
        remoteControl.offButtonWasPushed(6);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();
    }
}
