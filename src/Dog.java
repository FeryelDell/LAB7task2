public class Dog extends Mammal {
    private String breed;

    public Dog() {
        super();
        breed = "Unknown";
    }

    public Dog(String name, int age, double weight, String furColor, String breed) {
        super(name, age, weight, furColor);
        this.breed = breed;
    }

    public Dog(String name, String furColor, String breed) {
        super(name, furColor);
        this.breed = breed;
    }

    public void fetch() {System.out.println(getName() + " is fetching the ball!");}

    @Override
    public void eat() {System.out.println(getName() + " is eating dog food.");}

    @Override
    public String getVoice() {return "Woof!";}

    public String getBreed() {return breed;}
    public void setBreed(String breed) {this.breed = breed;}

    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                '}';
    }
}
