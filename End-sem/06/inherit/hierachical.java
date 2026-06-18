class animal{
    void eat(){
        System.out.println("eating...");
    }
    void sleep(){
        System.out.println("sleeping...");
    }
}
class dog extends animal{
    void bark(){
        System.out.println("barking...");
    }
}
class cat extends animal{
    void meow(){
        System.out.println("meowing...");
    }
}

public class hierachical {
    public static void main(String args[]){
        dog d = new dog();
        d.eat();
        d.sleep();
        d.bark();
        cat c = new cat();
        c.eat();
        c.sleep();
        c.meow();

    }
    
}
