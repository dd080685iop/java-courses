package ua.privatbank.ilina.hw6;

import java.util.Objects;

public class Horse extends Animal {
    public int height;

    public Horse(String food, String location, int height) {
        this.food = food;
        this.location = location;
        this.height = height;
    }

    @Override
    public String toString() {
        return "I Am a horse and my height is " + height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Horse horse = (Horse) o;
        return height == horse.height;
    }

    @Override
    public int hashCode() {
        return Objects.hash(height);
    }

    @Override
    public void makeNoise() {
        System.out.println("I-go-go i-go-go!");
    }

    @Override
    public void eat() {
        System.out.println("I Am a horse and I Am eating a juicy grass)");
    }
}
