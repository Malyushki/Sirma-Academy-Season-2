package EX_04_19_03_2023;

public class Main {
    public static void main(String[] args) {

        Smartphone smartphone = new Smartphone();
        Iphone iphone = new Iphone();


        smartphone.lift();

        smartphone.disconnected();

        iphone.lift();

        iphone.disconnected();

    }
}
