import java.util.*;
public class harryloop {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        /*for(int i=n;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }*/

        /*for(int i=1;i<=10;i++){
            System.out.printf("%d*%d=%d\n",n,i,n*i);
        }*/
        int factorial=1;
        for(int i=n;i>=1;i--){
            factorial=factorial*i;
        }
         System.out.println(factorial);       

    }
    
}
