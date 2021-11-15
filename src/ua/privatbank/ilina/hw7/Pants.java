package ua.privatbank.ilina.hw7;

public class Pants extends Clothes implements ManClothes {
    @Override
    public void dressMan() {

    }

    public Pants(Size size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public String toString() {
        return "Pants{" +
                "size=" + size +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
