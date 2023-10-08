package EX_03_19_03_2023;

public class Human extends Monkey implements Animal {
    @Override
    public void eat() {
        System.out.println("Human is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Human is sleeping");

    }

    @Override
    void jump() {
        System.out.println("Human is jumping around");
    }

    @Override
    void bite() {

        System.out.println("Human biting with sharp teeth");

    }
}
