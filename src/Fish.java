public class Fish extends Animal {

    private String scaleColor;

    public Fish() {
        super();
        this.scaleColor = "Unknown";
    }

    public Fish(String name, int age, double weight, String scaleColor) {
        super(name, age, weight);
        this.scaleColor = scaleColor;
    }

    public Fish(String name, String scaleColor) {
        super(name, 0, 0.0);
        this.scaleColor = scaleColor;
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating algae.");
    }

    @Override
    public String getVoice() {
        return "Blub blub";
    }

    public void swim() {
        System.out.println(getName() + " is swimming.");
    }

    public String getScaleColor() {
        return scaleColor;
    }

    public void setScaleColor(String scaleColor) {
        this.scaleColor = scaleColor;
    }

    @Override
    public String toString() {
        return super.toString() + ", scaleColor='" + scaleColor + "'";
    }
}
