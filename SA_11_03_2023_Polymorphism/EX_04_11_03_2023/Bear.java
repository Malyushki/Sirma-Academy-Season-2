package EX_04_11_03_2023;

public class Bear extends Animal{
    public Bear(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Growl");
    }
}
