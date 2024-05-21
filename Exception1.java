import java.util.Scanner;

class MyException extends Exception {
    @Override
    public String toString() {
        return " i am toString";
    }
    @Override
    public String getMessage(){
    return " I am getMessage";
    }
}

public class Exception1 {
    public static void main(String[] args) throws Exception {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter a number");
        a = sc.nextInt();
        if (a < 9) {
            try {
                throw new MyException();
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                System.out.println(e);

            }
        }
        sc.close();
    }
}
