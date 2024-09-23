//polymorphism
//2 types--function overloading (compile time), function overriding(run time)

//function overloading (compile time)

class House{
     String color;
     int no_of_doors;

     public void houseinfo(String color){
        this.color=color;
        System.out.println(this.color);

     }
     public void houseinfo(int no_of_doors){
        this.no_of_doors=no_of_doors;
        System.out.println(this.no_of_doors);

     }
}




public class polymorphism{



    public static void main(String[] args){
        //crete obj
        House house1=new House();
        house1.houseinfo("blue");
    
        

    }
}