package main;

import java.awt.Color;
import java.awt.Graphics;

public class Ball {

	public static final int SIZE = 16;

	private int x, y;
	private int xVel, yVel; 
	private int speed = 5; 

	public Ball() {
		reset();
	}

	private void reset() {
		x = Game.WIDTH / 2 - SIZE / 2;
		y = Game.HEIGHT / 2 - SIZE / 2;

		xVel = Game.sign(Math.random() * 2.0 - 1);
		yVel = Game.sign(Math.random() * 2.0 - 1);
	}


	public void draw(Graphics g) {
		g.setColor(Color.white);
		g.fillRect(x, y, SIZE, SIZE);
	}


	public void update(Paddle lp, Paddle rp) {

		// update position
		x += xVel * speed;
		y += yVel * speed;

		// collisions

		// with ceiling and floor
		if (y + SIZE >= Game.HEIGHT || y <= 0)
			changeYDir();

		// right wall

		if (x + SIZE >= Game.WIDTH) { 
			lp.addPoint();
			reset();
		}
		
		// left wall
		
		if (x <= 0) { 
			rp.addPoint();
			reset();
		}
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void changeXDir() {
		xVel *= -1;
	}

	public void changeYDir() {
		yVel *= -1;
	}

}
