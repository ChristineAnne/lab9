package lab9;

/**
 * created by Christine Anne Catubig on 10/11/16
 */

import java.io.IOException;

public class Lab9 {
    
    public void sleep(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }

    public void display(Movable p) throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        p.render();
        sleep(2000);
    }
    
    public static void main(String[] args) {
        MovablePoint m1 = new MovablePoint(15, 16, 5, 5);
        display(m1);
        m1.moveDown();
        display(m1);
    }
    
}


