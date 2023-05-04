public class MilitaryPlane extends Plane {
    private int numMissiles;

    public MilitaryPlane(String id, String manufacturer, String model, int year, int maxPassengers, double maxSpeed, int numMissiles) {
        super(Plane.TYPE.MILITARY, id, manufacturer, model, year, maxPassengers, maxSpeed);
        this.numMissiles = numMissiles;
    }

    public int getNumMissiles() {
        return this.numMissiles;
    }

    public void setNumMissiles(int numMissiles) {
        this.numMissiles = numMissiles;
    }

    @Override
    public String toString() {
        return "MilitaryPlane Missiles: "+ getNumMissiles() + " " + super.toString();
    }
}