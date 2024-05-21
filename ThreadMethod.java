/**
 * ThreadMethod
 */
class MyThread5 extends Thread{
    @Override
    public void run(){
        int i =0;
        while (i<1000) {
            System.out.println(" i a  happy");
            i++;
        }
    }
}
class MyThread6 extends Thread{
    @Override
    public void run(){
        int i =0;
        while (i<1000) {
            System.out.println(" i am very happy ");
            i++;
        }
    }
}


public class ThreadMethod {

    public static void main(String[] args) {
        MyThread5 t1 = new MyThread5();
        MyThread6 t2 = new MyThread6();
        t1.start();
        try{
            t1.join();
        }
        catch(Exception e){
                System.out.println(" e");
        }
        // t2.setPriority(10);
        t2.start();
    }
}