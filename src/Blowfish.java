public class Blowfish extends Fish {

    private double toxinLevel;

    public Blowfish() {
        super();
        this.toxinLevel = 0.0;
    }

    public Blowfish(String name, int age, double weight, String scaleColor, double toxinLevel) {
        super(name, age, weight, scaleColor);
        this.toxinLevel = toxinLevel;
    }

    public Blowfish(String name, String scaleColor, double toxinLevel) {
        super(name, scaleColor);
        this.toxinLevel = toxinLevel;
    }

    public void inflate() {System.out.println(getName() + " is inflating.");}

    @Override
    public void eat() {System.out.println(getName() + " is eating small sea creatures.");}

    @Override
    public String getVoice() {return "Plop plop";}

    public double getToxinLevel() {return toxinLevel;}
    public void setToxinLevel(double toxinLevel) {this.toxinLevel = toxinLevel;}

    @Override
    public String toString() {return super.toString() + ", toxinLevel=" + toxinLevel;}
}
