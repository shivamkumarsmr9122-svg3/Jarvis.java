import java.util.*;
class person{
   void walk(){
       System.out.println("Person is walking...");
   }
}
class developer extends person{
    void walk(){
        super.walk();
        System.out.println("Developer is walking...");
    }
}
public class super3 {
    public static void main(String args[]){
        developer d = new developer();
        d.walk();
       
    }
    
}
