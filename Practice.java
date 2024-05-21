import java.util.Random;
import java.util.Scanner;
class Game{
    public int number;
    public int inputnumber;
    public int noofGuesses=0;

    public int getNoofGuesses(){
        return noofGuesses;
    }
    public void setNoofGuesses(int noofGuesses){
          this.noofGuesses=noofGuesses;
    }
Game(){
   Random rand = new Random();
   this.number=rand.nextInt(100);
}

void takeUserInput(){
    System.out.println(" Guess the number");
    Scanner sc = new Scanner(System.in);
     inputnumber=sc.nextInt();
     sc.close();
     
}

boolean isCorrectNumber(){
    noofGuesses++;
      if(inputnumber==number){
        System.out.format(" Yes you guessed is right ,it was %d\n.you guessed it in %d attempt",number,noofGuesses);
        return true;
    }else if(inputnumber<number){
        System.out.println(" to low");
    }else if(inputnumber>number){
        System.out.println("no is high");
    }
    
        return false;
      
}
}

public class Practice {
    public static void main(String[] args) {
        Game g = new Game();
        boolean b= false;
        while (!b) {
            g.takeUserInput();
             b = g.isCorrectNumber();
            
        }
    }
}
