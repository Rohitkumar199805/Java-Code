class MyThread1 extends Thread{
    @Override
    public void run(){
        int i =0;
        while(i<1000){
            System.out.println(" i  am first thread class");
            i++;
        }
    }


    }
    class MyThread2  extends Thread{
        @Override
        public void run(){
            int i =0;
            while(i<1000){
                System.out.println(" i am second thread class");
                i++;
            }
        }
    }



public class CreateThread {
    public static void main(String[] args) {
        MyThread1 t1= new MyThread1();
        MyThread2 t2= new MyThread2();
        t1.start();
        t2.start();
    }
}
