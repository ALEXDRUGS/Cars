import transport.Transport;

public class Bus extends Transport {
    public Bus(String brand, String model, int productionYear, String productionCountry, String color, double maxSpeed) {
        super(brand, model, productionYear, productionCountry, color, maxSpeed);
    }

    @Override
    public String toString() {
        return "  Марка: " + getBrand() +
                " Модель: " + getModel() +
                " Год выпуска: " + getProductionYear() +
                " Страна производитель: " + getProductionCountry() + "\n" +
                " Цвет: " + getColor() +
                " Максимальная скорость " + getMaxSpeed() + " км/ч";
    }
}
