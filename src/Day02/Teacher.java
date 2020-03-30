package Day02;

public class Teacher {
    String name;
    int age;

    public Teacher(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println(this);
    }

    public String getName() {
        System.out.println("getName this:" + this);
        return this.name;
    }

    public static void main(String[] args) {
        Teacher t1 = new Teacher("张三" , 30);
        System.out.println("t1" + t1);
        System.out.println(t1.getName());
    }
}
