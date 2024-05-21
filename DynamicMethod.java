class Phone{
    public void showTime(){
        System.out.println(" Time is  8am");
    }
    public void on(){
        System.out.println(" Turning phone........");
    }
}
class Smartphone extends Phone{
    public void music(){
        System.out.println(" playing music...");
    }
    public void on(){
        System.out.println(" Turning smartphone");
    }
}
public class DynamicMethod {
    public static void main(String[] args) {
        Phone obj = new Smartphone();
        obj.showTime();
        obj.on();
        // obj.music();  not allowed 
    }
}
