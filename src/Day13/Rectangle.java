package Day13;

public class Rectangle extends GraphicObject {
    public Rectangle(int x, int y) {
        super(x, y);
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("画一个矩形[" + x + "," + y + "]");
    }
}
