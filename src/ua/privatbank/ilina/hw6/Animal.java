package ua.privatbank.ilina.hw6;

public class Animal {
    public String food;
    public String location;


    public void makeNoise() {
        System.out.println("I Am making a noise now)");
    }

    public void eat() {
        System.out.println("I Am eating now)");
    }

    public void sleep() {
        System.out.println("I Am sleeping now)");
    }
}
//    В пакете hw6 создайте класс Animal и расширяющие его классы Dog, Cat, Horse.
//        Класс Animal содержит переменные food, location и методы makeNoise, eat, sleep.
//        Метод sleep, например, может выводить на консоль "Такое-то животное спит".
//        Dog, Cat, Horse переопределяют методы makeNoise, eat.
//        Добавьте переменные (поля) в классы Dog, Cat, Horse, характеризующие только этих животных.
//        В классах Dog, Cat, Horse переопределить методы toString, equals, hashCode.
//        Создайте класс Veterinarian (Ветеринар), в котором определите метод void treatAnimal(Animal animal).
//        Пусть этот метод печатает на экран food и location пришедшего на прием животного.
//        Создайте класс VetСlinic в его методе main создайте массив типа Animal, в который запишите животных всех имеющихся у вас типов.
//        В цикле отправляйте животных на прием к ветеринару.
//        Объект класса Veterinarian создайте с помощью рефлексии.