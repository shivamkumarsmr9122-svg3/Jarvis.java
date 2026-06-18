import java.util.*;
class student {
    String name;
    int rollno;
    int score;  
    student(String name, int rollno) {
        this.name = name;
        this.rollno = rollno;
    }
}
class update extends student {
    int marks;
    int score;
    update(String name, int rollno, int score) {
        super(name, rollno);
        this.score = score; 
    }
}
public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int rollno = sc.nextInt();
        int score = sc.nextInt();
        update u = new update(name, rollno,  score);
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollno);   
        System.out.println("Score: " + score);
        
    }
}
