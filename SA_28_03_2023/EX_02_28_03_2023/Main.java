package EX_02_28_03_2023;


public class Main {
    public static void main(String[] args) {
        Person[] personList = {
                (new Person("Pavlin", 30)),
                (new Person("Neshe", 32)),
                (new Person("Marsel", 5)),
                (new Person("Kodi", 1))};

        PersonIterator personIterator = new PersonIterator(personList);
        while (personIterator.hasNext()) {
            Person person = personIterator.next();
            System.out.println(person);
        }

    }

}
