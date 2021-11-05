package ua.privatbank.ilina.hw6;

import java.util.Objects;

public class Dog extends Animal {
    public int age;

    public Dog(String food, String location, int age) {
        this.food = food;
        this.location = location;
        this.age = age;
    }

    @Override
    public String toString() {
        return "I Am a dog. My age is " + age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return age == dog.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age);
    }

    @Override
    public void makeNoise() {
        System.out.println("Gav-gav!");
    }

    @Override
    public void eat() {
        System.out.println("I Am a dog and I Am eating a juicy bone)");
    }
}
// Dog, Cat, Horse переопределяют методы makeNoise, eat.