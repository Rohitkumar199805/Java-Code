class Pen{
    String color;
    String type;
  
    public void write(){
        System.out.println("Writing something");
    }
   public void printColor(){
    System.out.println(this.color);
   }

}
class Student{
    String name;
    int age;
    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student(String name,int age){
        System.out.println("constructor called");
        this.name=name;
        this.age=age;
    }
}
public class oops {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.color="blue";
        pen1.type="gel";


        Pen pen2 =new Pen();
        pen2.color="black";
        pen2.type="ballpoint";
        pen1.write();
        pen1.printColor();
        pen2.printColor();


        Student s1= new Student("rohit",24);
     
        s1.printInfo();
    }
}
