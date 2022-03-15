import java.util.*;
public class bit {
    public static void main(String[] Args){
        int n=1010;
        int pos=2;
        int shift = 1<<pos;
        if((shift & n) == 0){
            System.out.println("Bit is zero");
        }else{
            System.out.println("Bit is non zero");
        }
    }
}
