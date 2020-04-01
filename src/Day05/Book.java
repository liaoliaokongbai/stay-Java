package Day05;

public class Book {
    private int code;
    private String bookName;
    private static int sum = 20;
public Book(){
    this(100,"java");
    System.out.println("参数为空的构造函数被调用");
}
    public Book(int code,String bookName){
        this.bookName = bookName;
        this.code = code;
    }


    public void setCode(int code) {
        this.code = code;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
    void display(){
        System.out.println(code +" "+ bookName +" "+sum);
    }

    public static void setSum(int sum) {
        Book.sum = sum;
    }
     public void borrow(){
    sum--;
    }
    public void return1(){
    sum++;
    }
}
class Test{
    public static void main(String[] args) {
        Book bk1,bk2;
        bk2=new Book(1100,"数据结构");
        bk2.display();
        bk2.borrow();
        bk2.borrow();
        bk2.display();
    }

}