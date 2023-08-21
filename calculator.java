import java.util.*;
public class calculator {
    public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter the value of a:");
    int a=sc.nextInt();
    System.out.print("Enter the value of b:");
    int b=sc.nextInt();
    System.out.print("Enter the operation:");
    String operation=sc.next();
    switch(operation){
        case "ADD":System.out.println(a+b);    //case"ADD" -> System.out.println();     Enhanced switch 
        break;                                //case"SUB" -> System.out.println();       No break required
        case "SUB":System.out.println(a-b);
        break;
        case "MUL":System.out.println(a*b);
        break;
        case "DIV":System.out.println(a/b);
        break;
        default:System.out.println("Invalid operation");
    }
    
    

    }
    
    
}

