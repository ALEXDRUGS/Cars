import transport.Car;
import transport.Train;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Лада", "Гранта", 2015, "Россия", "жёлтый", 120.0,  1.7, 5, "седан", "A555AA777", 5,
                "зима", new Car.Key(true, true), new Car.Insurance(LocalDate.now().plusMonths(3), 1000.0f,
                "123456787"));
        Car car2 = new Car("Audi", "A8 50 L TDI quattro,", 2020, "Германия", "чёрный", 120.0,3.0, 5, "седан", "A556AA777", 5,
                "ЛЕТО", new Car.Key(true, true), new Car.Insurance(LocalDate.now().plusMonths(3), 1000.0f,
                "123456789"));
        Car car3 = new Car("BMW", "Z8", 2021, "Германия", "чёрный", 120.0, 3.0, 5, "седан", "A557AA777", 5,
                "ЛЕТО", new Car.Key(true, true), new Car.Insurance(LocalDate.now().plusMonths(3), 1000.0f,
                "123456780"));
        Car car4 = new Car("Kia", "Sportage 4", 2018, "Южная Корея", "красный", 120.0, 2.4, 5, "седан", "A558AA777", 5,
                "ЛЕТО", new Car.Key(true, true), new Car.Insurance(LocalDate.now().plusMonths(3), 1000.0f,
                "123456789"));
        Car car5 = new Car("Hyundai", "Avante", 2016, "Южная Корея", "оранжевый", 120.0, 1.6, 5, "седан", "A559AA777", 5,
                "ЛЕТО", new Car.Key(true, true), new Car.Insurance(LocalDate.now().plusMonths(3), 1000.0f,
                "123456789"));
        System.out.println(car1 + "\n" + car2 + "\n" + car3 + "\n" + car4 + "\n" + car5);


        Train train1 = new Train("Ласточка", "B-901", 2011,
                "Россия", 301.0, "Белорусский вокзал",
                "Минск-Пассажирский", 3500, 11);
        Train train2 = new Train("Ленинград", "D-125", 2019,
                "Россия", 270.0, "Ленинградский вокзал",
                "Ленинград-Пассажирский", 1700, 8);
        System.out.println(train1 + "\n" + train2);


        Bus bus1 = new Bus("Паз", "32053-70", 2020,
                "Россия", "оранжевый", 60);
        Bus bus2 = new Bus("ЛиАЗ", "5256", 2021,
                "Россия", "белый", 100);
        Bus bus3 = new Bus("Ikarus", "C83.30G", 2003,
                "Венгрия", "красный", 120);
        System.out.println(bus1 + "\n" + bus2 + "\n" + bus3);
    }
}