package EX_01_19_03_2023;

public class Cat extends Animal implements Pet {
    private String name;

    public Cat(String name) {
        super(4);
        this.name = name;
    }
    public Cat() {
        super(4);

    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating a mice..nom nom");
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
    this.name = name;
    }

    @Override
    public void play() {
        System.out.println(getName()+" is playing");
    }
}
