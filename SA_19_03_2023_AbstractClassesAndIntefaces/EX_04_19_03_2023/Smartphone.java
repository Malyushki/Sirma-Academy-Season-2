package EX_04_19_03_2023;

public class Smartphone extends Phone{
    @Override
    void lift() {
        System.out.println("Lifting.....");
    }

    @Override
    void disconnected() {
        System.out.println("Disconnecting.....");

    }
}
