import java.util.Arrays;
import java.util.Scanner;

public class WH_09 {
    public static void main(String[] args) {
       int [] firstArr = new int[] {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Initial array:");
        System.out.println(Arrays.toString(firstArr).replaceAll("[\\[\\],]", ""));
       int temp = 0;
        for (int i = 0; i < firstArr.length; i+=2) {
            temp = firstArr[i];
            firstArr [i] = firstArr[i+1];
            firstArr [i+1] = temp;
        }
        System.out.println("After modifications array:");
        System.out.println(Arrays.toString(firstArr).replaceAll("[\\[\\],]", ""));
    }
}
