//printing student information using class obj and constructor

class Teacher{
    String name;
    int age;
    int no_of_subj;

    Teacher(String name,int age,int no_of_subj){
        this.name=name;
        this.age=age;
        this.no_of_subj=no_of_subj;
        
    }
    void printinfo(){
        System.out.printf("%s of age %d studies %d subjects",this.name,this.age,this.no_of_subj);

    }
}



public class ex1{
    public static void main( String[] args){
        Teacher t1=new Teacher("mehak",21,6);
        t1.printinfo();


    }
}