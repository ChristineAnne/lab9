// i can't figure out nganong muerror sya sa sublime but dili sa cmd
// i think sayop akong package chuchu
// check lang unya

package Lab9;

public class MovablePoint implements Movable{
	int x, y, xSpeed, ySpeed;

	public MovablePoint(int x, int y, int xSpeed, int ySpeed){
		this.x = x;
		this.y = y;
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}

	public String toString(){
		return "";
	}

	public void moveUp(){
		y -= ySpeed;
	}

	public void moveDown(){
		y += ySpeed;
	}

	public void moveLeft(){
		x -= xSpeed;
	}

	public void moveRight(){
		x += xSpeed;
	}
}

