abstract class Pen{
   abstract public void write();
   abstract public void refill();
}
class Fountainpen extends Pen{
    public void write(){
        System.out.println(" Write Somethigs");
    }
    public void refill(){
        System.out.println(" Read Somethings");
    }
    public void changeNib(){
        System.out.println(" Changing the  Nib");
    }
}
public class Problem2 {
    public static void main(String[] args) {
        Fountainpen f1 = new Fountainpen();
        f1.changeNib();
        f1.write();
        f1.refill();
    }
}
