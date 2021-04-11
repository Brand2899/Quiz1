package model;

import processing.core.PApplet;

public class Triangle extends Figure {

	public Triangle(int tam, int posX, int posY, int direction, int r, int g, int b, int value, PApplet app) {
		super(tam, posX, posY, direction, r, g, b, value, app);
	}

	@Override
	protected void drawFigure() {
		app.fill(0,g,0);		
		app.triangle(getPosX() - getTam() / 2, getPosY() + getTam() / 2, //PosX and PosY 1
					getPosX(), getPosY() - getTam() / 2, //PosX and PosY 2
					getPosX() + getTam() / 2, getPosY()+getTam()/2);	  //PosX and PosY 3
		
		app.fill(255);
		app.textAlign(CENTER);
		app.text(getValue(),getPosX(),getPosY()+ getTam()/3);
	}

}