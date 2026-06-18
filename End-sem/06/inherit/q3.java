import java.util.*;
class employee {
    String name;
    employee(String name ){
        this.name = name;
    }

}
class developer extends employee {
   developer(String name){
       super(name);
   }
}
class tester extends employee {
   tester(String name){
       super(name);
   }    
}

public class q3 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String type = sc.nextLine();
        String name = sc.nextLine();
        if(type.equalsIgnoreCase("developer")){
            developer d = new developer(name);
            System.out.println(name+" is a developer.");
        }
        else {
            tester t = new tester(name);
            System.out.println(name+" is a tester.");
        }
    }
}
