import java.util.*;
public class bitset {
    public static void main(String[] args){
        int n=5;
        int pos= 1;
        int shift=1<<pos;

        int newNum= (shift|n);
        System.out.println(newNum);

    }
}
