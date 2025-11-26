public class Bird extends Animal {
    private String featherColor;

    public Bird() {
        super();
        featherColor = "Unknown";
    }

    public Bird(String name, int age, double weight, String featherColor) {
        super(name, age, weight);
        this.featherColor = featherColor;
    }

    public Bird(String name, String featherColor) {
        super(name, 0, 0.0);
        this.featherColor = featherColor;
    }

    public void fly() {
        System.out.println("The bird is flying.");
    }

    @Override
    public void eat() {
        System.out.println("Bird is eating seeds.");
    }

    @Override
    public String getVoice() {
        return "Chirp chirp";
    }

    public String getFeatherColor() {
        return featherColor;
    }

    public void setFeatherColor(String featherColor) {
        this.featherColor = featherColor;
    }

    public String toString() {
        return "Bird{" +
                "featherColor='" + featherColor + '\'' +
                '}';
    }
}
