import java.util.*;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class arr2 {
    
    public static void main(String Args[]){

        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        String A[]= new String[num];

        for(int i=0;i<A.length;i++){

            A[i]=sc.next();
        }

        for(int d=0;d<A.length;d++){

            System.out.print(A[d]+ " ");
        }

    }
}
