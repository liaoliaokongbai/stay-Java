package Day13;

public class Circle extends GraphicObject {

    public Circle(int x, int y) {
        super(x, y);
    }


    public void draw() {
        System.out.println("画一个圆["+ x + "," + y + "]");
    }
}
