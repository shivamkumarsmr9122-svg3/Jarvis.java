import java.util.*;
class person{
    String name = "Shivam";
}
class developer extends person{
    String name = "Rahul";
    void display(String name){
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }
}   

public class super2 {
    public static void main(String args[]){
        developer d = new developer();
        d.display("Harsh");
       
    }
}
