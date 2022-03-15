import java.util.*;
public class arr3 {
    public static void main(String Args[]){

        Scanner sc= new Scanner(System.in);
        int size= sc.nextInt();

        int A[]= new int[size];

        for(int i=0;i<A.length;i++){

            A[i]= sc.nextInt();
        }
        //finding max and min

        int max=A[0];
        

        for(int j=0;j<A.length;j++){
           
            if(A[j]>max){
              int temp= max;
                max= A[j];
                A[j]=temp;
            }

        
        }

        for(int k=0;k<A.length;k++){
           
            System.out.print(A[k] + " ");

        
        }
    }
    
}
