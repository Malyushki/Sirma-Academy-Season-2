package EX_04_11_03_2023;

public class Lion extends Animal{
    public Lion(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Roar");
    }
}
