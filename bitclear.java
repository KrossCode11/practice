import java.util.*;
public class bitclear {
    public static void main(String[] args){
        int num=5;
        int pos= 2;
        int BitMask=1<<pos;

        int NewBM=~BitMask;

        int Result=(NewBM & num);
        System.out.println(Result);
    }
}
