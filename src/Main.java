public class Main {
    public static void printCars(Car car){
        System.out.println(" Марка: " + car.getBrand() + "  Модель: "
                + car.getModel() + "  Год выпуска: " + car.getProductionYear() + "\n"
                + "  Страна производитель: " + car.getProductionCountry()
                + "  Цвет: " + car.getColor() + "  Объём " + "двигателя: " + car.getEngineVolume());
    }
    public static void main(String[] args) {
        Car car1 = new Car("Лада", "Гранта", 2015, "Россия", "жёлтый", 1.7);
        Car car2 = new Car("Audi", "A8 50 L TDI quattro,", 2020, "Германия", "чёрный", 3.0);
        Car car3 = new Car("BMW", "Z8", 2021, "Германия", "чёрный", 3.0);
        Car car4 = new Car("Kia", "Sportage 4", 2018, "Южная Корея", "красный", 2.4);
        Car car5 = new Car("Hyundai", "Avante", 2016, "Южная Корея", "оранжевый", 1.6);
        printCars(car1);
        printCars(car2);
        printCars(car3);
        printCars(car4);
        printCars(car5);

    }
}