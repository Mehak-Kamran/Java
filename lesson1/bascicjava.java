//first program in java 
//basic syntax

public class bascicjava{

    public static void main(String args[]){

        System.out.println("hello world");
        System.out.print("hey");
        int age=20;
        long no=3000000L;
        String name="mehak";
        System.out.println(name.charAt(0));
        System.out.println(name.replace('m','n'));
        System.out.println(name.substring(0,3));
        int len=name.length();
        System.out.printf("name is %s length of name is %d ",name,len);
        String name1="mak";
        String name2="tak";
        System.out.println(name1 + name2);
        System.out.printf( "%d  %d",age,no);
    }
}
