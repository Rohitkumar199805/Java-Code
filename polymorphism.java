class Student{
    String name;
    int age;
    public void printInfo(String name){
      System.out.println(this.name);
    }
    public void printInfo(int age){
        System.out.println(this.age);
      }
      public void printInfo(){
        System.out.println(this.name);
      }
      public void printInfo(String name,int age){
        System.out.println(name+" "+age);
      }
    }

public class polymorphism {
    public static void main(String[] args) {
        Student s1= new Student();
        s1.name="rohit";
        s1.age=24;

        s1.printInfo(s1.name,s1.age);

    }
}
