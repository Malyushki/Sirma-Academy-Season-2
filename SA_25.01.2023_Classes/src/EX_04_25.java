import java.util.Scanner;
class Trip{


    public static double calcPrice(int days,int bedsCount){
    double bedPrice = 75;
    double ticket = 150;
return days*bedsCount*bedPrice+ticket*2;
    }
}

public class EX_04_25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        int bedsCount = Integer.parseInt(scanner.nextLine());
        System.out.println(Trip.calcPrice(days,bedsCount));
    }
}
