//inheritance 4 types --single level,multi level,hierachy,hybrid

//single level
class Animal{
    int legs;

    
    
}
class Cow extends Animal{
    String color;
    String type;
    public void printing(){
        System.out.println(this.legs);
        System.out.println(this.color);
        System.out.println(this.type);
    }
   
}
//multi level inheritance
class Buffalo extends Cow{
    String gender;
    
    public void info(){
        System.out.println(this.color);
        System.out.println(this.gender);
        System.out.println(this.legs);
    }
}
// hieracy inheritance
class Dog extends Animal{
    String breed;
    
    void breed(){
        System.out.println(this.breed);
        System.out.println(this.legs);
    }

}

//hybrid inhertance
//the whole program is called hybrid inheritance inwhich parent class has two child class cow and dog
//and cow class is further extended with buffalo class where as cow class is also show single inheritance


public class inheritance{
   public static void main(String[] args){
    Cow c1=new Cow();
    c1.legs=4;
    c1.type="big";
    c1.color="brown";
    c1.printing();
    Buffalo b1=new Buffalo();
    b1.gender="male";
    b1.color="black";
    b1.legs=4;
    b1.info();
    Dog d1=new Dog();
    d1.breed="german shepard";
    d1.legs=4;
    d1.breed();


    }
}