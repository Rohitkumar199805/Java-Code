import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        int[] marks=new int[5];
        marks[0]=5;
        marks[1]=89;
        marks[2]=85;
        marks[3]=88;
        marks[4]=828;
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the array Index");
        int b = sc.nextInt();

        System.out.println(" Enter the number you want to divide the value with");
        int number=sc.nextInt();
        try{
            System.out.println(" The value of array index enterd is "+marks[b]);
            System.out.println(" The value of array-value/number is: "+marks[b]/number);
        }

        catch(ArithmeticException e){
            System.out.println(" ArithmeticException occured");
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException occured");
            System.out.println(e);
        }

        catch(Exception e){
            System.out.println(" Some Exception occured");
            System.out.println(e);
        }

    }
}
