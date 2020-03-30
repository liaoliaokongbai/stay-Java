package Day13;

import javax.swing.*;

public interface Day {
    public static void main(String[] args) {
       // GraphicObject g= new GraphicObject(0,0);
        Circle c = new Circle(0,2);
        c.draw();
        Rectangle r = new Rectangle(
                3, 0);
        r.draw();
    }
  }
