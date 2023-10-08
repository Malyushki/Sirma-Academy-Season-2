package EX_03_21_03_2023;


public class MaterialFactory {

    public Material getMaterial(String n) {
        switch (n.toLowerCase()) {
            case "concrete":
                return new Concrete();

            case "wood":
                return new Wood();

            case "granit":
                return new Granit();

            default:
                return null;
        }
    }
}

