import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList <Integer> l1= new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        l2.add(15);
        l2.add(18);
        l2.add(19);
        l2.add(14);
        l2.add(13);
        
        

        l1.add(5);
        l1.add(4);
        l1.add(6);
        l1.add(9);
        l1.add(0,8);
        l1.add(0,5);
        l1.addAll(l2);
        for(int i=0; i<5;i++){
            System.out.println(l1.get(i));
        }
    }
}
