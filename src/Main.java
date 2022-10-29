import transport.Car;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Лада", "Гранта", 2015, "Россия", "жёлтый", 1.7, 5, "седан", "A555AA777", 5, "зима");
        Car car2 = new Car("Audi", "A8 50 L TDI quattro,", 2020, "Германия", "чёрный", 3.0, 5, "седан", "A556AA777", 5, "ЛЕТО");
        Car car3 = new Car("BMW", "Z8", 2021, "Германия", "чёрный", 3.0, 5, "седан", "A557AA777", 5, "ЛЕТО");
        Car car4 = new Car("Kia", "Sportage 4", 2018, "Южная Корея", "красный", 2.4, 5, "седан", "A558AA777", 5, "ЛЕТО");
        Car car5 = new Car("Hyundai", "Avante", 2016, "Южная Корея", "оранжевый", 1.6, 5, "седан", "A559AA777", 5, "ЛЕТО");
        System.out.println(car1 + "\n" + car2 + "\n" + car3 + "\n" + car4 + "\n" + car5);
    }
}