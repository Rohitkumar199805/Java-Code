 abstract class Parent{
   Parent(){
    System.out.println(" i am a base class constructor");
   }
   public void sayHello(){
    System.out.println("hello");
   }
   abstract public void greet();
}
class Child extends Parent{
    @Override
    public void greet(){
        System.out.println("Good Morning");
    }
}
 abstract class Child2 extends Parent{
    public void th (){
        System.out.println(" I am a good");
    }

}

public class Abstract {
    public static void main(String[] args) {
        Child c1 =  new Child();   // acceptable
        
        // Parent p1 = new Parent();  not acceptable
    }
}
