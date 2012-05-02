package br.com.borgescal.designpatterns.template.implementations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import br.com.borgescal.designpatterns.template.interfaces.CaffeineBeverage;

public class Coffee extends CaffeineBeverage {
	public void brew() {
		System.out.println("Dripping Coffee through filter");
	}
	
	public void addCondiments() {
		System.out.println("Adding Sugar and Milk");
	}
	
	public boolean customerWantsCondiments() {
		String answer = getUserInput();
		
		if (answer.toLowerCase().startsWith("y")) {
			return true;
		} else {
			return false;
		}
	}
	
	private String getUserInput() {
		String answer = null;
		System.out.print("Would you like milk and sugar with your coffee (y/n)? ");
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			answer = in.readLine();
		} catch (IOException ioe) {
			System.err.println("IO error trying to read your answer");
		}
		
		if (answer == null) {
			return "no";
		}
		
		return answer;
	}
}
