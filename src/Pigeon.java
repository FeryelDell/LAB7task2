public class Pigeon extends Bird {
    private String species;

    public Pigeon() {
        super();
        species = "Unknown";
    }

    public Pigeon(String name, int age, double weight, String featherColor, String species) {
        super(name, age, weight, featherColor);
        this.species = species;
    }

    public Pigeon(String name, String featherColor, String species) {
        super(name, featherColor);
        this.species = species;
    }

    public void deliverMessage() {System.out.println("The pigeon is delivering a message.");}

    @Override
    public void eat() {System.out.println("Pigeon is pecking at crumbs.");}

    @Override
    public String getVoice() {return "Coo coo";}

    public String getSpecies() {return species;}
    public void setSpecies(String species) {this.species = species;}

    public String toString() {
        return "Pigeon{" +
                "species='" + species + '\'' +
                '}';
    }
}
