import java.util.*;

public class function {
    public static void printMyName(String name,int age){
        System.out.println(name);
        System.out.println(age);
        return;
    }
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        String name=sc.next();
        int age=sc.nextInt();
        printMyName(name,age);//call the function
        
    }
}
