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




public class inheritance{
   public static void main(String[] args){
    Cow c1=new Cow();
    c1.legs=4;
    c1.type="big";
    c1.color="brown";
    c1.printing();
    

    }
}