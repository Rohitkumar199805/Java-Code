interface sampleInterface{
    public void math1();
    public void math2();
}
interface childSampleInterface extends sampleInterface{
     public void math3();
     public void math4();
}
class MySampleClass implements childSampleInterface{
    public void math3(){
        System.out.println(" math3");

    }
    public void math4(){
        System.out.println("math4");
    }
    public void math1(){
        System.out.println(" math1");
    }
    public void math2(){
        System.out.println(" math2");
    }
}

public class InhertainceInInterface {
    public static void main(String[] args) {
        MySampleClass c1 = new MySampleClass();
        c1.math1();
        c1.math2();
        c1.math3();
        c1.math4();
    }
}
