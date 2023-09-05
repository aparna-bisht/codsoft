package codsoft_task1;
import java.util.*;
public class task1 {
    public static void main(String[] args) {
        Random rand= new Random();
        String n;
        int c=0;
        int attempt=0;
        Scanner sc=new Scanner(System.in);
       while(true)
        {
        System.out.println("start the game type yes or no. ");
        n=sc.next();
       if(n.equals("yes")){
           attempt++;
           int l = rand.nextInt(100) + 1;

            for(int i=2;i>=0;i--) {

                System.out.println("Enter a random no. between 1 to 100");
                int k = sc.nextInt();

                if (k < l)
                    System.out.println("You guessed too low!");
                else if (k > l)
                    System.out.println("You guessed too high!");
                else{
                    if(i==2)
                        c+=30;
                    else if (i==1)
                        c+=20;
                    else c+=10;
                    System.out.println("You guessed correct.Congratulations!");
                break;}
                System.out.println("You got "+i+" chances left.");

            }
            if(c>0){
                if(attempt==1)
           System.out.println("You get it right in "+attempt+" attempt.");
            else  System.out.println("You get it right in "+attempt+" attempts.");}

       else
                System.out.println("The number was "+l+" .Better luck next time!");}
       else break; }


    }
}
