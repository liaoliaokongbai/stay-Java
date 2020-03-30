package Day02;

public class Animal {
    String name;
    int age;
    String type;

    public Animal(String name) {
        this.name = name;
    }

    public Animal(String name, int age) {
        this(name);
        this.age = age;
    }

    public Animal(String name, int age, String type) {
        this(name,age);
        this.type = type;
    }

    public static void main(String[] args) {
        Animal a = new Animal("旺财" , 1 , "狗");
        System.out.println(a.name + " " + a.age + " " + a.type);
    }
}
