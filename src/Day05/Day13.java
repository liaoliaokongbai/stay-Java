package Day05;

class Dog{
    int age;
    String name;
    char colour;
    String kind;
    public Dog(String name ,int age   , String kind , char colour){
        this.age = age;
        this.name = name;
        this.colour = colour;
        this.kind = kind;
    }

}
public class Day13 {
    public static void main(String[] args) {
        Dog d1 = new Dog("多多" , 2 , "哈士奇" , '黑');
        Dog d2 = new Dog("小白" , 5 , "萨摩耶" , '白');
        System.out.println(d1.name );
        System.out.println(d1.age);
        System.out.println(d1.kind);
        System.out.println(d1.colour);
        System.out.println(d2.name );
        System.out.println( d2.age  );
        System.out.println( d2.kind );
        System.out.println(d2.colour);
    }

}
