import java.util.Scanner;

public class conditionals{
    public static void main(String[] args){

        //operators
        //+ - * etc
        int num=1;
        // System.out.println(num++);//1
        // System.out.println(num);//2
        System.out.println(++num);//2
        System.out.println(num);//2
        //Math
        System.out.println(Math.random());
        //taking input
        System.out.println("Enter your age");
        // Scanner sc=new Scanner(System.in);
        // int age=sc.nextInt();
        // System.out.println(age);
        //comparision operators
        //conditionals
        
        System.out.print("Enter money that you have:");
        Scanner sc=new Scanner(System.in);
        int user_money=sc.nextInt();
        if(user_money==40){
            System.out.println("you can buy notebook only");
        }
        else{
            if(user_money==10){
                System.out.println("You can buy pen only");
            }
            else{
                if(user_money>=50){
                    System.out.println("you can buy both");
                }
                else{
                    if(user_money>=10 && user_money<40){
                        System.out.println("You can buy pen only");
                    }
                    else
                         System.out.println("You cannot buy anything");
                }
                
            }
        }



    }
}