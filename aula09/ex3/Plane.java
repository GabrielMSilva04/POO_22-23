public abstract class Plane {
    public enum TYPE {COMMERCIAL, MILITARY}
    private String id, manufacturer, model;
    private int year, maxPassengers;
    private double maxSpeed;
    private String planeType;

    public Plane(TYPE type, String id, String manufacturer, String model, int year, int maxPassengers, double maxSpeed) {
        this.id = id;
        this.manufacturer = manufacturer;
        this.model = model;
        this.year = year;
        this.maxPassengers = maxPassengers;
        this.maxSpeed = maxSpeed;
        this.planeType = type.toString();
    }

    public String getPlaneType() {
        return this.planeType;
    }

    public String getId() {
        return this.id;
    }

    public String getManufacturer() {
        return this.manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMaxPassengers() {
        return this.maxPassengers;
    }

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    public double getMaxSpeed() {
        return this.maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Plane Type: "+ getPlaneType() + " ID: "+ getId() + " Manufacturer: "+ getManufacturer() + " Model: "+ getModel() + " Year: "+ getYear() + " Max Passengers: "+ getMaxPassengers() + " Max Speed: "+ getMaxSpeed();
    }
}
