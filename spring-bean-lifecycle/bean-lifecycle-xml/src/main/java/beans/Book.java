package beans;

public class Book {

    String name;
    Book(String name){
        this.name=name;
    }
    public void init(){
        System.out.println("Bean initialized..");
    }
    public void destroy(){
        System.out.println("Bean Destroyed..");
    }
    public void printName(){
        System.out.println("Name of the Book: "+name);
    }
}
