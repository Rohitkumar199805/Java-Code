interface Bicycle{
    int a =45;
    public void applyBrake(int decrement);
    public void speedUp( int increment);
}
interface HornBicycle{
    public void blowHornk3g();
    public void blowHornmhn();
}
class AvonCycle implements Bicycle, HornBicycle{
    public void blowHorn(){
        System.out.println(" pee pee poo poo");
    }
    public void applyBrake(int decrement){
        System.out.println(" appling brake");
    }
    public void speedUp( int increment){
        System.out.println(" Applying speed");
    }
    public void blowHornk3g(){
        System.out.println(" kabhi khushi kabhi gum");
    }
    public void blowHornmhn(){
        System.out.println(" main hu na");
    }
}


public class Interfaces {
    public static void main(String[] args) {
        AvonCycle cyclerohit = new AvonCycle();
        cyclerohit.applyBrake(1);
        // you can create properties in interface
        System.out.println(cyclerohit.a);
        // you cannot modify the properties in interface as they are final
        // cyclerohit.a=68;
        // System.out.println(cyclerohit.a);
        cyclerohit.blowHornk3g();
        cyclerohit.blowHornmhn();
    }
}
