public class arrayprac {
    public static void main(String args[]){
        //Problem 1
        /*float[] abc=new float[5];
        abc[0]=2.2f;
        abc[1]=3.1f;
        abc[2]=4.4f;
        abc[3]=5.0f;
        abc[4]=2.2f;
        float sum=0;
        for(float i:abc){
            sum=sum+i;
            System.out.println(sum);
        }

    }*/
    


    //problem 2
    /*float[] abc=new float[5];
        abc[0]=2.2f;
        abc[1]=3.1f;
        abc[2]=4.4f;
        abc[3]=5.0f;
        abc[4]=2.2f;
        float num=4.4f;
        boolean isInArray=false;
        for(float i:abc){
            if(num==i){
                isInArray=true;
                break;
            }
        }
        if (isInArray){
            System.out.println("The value is present in array");
        }
        else{
            System.out.println("The value is not present in the array");
        }




}*/
//problem 3
           /*int [] physics={88,97,45,34,65,35};
           int sum=0;
           for(int i:physics){
            sum=sum+i;
           }
            System.out.println("The average of marks is"+ (sum/physics.length));

        








    }*/
    //problem 4
int [][] mat1={{2,3,4},
              {1,2,3}} ;
int [][] mat2={{2,5,6},
               {1,1,1}};
int [][] result={{0,0,0},
                  {0,0,0}};
 for(int i=0;i<mat1.length;i++){
    for(int j=0;j<mat1[i].length;j++){
        
        System.out.printf("Setting value for i=%d and j=%d\n",i,j);
       
        result[i][j]=mat1[i][j]+mat2[i][j];
         System.out.println(result[i][j]);



    }

 }                   


}
         
}
