package EX_03_11_03_2023;

public class InterestCalculator {
        public static final double MONTH_INTEREST = 0.05/12;

    public static void compound(double balance){
        balance =balance*(1+MONTH_INTEREST);
        System.out.printf("%.2f",balance);
    }

    public static void compound(double balance,int months){

        balance = balance*Math.pow((1+MONTH_INTEREST),months)    ;
        System.out.printf("%.2f",balance);
    }
}
