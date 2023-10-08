package EX_04_11_03_2023;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animalList  = new ArrayList<>();
        animalList.add(new Bear("Bear"));
        animalList.add(new Cat("Cat"));
        animalList.add(new Cow("Cow"));
        animalList.add(new Dog("Dog"));
        animalList.add(new Duck("Duck"));
        animalList.add(new Frog("Frog"));
        animalList.add(new Horse("Horse"));
        animalList.add(new Lion("Lion"));
        animalList.add(new Rooster("Rooster"));
        animalList.add(new Sheep("Sheep"));
int count = 1;
        for (Animal animal:animalList) {
            System.out.print(count+". ");
            System.out.printf("%s said: ", animal.getClass().getSimpleName());
            animal.makeSound();
            count++;
        }

    }
}
