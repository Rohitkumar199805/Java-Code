
class Circle{
    public int radius;
    Circle(int r){
        System.out.println(" i am a circle parameterized constructor");
        this.radius=r;
    }
    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}
class Cylinder1 extends Circle{
    public int height;
    Cylinder1(int r,int h){
        super(r);
        System.out.println(" i am a cylinder1 parameterized constructor");
        this.height=h;
    }
    public double volume(){
        return Math.PI*this.radius*this.radius*this.height;
    }
    }
       
public class problem1 {
    public static void main(String[] args) {
        Cylinder1 c1= new Cylinder1(12, 4);
        
    }
}
