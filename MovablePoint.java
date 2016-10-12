package lab9;

public class MovablePoint implements Movable, Drawable{ 
    int x, y, xSpeed, ySpeed;
    
    public MovablePoint(int x, int y, int xSpeed, int ySpeed){
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    
    @Override
    public String toString(){
        return "Point at location (" + x + "," + y + ").";
    }
    
    @Override
    public void moveUp(){
        y -= ySpeed;
    }
    
    @Override
    public void moveDown(){
        y += ySpeed;
    }
    
    @Override
    public void moveLeft(){
        x -= xSpeed;
    }
    
    @Override
    public void moveRight(){
        x += xSpeed;
    }
    
    @Override
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
package lab9;

public class MovablePoint implements Movable, Drawable{ 
    int x, y, xSpeed, ySpeed;
    
    public MovablePoint(int x, int y, int xSpeed, int ySpeed){
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    
    @Override
    public String toString(){
        return "Point at location (" + x + "," + y + ").";
    }
    
    @Override
    public void moveUp(){
        y -= ySpeed;
    }
    
    @Override
    public void moveDown(){
        y += ySpeed;
    }
    
    @Override
    public void moveLeft(){
        x -= xSpeed;
    }
    
    @Override
    public void moveRight(){
        x += xSpeed;
    }
    
    @Override
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
