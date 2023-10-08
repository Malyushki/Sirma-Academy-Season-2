package EX_02_28_03_2023;

public class PersonIterator {
    private Person[] persons;
    private int position;

    public PersonIterator(Person[] persons) {
        this.persons = persons;
        this.position = 0;
    }

    public boolean hasNext() {
        return position < this.persons.length;
    }

    public Person next() {
        if (!hasNext()) {
            throw new RuntimeException("No more elements");
        }
        Person person = persons[position];
        position++;
        return person;
    }
}


