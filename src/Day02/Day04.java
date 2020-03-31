package Day02;
class Dog{
    static int count = 10;
    int age;

    public Dog(int age) {
        this.age = age;
    }
    public static void f1(){
        System.out.println(count);
        System.out.println();
    }
    public void f2(){
        System.out.println(this.age);
        System.out.println(count);
    }
}
public class Day04 {

    public static void main(String[] args) {
       Dog.f1();

    }
}
