import java.math.BigDecimal;
import java.util.Scanner;
import java.util.regex.Matcher;

public class W4_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       /*
       1)
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = 0; i <=n; i++) {

           sum +=i;
        }

        System.out.println(sum);
        */

        /*
        2)

        n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <=20 ; i++) {
            System.out.printf("%d * %d = %d%n",n,i,n*i );
        }
        3)
       int n = Integer.parseInt(scanner.nextLine());
        if (n<=10){
            System.out.println("Invalid number");
        }else {
                BigDecimal sumP = new BigDecimal(1);
            for (int i = 10; i <=n ; i++) {
                sumP =   sumP.multiply(new BigDecimal(i));
            }
            System.out.println(sumP);
        }
                                //4\\
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        if (num1==num2){
            System.out.println("Invalid numbers");
        }else {
            for (int i = num1; i <=num2 ; i++) {
                if (i%2==0){
                    sum+=i;
                }

            }
            System.out.println(sum);

        }
                                //5\\
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        if (num1 == num2) {
            System.out.println("Invalid numbers");
        } else {
            for (int i = num1; i <= num2; i++) {
                if (i % 2 == 1) {
                    sum += i;
                    System.out.println(i);
                }

            }
            System.out.println("-----------");
            System.out.println(sum);
        }
                                //6\\
      int num = Integer.parseInt(scanner.nextLine());
        int counter = 0;
            if (num <=1){
                System.out.println("Invalid number");
            }else {

                for (int i = 1; i <=num ; i++) {
                    if (i%3==0 && i %5==0){
                        System.out.println(i);
                        counter++;
                    }
                }
            }
        System.out.println("------");
        System.out.println(counter);

        */

                                    //7\\

        int num = Integer.parseInt(scanner.nextLine());
                                    //8\\



                                    //9\\



                                    //10\\

        /*
                                     //11\\
        int n = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        if (n>=-1){
            System.out.println("Invalid number");
        }else {
            for (int i = -1; i >=n ; i--) {
                if (i%7==0){
                    System.out.println(i);
                    counter++;
                }
            }
        }
        System.out.println("---------");
        System.out.println(counter);
        
         */                //12\\
        /*
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <n ; i++) {
           if (i*i>n){
               break;
           }
           else {
               System.out.println(i);
           }


            
        }

         */   //12\\ s while
/*


        int n = Integer.parseInt(scanner.nextLine());
        int i = 1;
        while (i*i<n){
            System.out.println(i);
            i++;
        }
*/
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int counter = 1;
       while (sum<=n){
           System.out.print(counter+", ");
           sum =counter;
           counter++;
           System.out.print(counter+", ");
           sum +=counter;
       }

    }
}

