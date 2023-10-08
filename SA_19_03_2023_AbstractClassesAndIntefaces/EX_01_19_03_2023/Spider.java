package EX_01_19_03_2023;

public class Spider extends Animal{
    public Spider() {
        super(8);
    }

    @Override
    public void eat() {
        System.out.println("Spider is eating insects");
    }
}
