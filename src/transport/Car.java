package transport;

import java.time.LocalDate;
import java.util.Objects;

public class Car {
    private final String brand;

    private final String model;
    private final int productionYear;
    private final String productionCountry;
    private String color;
    private double engineVolume;
    private int transmission;
    private final String bodyType;
    private String registrationNumber;
    private final int places;
    private String season;

    public String getBrand() {
        return brand;
    }

    public String getBodyType() {
        return bodyType;
    }

    public int getPlaces() {
        return places;
    }

    public void setColor(String color) {
        if (color != null && !color.isEmpty() && !color.isBlank()) {
            this.color = color;
        }
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume > 0) {
            this.engineVolume = engineVolume;
        }
    }

    public int getTransmission() {
        return transmission;
    }

    public void setTransmission(int transmission) {
        if (transmission >= 4) {
            this.transmission = transmission;
        }
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        if (registrationNumber != null && !registrationNumber.isEmpty() && !registrationNumber.isBlank()) {
            this.registrationNumber = registrationNumber;
        }
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        int currentMonth = LocalDate.now().getMonthValue();
        if (season != null && !season.isEmpty() && !season.isBlank()
                && currentMonth >= 5 && currentMonth <= 10) {
            this.season = "летняя";
        } else {
            this.season = "зимняя";
        }
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
               double engineVolume, int transmission, String bodyType, String registrationNumber, int places,
               String season) {
        String def = "default";
        this.model = Objects.requireNonNullElse(model, def);
        this.productionCountry = Objects.requireNonNullElse(productionCountry, def);
        this.brand = Objects.requireNonNullElse(brand, def);

        if (places > 0) {
            this.places = places;
        } else {
            this.places = 4;
        }

        int defProductionYear = 2000;
        if (productionYear <= 0) {
            this.productionYear = defProductionYear;
        } else
            this.productionYear = productionYear;


        int defTransmission = 4;
        if (transmission < 4) {
            this.transmission = defTransmission;
        } else {
            this.transmission = transmission;
        }

        if (bodyType != null && !bodyType.isEmpty() && !bodyType.isBlank()) {
            this.bodyType = bodyType;
        } else {
            this.bodyType = "седан";
        }

        if (registrationNumber != null && !registrationNumber.isEmpty()
                && !registrationNumber.isBlank() && registrationNumber.length() == 9) {
            char[] regNumChar = registrationNumber.toCharArray();
            for (int i = 0; i < regNumChar.length; i++) {
                if (Character.isLetter(regNumChar[0]) && Character.isDigit(regNumChar[1])
                        && Character.isDigit(regNumChar[2]) && Character.isDigit(regNumChar[3])
                        && Character.isLetter(regNumChar[4]) && Character.isLetter(regNumChar[5])
                        && Character.isDigit(regNumChar[6]) && Character.isDigit(regNumChar[7])
                        && Character.isDigit(regNumChar[8])) {
                    this.registrationNumber = registrationNumber;
                } else {
                    this.registrationNumber = "X000XX000";
                }
            }

            int currentMonth = LocalDate.now().getMonthValue();
            if (season != null && !season.isEmpty() && !season.isBlank()
                    && currentMonth >= 5 && currentMonth <= 10) {
                this.season = "летняя";
            } else {
                this.season = "зимняя";
            }

            String defColor = "белый";
            this.color = Objects.requireNonNullElse(color, defColor);

            double defEngineVolume = 1.5;
            if (engineVolume <= 0) {
                this.engineVolume = defEngineVolume;
            } else {
                this.engineVolume = engineVolume;
            }
        }
    }

    @Override
    public String toString() {
        return " Марка: " + getBrand() + "  Модель: "
                + getModel() + "  Год выпуска: " + getProductionYear()
                + "  Страна производитель: " + getProductionCountry() + "\n"
                + "  Цвет: " + getColor() + "  Объём двигателя: " + getEngineVolume() + " Количество передач: "
                + getTransmission() + "\n" + " Тип кузова: " + getBodyType() + " Регистрационный номер: "
                + getRegistrationNumber() + " Количество мест: " + getPlaces() + " Резина: " + getSeason();
    }
}

