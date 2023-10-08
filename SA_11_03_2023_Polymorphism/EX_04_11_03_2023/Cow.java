package EX_04_11_03_2023;

public class Cow extends Animal{
    public Cow(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Moo");
    }
}
