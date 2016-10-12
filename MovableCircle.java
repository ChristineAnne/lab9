
package lab9;

public class MovableCircle implements Movable, Drawable {
    private int radius;
    private MovablePoint center;
    
    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius){
        center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }
    
    @Override
    public String toString(){
        return String.format("Circle is located at (%d,%d)", center.x, center.y);
    }
    
    @Override
    public void moveUp(){
        center.moveUp();
    }
    
    @Override
    public void moveDown(){
        center.moveDown();   
    }
    
    @Override
    public void moveLeft(){
        center.moveLeft();
    }
    
    @Override
    public void moveRight(){
        center.moverRight();
    }
     
    @Override // change to fit circle, wa pa ni nachange
    public void render(){
        String[][] array = new String[100][100];
        for(int j = 0; j < 100; j++){
            for(int i = 0; i < 100; i++){
                array[i][j] = " ";
            }
        }
        
        array[x][y] = "*";
        
        for(int i = 0; i < 100; i++){
            for(int j = 0; j < 100; i++){
                System.out.println(array[x][y]);
            }
            System.out.println();
        }
             
    }
}
