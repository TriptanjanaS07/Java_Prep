import java.util.*;
public class marks {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Marks in Physics is: ");
        float Physics=sc.nextFloat();
        System.out.println("Marks in Biology is: ");
        float Biology=sc.nextFloat();
        System.out.println("Marks in English is: ");
        float English=sc.nextFloat();
        System.out.println("Marks in Maths is: ");
        float Maths=sc.nextFloat();
        System.out.println("Marks in Bengali is: ");
        float Bengali=sc.nextFloat();

        float percentage=((Physics+Biology+English+Maths+Bengali)/500);

        System.out.println("Average percentage is: " + percentage*100 + "%");

        

    }
    
}
