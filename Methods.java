import java.util.Scanner;



public class Methods {
    public static void main(String[]args){
        //int ans= sum();
        //System.out.println(ans);
         //String message= hello();
        // System.out.println(message);
        int ans =sum2(10,10);
        System.out.println(ans);



    }
   static int sum(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the first number:");
    int num1=sc.nextInt();
    System.out.println("Enter the second number:");
    int num2=sc.nextInt();
    int sum=num1+num2;
    return sum;


   }


   static String hello(){
    String greeting= "How are you?";
    return greeting;
   }

   //pass value of number when calling in main

   static int sum2(int a,int b){
    int sum=a+b;
    return sum;

   }


    
}
