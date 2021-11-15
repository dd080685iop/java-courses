package ua.privatbank.ilina.hw7;

public class Skirt extends Clothes implements WomenClothes {
    @Override
    public void dressWomen() {

    }

    public Skirt(Size size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public String toString() {
        return "Skirt{" +
                "size=" + size +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
