import java.util.*;
public class str1 {
    public static void main(String Args[]){

    Scanner sc= new Scanner(System.in);
 String firstName= sc.next();
 String lastName= sc.next();
 String fullName= firstName+lastName;
//concatenation
 //System.out.print(fullName);
        //Print every element

        // for(int i=0;i<fullName.length();i++){
        //     System.out.print(fullName.charAt(i) +" ");

        // }

        //Substring
        // String sub= fullName.substring(2,fullName.length());

        // System.out.println(sub);
        //compare two Strings

         if(firstName.compareTo(lastName)==0){
             System.out.println("They are equal");
         }

    }
}
