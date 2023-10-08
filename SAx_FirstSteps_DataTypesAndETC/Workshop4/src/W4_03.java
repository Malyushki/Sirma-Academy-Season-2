import java.util.Scanner;

public class W4_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
                if (i==0 || i ==n-1|| i ==(n/2)){
                    System.out.print("0");
                }else if(j==0){
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}
