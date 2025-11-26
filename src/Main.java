public class Main {
    public static void main(String[] args) {

        Animal[] animals = new Animal[6];

        animals[0] = new Dog("Rex", 5, 20.0, "Brown", "Husky");
        animals[1] = new Mammal("Generic Mammal", 2, 15.0, "Black");
        animals[2] = new Bird("Platypus", 2, 1.0, "White");
        animals[3] = new Pigeon("City Pigeon", 3, 0.4, "Grey", "Rock Pigeon");
        animals[4] = new Fish("Nemo", 1, 5.0, "Orange");
        animals[5] = new Blowfish("Spiky", 2, 1.5, "Yellow", 7.5);

        for (Animal a : animals) {
            System.out.println("=== " + a.getClass().getSimpleName() + " ===");
            System.out.println(a);
            System.out.println("Voice: " + a.getVoice());
            a.eat();

            if (a instanceof Mammal mammal) {
                mammal.drinkMilk();
                if (a instanceof Dog dog) dog.fetch();
            }

            if (a instanceof Bird bird) {
                bird.fly();
                if (a instanceof Pigeon pigeon) pigeon.deliverMessage();
            }

            if (a instanceof Fish fish) {
                fish.swim();
                if (a instanceof Blowfish blowfish) blowfish.inflate();
            }

            System.out.println();
        }
    }
}
