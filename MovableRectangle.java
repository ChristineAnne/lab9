
public class MovableRectangle extends MovablePoint implements Movable{
	private MovablePoint topLeft;
	private MovablePoint bottomRight;

	public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed){
		topLeft = super(x1, y1, xSpeed, ySpeed);
		bottomRight = super(x2, y2, xSpeed, ySpeed);
	}

	public String toString(){
		return "";
	}

	public void moveUp(){

	}

	public void moveDown(){

	}

	public void moveLeft(){

	}

	public void moveRight(){
		
	}
}