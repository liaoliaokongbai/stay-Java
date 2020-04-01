package Day02;

public class Person {
    String name;
    int age;
    char gender;

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }
    public void Add(){
        System.out.println(name);
        System.out.println(age);
    }

        public static void main(String[] args) {
            Person p1 = new Person();

        }
    }


