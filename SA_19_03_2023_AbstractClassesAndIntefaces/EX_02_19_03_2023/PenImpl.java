package EX_02_19_03_2023;

public class PenImpl extends Pen{


    @Override
    void write() {
        System.out.println("Pen is writing");
    }

    @Override
    void refill() {
        System.out.println("Refilling pen");
    }
}
