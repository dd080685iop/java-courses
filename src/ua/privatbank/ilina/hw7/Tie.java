package ua.privatbank.ilina.hw7;

public class Tie extends Clothes implements ManClothes {
    @Override
    public void dressMan() {

    }

    public Tie(Size size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public String toString() {
        return "Tie{" +
                "size=" + size +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
