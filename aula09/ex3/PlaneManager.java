import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PlaneManager {
    private ArrayList<Plane> planes;
    private Map<String, Plane> planesMapById;
    private Map<String, ArrayList<Plane>> planesMapByType;

    public PlaneManager() {
        this.planes = new ArrayList<Plane>();
        this.planesMapById = new HashMap<String, Plane>();
        this.planesMapByType = new HashMap<String, ArrayList<Plane>>();
        this.planesMapByType.put("MILITARY", new ArrayList<Plane>());
        this.planesMapByType.put("COMMERCIAL", new ArrayList<Plane>());
    }

    public Plane getPlaneById(String id) {
        if (planesMapById.containsKey(id)) {
            return planesMapById.get(id);
        } else {
            return null;
        }
    }

    public boolean addPlane(Plane plane) {
        if (planesMapById.containsKey(plane.getId())) {
            return false;
        } else {
            this.planes.add(plane);
            this.planesMapById.put(plane.getId(), plane);
            this.planesMapByType.get(plane.getPlaneType()).add(plane);
            return true;
        }
    }

    public boolean removePlane(String id) {
        if (planesMapById.containsKey(id)) {
            this.planes.remove(getPlaneById(id));
            this.planesMapById.remove(id);
            this.planesMapByType.remove(getPlaneById(id).getPlaneType());
            return true;
        } else {
            return false;
        }
    }

    public Plane searchPlane(String id) {
        for (Plane plane : planes) {
            if (plane.getId().equals(id)) {
                return plane;
            }
        }
        return null;
    }

    public void ListAllPlanes(){
        for (Plane plane : planes) {
            System.out.println(plane);
        }
    }

    public ArrayList<Plane> getCommercialPlanes() {
        return this.planesMapByType.get("COMMERCIAL");
    }

    public ArrayList<Plane> getMilitaryPlanes() {
        return this.planesMapByType.get("MILITARY");
    }

    public void printFastestPlane() {
        Plane fastestPlane = null;
        for (Plane plane : planes) {
            if (fastestPlane == null) {
                fastestPlane = plane;
            } else {
                if (plane.getMaxSpeed() > fastestPlane.getMaxSpeed()) {
                    fastestPlane = plane;
                }
            }
        }
        System.out.println(fastestPlane);
    }
}
