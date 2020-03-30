package Day13;

public class GraphicObject {
    protected int x;
    protected int y;
    public GraphicObject(int x,int y){
        super();
        this.x = x;
        this.y = y;
    }
    public void moveTo(){
        this.y = y;
        this.x = x;
    }
    public void draw(){

    }
}
