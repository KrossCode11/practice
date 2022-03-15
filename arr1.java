import java.util.*;
 public class arr1{

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int m=sc.nextInt();
        
        int[] A= new int[m];


        for(int j=0;j<A.length;j++){

            A[j]=sc.nextInt();
        }
        System.out.println("Enter the Number: ");
        int num= sc.nextInt();

        
        for(int i=0;i<A.length;i++){
            if(num==A[i]){

                System.out.print(i);
            }
                
        }
       
           
    }
 }