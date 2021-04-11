package model;

import processing.core.PApplet;

public class Circle extends Figure {

	public Circle(int tam, int posX, int posY, int direction, int r, int g, int b,int value, PApplet app) {
		super(tam, posX, posY, direction, r, g, b, value, app);
	}

	@Override
	protected void drawFigure() {
		app.fill(r,0,0);
		app.ellipse(posX, posY, tam, tam);
		
		app.fill(0);
		app.textAlign(CENTER);
		app.text(getValue(),getPosX(),getPosY());
	}

}
