package EX_04_19_03_2023;

public class Iphone extends Smartphone{

    @Override
    void lift() {
        System.out.println("Iphone is lifting");
    }

    @Override
    void disconnected() {
        System.out.println("Iphone is disconnected");
    }
}
