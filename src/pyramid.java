/* 
 * File: pyramid.java
 * ------------------------
 * This is my attempt at assignment 2, question 1 (Stanford CSS 2007)
 * The goal is to draw a pyramid of bricks
 * 
 */
import java.awt.Color;

import acm.graphics.*;
import acm.program.*;

public class pyramid extends GraphicsProgram {
/* I must be able to change the following values*/
	public void run() {
		int BRICK_WIDTH = 30;
		int BRICK_HEIGHT = 12;
		int BRICKS_IN_BASE = 14;
		GRect brick = new GRect(BRICK_WIDTH,BRICK_HEIGHT);
		add(brick);
	}
}
