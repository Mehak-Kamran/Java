//class are blueprint/structure/mold and obj are the creations

//class
//class have properties and methods
class Student{
    String name;
    int age;

   void study(){
    System.out.printf("%s,%d",this.name,this.age);
    
   }
}



public class classandobj{




    public static void main(String[] args){
        //creating obj
        Student s1=new Student();
        s1.name="mehak";
        s1.age=21;
        s1.study();
        Student s2=new Student();
        s2.name="ayesha";
        s2.age=24;
        s2.study();

    }
}