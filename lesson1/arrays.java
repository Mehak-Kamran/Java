//inorder to sort array we need a method sort which is a method described in arrays class Array
import java.util.Arrays;


public class arrays{

    public static void main(String args[]){
        System.out.println("Arrays");
        //initializing array
        int[] marks=new int[4];
        marks[0]=56;
        marks[1]=78;
        marks[2]=44;
        marks[3]=89;
        //in java we cannot print whole array 
        System.out.println(marks[0]);

        //function on array
        //len
        System.out.println(marks.length);
        //sort
        Arrays.sort(marks);
        System.out.println(marks[0]);

        //direct decl
        int[] age={20,30,50};
        System.out.println(age[1]);

        //2d array
        int[][] student={{2,3,5},{4,7,9}};
        System.out.println(student[0][2]);


    }
}