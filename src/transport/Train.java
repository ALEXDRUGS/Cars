package transport;

public class Train extends Transport {
    private String tripTime;
    private String departureStation;
    private String endingStation;
    private int tripPrice;
    private int numberOfWagons;

    public Train(String brand, String model, int productionYear, String productionCountry, double maxSpeed,
                 String departureStation, String endingStation, int tripPrice, int numberOfWagons) {
        super(brand, model, productionYear, productionCountry, maxSpeed);

        if ( departureStation != null && !departureStation.isEmpty() && !departureStation.isBlank()) {
            this.departureStation = departureStation;
        }
        if (endingStation != null && !endingStation.isEmpty() && !endingStation.isBlank()) {
            this.endingStation = endingStation;
        }
        if (tripPrice > 0) {
            this.tripPrice = tripPrice;
        }
        if (numberOfWagons > 0) {
            this.numberOfWagons = numberOfWagons;
        }
    }

    public String getDepartureStation() {
        return departureStation;
    }

    public void setDepartureStation(String departureStation) {
        this.departureStation = departureStation;
    }

    public String getEndingStation() {
        return endingStation;
    }

    public void setEndingStation(String endingStation) {
        this.endingStation = endingStation;
    }

    public int getTripPrice() {
        return tripPrice;
    }

    public void setTripPrice(int tripPrice) {
        this.tripPrice = tripPrice;
    }

    public int getNumberOfWagons() {
        return numberOfWagons;
    }

    public void setNumberOfWagons(int numberOfWagons) {
        this.numberOfWagons = numberOfWagons;
    }

    @Override
    public String toString() {
        return "  Марка: " + getBrand() +
                " Модель: " + getModel() +
                " Год выпуска: " + getProductionYear() +
                " Страна производитель: " + getProductionCountry() + "\n" +
                " Максимальная скорость " + getMaxSpeed() +
                " км/ч Станция отбытия: " + getDepartureStation() + "\n" +
                " Конечная станция: " + getEndingStation() +
                " Цена поездки: " + getTripPrice() +
                " рублей Количество вагонов: " + getNumberOfWagons();
    }

    @Override
    public String refill() {
        return " заправлять дизелем";
    }
}

