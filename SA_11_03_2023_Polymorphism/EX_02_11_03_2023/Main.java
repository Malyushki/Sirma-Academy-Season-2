package EX_02_11_03_2023;

public class Main {
    public static void main(String[] args) {
        Perm perm = new Perm();
        perm.perm(1,2);
        System.out.println("-------------");
        perm.perm(1,2,3);
        System.out.println("-------------");
        perm.perm(1,2,3,4);
    }
}
