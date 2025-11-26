public class Mammal extends Animal {
    private String furColor;

    public Mammal() {
        super();
        furColor = "Unknown";
    }

    public Mammal(String name, int age, double weight, String furColor) {
        super(name, age, weight);
        this.furColor = furColor;
    }

    public Mammal(String name, String furColor) {
        super(name, 0, 0.0);
        this.furColor = furColor;
    }

    public void drinkMilk(){
        System.out.println("Drink milk");
    }

    @Override
    public void eat() {
        System.out.println("Mammal is eating food.");
    }
    @Override
    public String getVoice() {
        return "Some generic mammal sound";
    }

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    public String toString() {
        return "Mammal{" +
                "furColor='" + furColor + '\'' +
                '}';
    }

}
