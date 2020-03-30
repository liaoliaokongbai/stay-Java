package Dog;

public class Day01 {
    public static void main(String[] args) {
       Dog d = new Dog();
        d.name = "豆豆";
        d.age = 5;
        d.kind = "哈士奇";
        d.colcour = '红';
        System.out.println(d.age + d.name + d.kind);
        int age = d.age;
        System.out.println(age);
    }
}
