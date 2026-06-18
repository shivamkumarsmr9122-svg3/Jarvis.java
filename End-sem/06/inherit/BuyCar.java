import java.util.*;

class car{
    String bname;
    String color;
    double price;

    car( String color,double price){
        this.bname="TATA";
        this.color=color;
        this.price=price;
    }

    void display(){
        System.out.println("Brand Name: "+bname);
        System.out.println("Color Name: "+color);
        System.out.println("Price: "+price);
    }
}

public class BuyCar{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
    
        String color=sc.nextLine();
        double price =sc.nextDouble();

        car ob1=new car(color,price);
        ob1.display();
    
    }
}