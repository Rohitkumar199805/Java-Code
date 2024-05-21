class  MyThread extends Thread{
    public MyThread(String name){
        super(name);
    }
        public void run(){
            int i =34;
            System.out.println(" I am happy");
        }

        
    }

public class ThreadConstructor {
    public static void main(String[] args) {
        MyThread t1= new MyThread("rohit");
        MyThread t2 = new MyThread("rohan");
        t1.start();
        System.out.println(" the name of my thread  t is " + t1.getName());
        System.out.println(" the class of my thread t is " + t1.getClass());
        System.out.println("the name of my thread t2 is " +t2.getName());
    }
}
