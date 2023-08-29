import java.util.Scanner;

public class Switch {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
       // String fruit=sc.next();

        
       /*  switch (fruit){
            case "Mango":
            System.out.println("King of fruits");
            break;
           
            case "Apple":
            System.out.println("Red fruit");
            break;

            case "Orange":
            System.out.println("Round fruit");
            break;

            default:
            System.out.println("Please enter a valid fruit");
        }*/


        //Enhanced Switch
        /*switch (fruit){
            case "Mango"->System.out.println("King of fruits");
            case "Apple"->System.out.println("Red fruit");
            case "Orange"->System.out.println("Round fruit");
            default->System.out.println("Enter a valid fruit");
        }*/


        //Nested switch
         int id=sc.nextInt();
         String dept=sc.next();

         switch(id){
            case 1:
            System.out.println("Triptanjana");
            break;

            case 2:
            System.out.println("Sayak");
            break;

            case 3:
            System.out.println("ABCD");
                switch(dept){
                    case "IT":
                    System.out.println("IT Department");
                    break;
                    case"Management":
                    System.out.println("Managing department");
                    break;
                    default:
                    System.out.println("No dept");
                }
            break; 
            default:
            System.out.println("Enter valid empid");   

         }


    }
    
}
