package codsoft_task2;
import java.util.*;
public class task2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n[]=new int[5];
        for(int i=0;i<5;i++){
            System.out.println("Enter marks of subject_"+(i+1)+" out of 100.");
            int k=sc.nextInt();
            if(k>100&&k<0)
                System.out.println("Invalid marks!!!");
            else
                n[i]=k;

        }
        int sum=0;


        for(int x:n){
            sum+=x;
        }
        System.out.println("Total marks = "+sum);
        int avg=sum/5;
        System.out.println("Average Percentage = "+avg+"%");
        System.out.print("The student Grade is: ");
        if(avg>=80)

            System.out.print("A");

        else if(avg>=60 && avg<80)

            System.out.print("B");

        else if(avg>=40 && avg<60)

            System.out.print("C");

        else

            System.out.print("D");
        }
    }

