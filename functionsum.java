import java.util.*;
public class functionsum {
    public static void returnSum(int num1,int num2){
        int sum=num1+num2;
        System.out.println(sum);
    }
    public static int returnPdt(int num1,int num2){
        int product=num1*num2;
        return product;
        
    }
    public static int factorial(int a){
        if(a<0){
            System.out.println("Invalid Number");
        }
       
       int fact=1;
       for(int i=1;i<=a;i++){
        fact=fact*i;
       }
    
       return fact;
    }


    public static int sub(int num1,int num2){
        return num1-num2;
    }
    public static void main (String args[]){
         Scanner sc=new Scanner(System.in);
         int num1=sc.nextInt();
         //int num2=sc.nextInt();
        // returnSum(num1,num2);//call function
        //int product=returnPdt(num1,num2);
        //System.out.println(product);
        System.out.println("The factorial is " + factorial(num1));

         
    }
}
