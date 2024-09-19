package random_no_generator;
import java.util.Scanner;

public class miniproject {
    public static void random_no(){

    }
    public static void main(String[] args) {
        boolean val=true;
        int random_no=(int) (Math.random()*100);
        System.out.printf("Guess the no from 1-100 , press -1 to quit\n");
        while(val){
            
        Scanner sc=new Scanner (System.in);
        int guess=sc.nextInt();
        
        if(guess<1 || guess>100){
            System.out.println("----end-----");
            System.out.printf("No is %d",random_no);
            val=false;
            break;
        }
        else{
        if(guess==random_no){
            System.out.println("correct");
            val=false;
            break;
        }  
        else{
            if(guess<random_no){
                System.out.println("guess high");
            }
            else{
                if(guess>random_no){
                    System.out.println("guess low");
                }
            }
        }
    }
    }      
    }

    
}
