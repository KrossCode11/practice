import java.util.*;
public class arr2D {
    
    public static void main(String Args[]){

        Scanner sc= new Scanner(System.in);
        int rows= sc.nextInt();
        int col= sc.nextInt();
        System.out.print("Enter the number to search: ");
        int num= sc.nextInt();
        int A[][]= new int[rows][col];

        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){

                A[i][j]=sc.nextInt();

            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                if(A[i][j]==num){
                    System.out.println("Number is found");

                    System.out.println("Row number: "+ i);
                    System.out.println("Column number: "+ j);
                }
                    
        
            }
        }

        // for(int i=0;i<rows;i++){
        //     for(int j=0;j<col;j++){

        //         System.out.print(A[i][j] + " ");
                
        //     }
        //     System.out.println();
        // }
    }
}
