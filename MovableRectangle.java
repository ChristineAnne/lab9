
package lab9;

public class MovableRectangle implements Movable, Drawable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;
    
    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed){
        topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }
    
    @Override
    public String toString(){
        return String.format("Rectangle");
    }
    
    @Override
    public void moveUp(){
        topLeft.y -= topLeft.ySpeed;
        bottomRight.y -= bottomRight.ySpeed;
    }
    
    @Override
    public void moveDown(){
        topLeft.y += topLeft.ySpeed;
        bottomRight.y += bottomRight.ySpeed;
    }
    
    @Override
    public void moveLeft(){
        topLeft.x -= topLeft.xSpeed;
        bottomRight.x -= bottomRight.xSpeed;
    }
    
    @Override
    public void moveRight(){
        topLeft.x += topLeft.xSpeed;
        bottomRight.x += bottomRight.xSpeed;
    }
    
    @Override
    public void render(){
        String[][] array = new String[100][100];
        
        for(int j = 0; j < topLeft.y; j++){
            for(int i = 0; i < bottomRight.x; i++){
                if(topLeft.y == j){     // assuming that rectangle have at least 4 points, points less than 4 are invalid
                    array[i][j] = "*";
                }else if(bottomRight.x == i){
                    array[i][j] = "*";
                    array[i][bottomRight.y] = "*";
                }else {
                    array[i][j] = " ";
                }
            }
            if(topLeft.y == j){
                array[topLeft.x][j] = "*";
            }
        }
        
        for(int j = 0; j < 100; j++){
            for(int i = 0; i < 100; i++){
                System.out.println(array[i][j]);
            }
            System.out.println();
        }
    }
}
