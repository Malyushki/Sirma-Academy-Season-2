import java.util.Scanner;

class Triplet {


    public static boolean checkP(int a, int b, int c) {
        boolean checkP = (Math.pow(c, 2) == Math.pow(a, 2) + Math.pow(b, 2));
        return checkP;
    }

}

public class EX_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println(Triplet.checkP(a,b,c));
    }
}
