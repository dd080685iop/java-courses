package ua.privatbank.ilina.hw6;

public class VetClinic {

    public static void main(String[] args) throws Exception {
        Animal[] animals = new Animal[]{
                new Dog("bone", "at house", 5),
                new Cat("fish", "at home", "Mursik"),
                new Horse("grass", "at the farm", 15)};

        Veterinarian veterinarian = getVetInstance();

        for (int i = 0; i <= 2; i++) {
            veterinarian.treatAnimal(animals[i]);
            System.out.println(animals[i]);
            animals[i].makeNoise();
        }
    }

    private static Veterinarian getVetInstance() throws Exception {
        return (Veterinarian) Class.forName("ua.privatbank.ilina.hw6.Veterinarian")
                .newInstance();
    }
}
