import java.util.ArrayList;

 class Animal {
    String name;

    String color;

    public Animal(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }
}

class Bird extends Animal {
    public Bird(String name, String color) {

        super(name, color);
    }
}

class Fish extends Animal {
    public Fish(String name, String color) {
        super(name,color );
    }
}

public class EX_01_16_03_2023 {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<Animal>();
        animals.add(new Bird("Sparrow","Gray" ));
        animals.add(new Bird("Eagle", "Grey"));
        animals.add(new Bird("Penguin", "Black and White"));
        animals.add(new Fish("Salmon", "Pink"));
        animals.add(new Fish("Tuna", "Blue"));
        animals.add(new Fish("Shark", "Grey"));
        animals.add(new Animal("Lion", "Brown"));
        animals.add(new Animal("Snake", "Yellow"));
        animals.add(new Animal("Bear", "Brown"));
        animals.add(new Animal("Wolf", "Grey"));
        animals.add(new Animal("Zebra", "Black and White"));
        for (Animal animal : animals) {
            System.out.println(animal.getName() + " - " + animal.getColor());
        }
    }
}
