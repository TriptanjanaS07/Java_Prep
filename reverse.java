//import java.util.Scanner;

public class reverse {
    public static void main(String[] args){
        int number=12345;
        int answer=0;
        while(number>0){
            int rem=number%10;
            number=number/10;
            answer=answer*10+rem;
        }
        System.out.println(answer);

    }

    
}
