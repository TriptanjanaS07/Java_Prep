public class array {
    public static void main(String args[]){
        /*int[] marks=new int[5];
        marks[0]=100;
        marks[1]=70;
        marks[2]=56;
        marks[3]=77;
        marks[4]=89;
        //System.out.println(marks.length);
        //System.out.println(marks[0]);*/


        /*int[] marks;
        marks=new int[5];
        marks[0]=100;
        marks[1]=70;
        marks[2]=56;
        marks[3]=77;
        marks[4]=89;
        System.out.println(marks[0]);*/


        /*int[] marks={10,20,30,40,50,60};
        System.out.println(marks[4]);*/
        /*for (int i:marks){
            System.out.println(i);
        }*/


        //2D ARRAYS
        int [][] flats;
        flats=new int[2][2];
        flats[0][0]=101;
        flats[0][1]=102;
        flats[1][0]=201;
        flats[1][1]=202;
       
    

        System.out.println(flats.length);
        System.out.println("Printing 2D Array using for loop");
        for(int i=0;i<flats.length;i++){
            for(int j=0;j<flats[i].length;j++){
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println(" ");
        }


    }
    
}
