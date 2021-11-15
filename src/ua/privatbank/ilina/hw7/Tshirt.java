package ua.privatbank.ilina.hw7;

public class Tshirt extends Clothes implements WomenClothes {
    @Override
    public void dressWomen() {

    }

    public Tshirt(Size size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public String toString() {
        return "Tshirt{" +
                "size=" + size +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
