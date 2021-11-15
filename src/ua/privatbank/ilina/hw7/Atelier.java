package ua.privatbank.ilina.hw7;

public class Atelier {
    public static void main(String[] args) {
        Clothes[] clothes = {
                new Tshirt(Size.S, 100, "red"),
                new Skirt(Size.S, 200, "yellow"),
                new Pants(Size.L, 300, "braun"),
                new Tie(Size.L, 400, "white")};
        dressMan(clothes);
        dressWoman(clothes);

    }

    private static void dressMan(Clothes[] clothes) {
        System.out.println("Man's clothes:");
        for (int i = 0; i < clothes.length; i++) {
            if (clothes[i] instanceof ManClothes) {
                System.out.println(clothes[i]);
            }
        }
    }

    private static void dressWoman(Clothes[] clothes) {
        System.out.println("Woman's clothes:");
        for (int i = 0; i < clothes.length; i++) {
            if (clothes[i] instanceof WomenClothes) {
                System.out.println(clothes[i]);
            }
        }
    }

}

//    +    Создать класс Atelier с методом main, и еще двумя статическими методами:
//     +   dressMan(Clothes[] clothes)
//      +  dressWomen(Clothes[] clothes)
//     +   на вход которых будет поступать массив, содержащий все типы одежды.
//       + В методе main создать массив, содержащий все типы одежды,

//      +  и вызвать методы dressMan и dressWomen передав туда этот массив.

//        Метод dressWomen выводит на консоль всю информацию о женской одежде.
//        Метод dressMan выводит на консоль всю информацию о мужской одежде.
//        В методах dressWomen и dressMan использовать оператор instanceof
//        для определения мужская это одежда или женская.
//
//