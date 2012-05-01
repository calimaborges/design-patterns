package br.com.borgescal.designpatterns.facade;

import br.com.borgescal.designpatterns.facade.elements.Amplifier;
import br.com.borgescal.designpatterns.facade.elements.CdPlayer;
import br.com.borgescal.designpatterns.facade.elements.DvdPlayer;
import br.com.borgescal.designpatterns.facade.elements.PopcornPopper;
import br.com.borgescal.designpatterns.facade.elements.Projector;
import br.com.borgescal.designpatterns.facade.elements.Screen;
import br.com.borgescal.designpatterns.facade.elements.TheaterLights;
import br.com.borgescal.designpatterns.facade.elements.Tuner;
import br.com.borgescal.designpatterns.facade.implementation.facades.HomeTheaterFacade;

/**
 * Facade Pattern
 * ==============
 * 
 * **The Facade Pattern** provides a unified interface to a set of interfaces in a
 * subsystem. Facade defines a higher level interface that moakes the subsystem easier 
 * to use. 
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Amplifier amp = new Amplifier();
    	Tuner tuner = new Tuner();
    	DvdPlayer dvd = new DvdPlayer();
    	CdPlayer cd = new CdPlayer();
    	Projector projector = new Projector();
    	TheaterLights lights = new TheaterLights();
    	Screen screen = new Screen();
    	PopcornPopper popper = new PopcornPopper(); 
    	HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, tuner, dvd, cd, projector, screen, lights, popper);
    	
    	homeTheater.watchMovie("Raiders of the Lost Ark");
    	homeTheater.endMovie();
    }
}
