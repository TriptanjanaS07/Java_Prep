import java.util.*;
public class ElseIf2 {
    public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter the number 1:");
    int num1=sc.nextInt();
    System.out.print("Enter number 2:");
    int num2=sc.nextInt();
    if(num1==num2){
        System.out.println("The numbers are equal");
    } 
    else if(num1>num2){
        System.out.println("Number 1 is greater");   
    }
    else{
        System.out.println("Number 2 is greater");
    }

    

    }
    
    
}
 

