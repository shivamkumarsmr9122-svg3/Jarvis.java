import java.util.*;
class animal{
    String name;
    animal(String name){
        this.name = name;
    }
}
class dog extends animal{
   String breed;
   dog(String name, String breed){
       super(name);
       this.breed = breed;
   }        
}

public class q1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter dog's name: ");
        String name = sc.nextLine();
        System.out.print("Enter dog's breed: ");
        String breed = sc.nextLine();
        dog d = new dog(name, breed);   
        System.out.println("Dog's name: " +name);
        System.out.println("Dog's breed: " +breed);
    }
    
}
