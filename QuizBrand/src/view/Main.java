package view;

import controller.Controller;
import processing.core.PApplet;

public class Main extends PApplet{
	
	int cont;
	Controller controller;
	
	@Override
	public void settings() {
		size(600,600);
		cont = 0;
	}
	
	@Override
	public void setup() {
		controller = new Controller(this);
	}
	
	@Override
	public void draw() {
		background(225);
		
		if(cont == 0) {
			fill(55);
			textAlign(CENTER);
			textSize(15);
			text("Haz click derecho para comenzar", 300, 300);
			text("a generar figuras", 300, 315);
		}
		
		controller.drawRandomFig();
		controller.hit();
	}
	
	@Override
	public void mousePressed() {
			controller.addRandomFig();
			controller.pauseFig();
			cont = 1;
	}
	
	public static void main(String[] args) {
		PApplet.main(Main.class.getName());
	}
}