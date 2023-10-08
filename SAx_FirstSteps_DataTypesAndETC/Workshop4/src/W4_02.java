public class W4_02 {
    public static void main(String[] args) {


        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < i + 1; j++) {

                if (j<2 && i<2||i==5){
                    System.out.print("0");
                }else if (j==0||j==i){
                    System.out.print("0");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

