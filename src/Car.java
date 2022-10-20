import java.util.Objects;

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
        String def = "default";
        this.brand = Objects.requireNonNullElse(brand, def);
        this.model = Objects.requireNonNullElse(model, def);
        this.productionCountry = Objects.requireNonNullElse(productionCountry, def);

        String defColor = "белый";
        this.color = Objects.requireNonNullElse(color, defColor);

        double defEngineVolume = 1.5;
        if (engineVolume <= 0) {
            this.engineVolume = defEngineVolume;
        } else {
            this.engineVolume = engineVolume;
        }

        int defProductionYear = 2000;
        if (productionYear <= 0) {
            this.productionYear = defProductionYear;
        } else
            this.productionYear = productionYear;
    }
}
