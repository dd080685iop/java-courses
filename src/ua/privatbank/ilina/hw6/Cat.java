package ua.privatbank.ilina.hw6;

import java.util.Objects;

public class Cat extends Animal {
    public String klichka;

    public Cat(String food, String location, String klichka) {
        this.food = food;
        this.location = location;
        this.klichka = klichka;
    }

    @Override
    public String toString() {
        return "I Am a cat. My klichka is " + klichka;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return Objects.equals(klichka, cat.klichka);
    }

    @Override
    public int hashCode() {
        return Objects.hash(klichka);
    }

    @Override
    public void makeNoise() {
        System.out.println("Meu-Meu!");
    }

    @Override
    public void eat() {
        System.out.println("I Am a cat and I Am eating a juicy " + food + ")");
    }
}
