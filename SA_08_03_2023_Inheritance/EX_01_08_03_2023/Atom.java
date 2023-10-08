package EX_01_08_03_2023;

public class Atom {
    public String name;
    public int protons;
    public int electrons;

    public Atom(String name, int protons, int electrons) {
        this.name = name;
        this.protons = protons;
        this.electrons = electrons;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProtons(int protons) {
        this.protons = protons;
    }

    public void setElectrons(int electrons) {
        this.electrons = electrons;
    }

    @Override
    public String toString() {
        return String.format("Name: %s, Protons: %d, Electrons: %d",this.name,this.protons,this.electrons);
    }
}
