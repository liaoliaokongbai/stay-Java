package Day02;
class Cat{
    int age;
    char gender;

    public Cat(int age, char gender) {
        this.age = age;
        this.gender = gender;
    }
}
public class Day100 {
    public static void main(String[] args) {
        int  n = 10;
        int m = n;
        Cat c1 = new Cat(1,'公');
        Cat c2 = c1;
        System.out.println(c2.gender);
    }
}
