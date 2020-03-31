package Day02;

public class Day03 {
    public static void f1(int i){
        i = 5;
    }
    public static void f2(Cat c){
        c.age = 2;
    }
    public static void f3(Cat c){
        c = new Cat(3,'母');
    }
    public static void main(String[] args) {
        int n = 10;
        f1(n);
        System.out.println(n);
        Cat c1 = new Cat(1,'公');
        //f2(c1);
        //System.out.println(c1.age);
        f3(c1);
        System.out.println(c1.age);
    }
}
