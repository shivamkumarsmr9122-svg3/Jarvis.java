import java.util.*;

class car{
    String brand;
    String color;
    int price;

car (String brand, String color, int price){
    this.brand = brand;
    this.color = color;
    this.price = price;
}
void custmor(){
    System.out.println("Brand :"+brand);
    System.out.println("Color :"+color);
    System.out.println("Price :"+price);
}
}


public class conmat {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String brand = sc.nextLine();
        String color = sc.nextLine();
        int price = sc.nextInt();
        car c = new car(brand, color, price);
        c.custmor();


    }
}