class Shape{
    public void area(){
        System.out.println("display area");
    }
}
// single level inheritance
class Traingle extends Shape{
     public void area(int l,int h){
        System.out.println(1/2*l*h);
     }
}

// multilevel inheritance
// class EquilateralTraingle extends Traingle{
//     public void area(int l,int h){
//         System.out.println(1/2*l*h);
//      }
// }



// hierarchial inheritance
class Circle extends Shape{
   public void area(int r){
    System.out.println((3.14)*r*r);
   }
}
public class inheritance {

    public static void main(String[] args) {
        Traingle t1=new Traingle();
        t1.area(20, 5);
        t1.area();
    }
}