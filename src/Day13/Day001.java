package Day13;
class Animal{
    public void bark(){
        System.out.println("不知道");
    }
}
class Dog extends Animal{

    public void bark() {

        System.out.println("往往往往");
    }
    public void run(){
        System.out.println("run");
    }
}
class Cat extends Animal{

    public void bark() {

        System.out.println("喵喵喵");
    }
}
public class Day001 {
    public static void main(String[] args) {
       Animal a1 = new Dog() ;
       a1.bark();
       Dog a2 = (Dog) a1;
       a2.run();
       Animal a3 = new Animal();

    }
}
