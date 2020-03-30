package Day02;

public class Student {
    String name;
    int age;
    char gender;
    public Student(){
        System.out.println("Student()");
    }
    public Student(String newName , int newAge , char newGender){
       name = newName;
       age = newAge;
       gender = newGender;
        System.out.println("String newName , int newAge , char newGender");
    }
    public static class Day1005{
        public static void main(String[] args) {

            Student s1 = new Student();
            Student s2 = new Student("张三" , 20 , '男');
            Student s3 = new Student("李四" , 21 , '女');
            System.out.println(s1.gender);
            System.out.println(s3.name);
            System.out.println();
        }

    }
}
