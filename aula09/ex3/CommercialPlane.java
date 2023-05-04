public class CommercialPlane extends Plane {
    private int numOfCrewMembers;

    public CommercialPlane(String id, String manufacturer, String model, int year, int maxPassengers, double maxSpeed, int numOfCrewMembers) {
        super(Plane.TYPE.COMMERCIAL, id, manufacturer, model, year, maxPassengers, maxSpeed);
        this.numOfCrewMembers = numOfCrewMembers;
    }

    public int getNumOfCrewMembers() {
        return this.numOfCrewMembers;
    }

    public void setNumOfCrewMembers(int numOfCrewMembers) {
        this.numOfCrewMembers = numOfCrewMembers;
    }

    @Override
    public String toString() {
        return "CommercialPlane Crew Members: "+ getNumOfCrewMembers() + " " + super.toString();
    }
}
