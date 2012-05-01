package br.com.borgescal.designpatterns.facade.implementation.facades;

import br.com.borgescal.designpatterns.facade.elements.Amplifier;
import br.com.borgescal.designpatterns.facade.elements.CdPlayer;
import br.com.borgescal.designpatterns.facade.elements.DvdPlayer;
import br.com.borgescal.designpatterns.facade.elements.PopcornPopper;
import br.com.borgescal.designpatterns.facade.elements.Projector;
import br.com.borgescal.designpatterns.facade.elements.Screen;
import br.com.borgescal.designpatterns.facade.elements.TheaterLights;
import br.com.borgescal.designpatterns.facade.elements.Tuner;

public class HomeTheaterFacade {
	Amplifier amp;
	Tuner tuner;
	DvdPlayer dvd;
	CdPlayer cd;
	Projector projector;
	TheaterLights lights;
	Screen screen;
	PopcornPopper popper;
	
	public HomeTheaterFacade(Amplifier amp,
			Tuner tuner,
			DvdPlayer dvd,
			CdPlayer cd,
			Projector projector,
			Screen screen,
			TheaterLights lights,
			PopcornPopper popper) {
		this.amp = amp;
		this.tuner = tuner;
		this.dvd = dvd;
		this.cd = cd;
		this.projector = projector;
		this.screen = screen;
		this.lights = lights;
		this.popper = popper;
	}
	
	public void watchMovie(String movie) {
		System.out.println("Get ready to watch a movie...");
		popper.on();
		popper.pop();
		lights.dim(10);
		screen.down();
		projector.on();
		projector.wideScreenMode();
		amp.on();
		amp.setDvd(dvd);
		amp.setSurroundSound();
		amp.setVolume(5);
		dvd.on();
		dvd.play(movie);
	}
	
	public void endMovie() {
		System.out.println("Get ready to watch a movie...");
		popper.off();
		lights.on();
		screen.up();
		projector.off();
		amp.off();
		dvd.stop();
		dvd.eject();
		dvd.off();
	}
}
