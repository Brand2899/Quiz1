package view;

import controller.Controller;
import processing.core.PApplet;

public class Main extends PApplet{

	Controller controller;
	
	@Override
	public void settings() {
		size(600,600);
	}
	
	@Override
	public void setup() {
		controller = new Controller(this);
	}
	
	@Override
	public void draw() {
		background(255);
		controller.drawRandomFig();
		controller.hit();
	}
	
	@Override
	public void mousePressed() {
			controller.addRandomFig();
			controller.pauseFig();
	}
	
	public static void main(String[] args) {
		PApplet.main(Main.class.getName());
	}
}