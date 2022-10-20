public class Car {
    private final String brand;
    private final String model;
    private final int productionYear;
    private final String productionCountry;
    private final String color;
    private final double engineVolume;

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getColor() {
        return color;
    }

    public double getEngineVolume() {
        return engineVolume;
    }



    public Car(String brand, String model, int productionYear, String productionCountry, String color,
               double engineVolume) {
        this.brand = brand;
        this.model = model;
        this.productionCountry = productionCountry;
        this.color = color;
        this.engineVolume = engineVolume;
        this.productionYear = productionYear;
    }
}
