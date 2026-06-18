
import java.util.*;
class grandparent{
    void angerIssue(){
        System.out.println("Grandparent has anger issue");
    }
}
class parent extends grandparent{
    void hardworking(){
        System.out.println("Parent is hardworking");
    }
}
class child extends parent{
    void smart(){
        System.out.println("Child is smart");
    }
}

public class multile{
    public static void main(String args[]){
        child c = new child();
        c.smart();
        c.hardworking();
        c.angerIssue();
        
    }
}
