package ua.privatbank.ilina.hw7;

public enum Size {
    XXS("Детский размер", 32),
    XS("Взрослый размер", 34),
    S("Взрослый размер", 36),
    M("Взрослый размер", 38),
    L("Взрослый размер", 40);

    private String description;
    private int euroSize;

    Size(String description, int euroSize) {
        this.description = description;
        this.euroSize = euroSize;
    }


    public String getDescription() {
        return description;
    }

    public int getEuroSize() {
        return euroSize;
    }


}
//    Создать пакет hw7 и в нем создать перечисление (enum) Size
//    со значениями XXS, XS, S, M, L.

//    Перечисление содержит метод getDescription(),
//    возвращающий строку для XXS "Детский размер",
//    для остальных "Взрослый размер".
//    Так же перечисление должно иметь метод getEuroSize()
//    возвращающий числовое значение (32, 34, 36, 38, 40)
//    соответствующее каждому размеру.
//    Создать конструктор принимающий на вход description и euroSize.
//
//
//        Создать интерфейсы
//        - ManClothes (мужская одежда) c методом dressMan (одеть мужчину)
//        - WomenClothes (женская оджеда) с методом dressWomen (одеть женщину).
//        Эти методы не принимают параметров,
//        а только выводят информацию о одежде (название, размер, цену, цвет).
//
//        Создать абстрактный класс Clothes (одежда) содержащий
//        переменные размер (типа Size), стоимость, цвет.
//
//        Создать классы наследники Clothes:
//        - Tshirt (футболка) реализует интерфейсы ManClothes и WomenClothes,
//        - Pants (штаны) реализует интерфейсы ManClothes и WomenClothes,
//        - Skirt (юбка) реализует интерфейс WomenClothes,
//        - Tie (галстук) реализует интерфейс ManClothes.
//
//
//        Создать класс Atelier с методом main, и еще двумя статическими методами:
//        dressMan(Clothes[] clothes)
//        dressWomen(Clothes[] clothes)
//        на вход которых будет поступать массив, содержащий все типы одежды.
//        В методе main создать массив, содержащий все типы одежды,

//        и вызвать методы dressMan и dressWomen передав туда этот массив.

//        Метод dressWomen выводит на консоль всю информацию о женской одежде.
//        Метод dressMan выводит на консоль всю информацию о мужской одежде.
//        В методах dressWomen и dressMan использовать оператор instanceof
//        для определения мужская это одежда или женская.
//
//
//        По желанию можно использовать внутренние классы.