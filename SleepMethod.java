class MyThread12 extends Thread{
    @Override
    public void run(){
        int i =0;
        while (i<1000) {
            System.out.println(" Good Morning");
            i++;
        }
    }
}
class MyThread22 extends Thread{
    @Override
    public void run(){
        int i =0;
        while (i<1000) {
            try{
                Thread.sleep(10);
            }
            catch(Exception e){
                 System.out.println(e);
            }
            System.out.println(" Good Afternoon ");
            i++;
        }
    }
}
public class SleepMethod {
    public static void main(String[] args) {
        MyThread12 t1 = new MyThread12();
        MyThread22 t2 = new MyThread22();
        t1.start();
        t2.start();
    }
}
