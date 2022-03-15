import java.util.*;
public class spiral {
    public static void main(String []args){

       

        Scanner sc = new Scanner(System.in);

     int n = sc.nextInt();

     int m = sc.nextInt();
     int ttl= m*n;

 

     int A[][] = new int[n][m];

     for(int i=0; i<n; i++) {

          for(int j=0; j<m; j++) {

              A[i][j] = sc.nextInt();

          }

     }

   int minr=0;

   int maxr=A.length-1;

   int minc=0;

   int maxc=A[0].length-1;
   int ctr=0;

 

   while(ctr<ttl){

//TW

    for(int i=minc,j=minr;i<=maxc && ctr<ttl;i++){

     System.out.print(A[j][i] + " " );
        ctr++;
    }

    minr++;

    //RW

    for(int i=minr,j=maxc;i<=maxr && ctr<ttl;i++){

 

        System.out.print(A[i][j] + " ");
        ctr++;
    }

    maxc--;

    //BW

    for(int i=maxc,j=maxr;i>=minc && ctr<ttl;i--){

 

        System.out.print(A[j][i] + " ");
        ctr++;
    }

    maxr--;

    //LW

    for(int i=maxr,j=minc;i>=minr && ctr<ttl;i--){

 

        System.out.print(A[i][j]+ " ");
        ctr++;
    }

    minc++;

 

    

   }

   

    }
}
