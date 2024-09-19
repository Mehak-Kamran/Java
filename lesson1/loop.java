public class loop {
//user function
    public static void fun(String name){
        System.out.println(name);
    }

    public static void main(String[] args) {
        // switch
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("nothing to show");
        }

        // loop for while dowhile
        for (int i = 1; i <= 10; i++) {
            // System.out.println(i);
        }
        int i = 1;
        while (i <= 10) {
            // System.out.println(i);
            i++;
        }
        int j = 1;
        do {
            System.out.println(j);
            j++;
        } while (j <= 10);

        //function
        
        fun("mehak");

    }
}
