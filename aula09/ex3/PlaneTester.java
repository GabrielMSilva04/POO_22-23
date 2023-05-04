import java.util.Scanner;

public class PlaneTester {
    public static void main(String[] args) {
        PlaneManager planeManager = new PlaneManager();
        Scanner scanner = new Scanner(System.in);
        int choice;

        planeManager.addPlane(new MilitaryPlane("1", "AAAAA", "model", 66, 5465, 333, 44));
        planeManager.addPlane(new MilitaryPlane("2", "BBBBB", "model", 66, 5465, 334, 44));
        planeManager.addPlane(new MilitaryPlane("3", "CCCCC", "model", 66, 5465, 335, 44));
        planeManager.addPlane(new CommercialPlane("4", "DDDDD", "model", 66, 5465, 336, 44));
        planeManager.addPlane(new CommercialPlane("5", "EEEEE", "model", 66, 5465, 337, 44));

        do {
            System.out.println("\nPlane Fleet Menu:");
            System.out.println("1. Add a plane to the fleet");
            System.out.println("2. Remove a plane from the fleet");
            System.out.println("3. Search for a plane");
            System.out.println("4. Print summary of all planes in the fleet");
            System.out.println("5. Print list of all commercial planes in the fleet");
            System.out.println("6. Print list of all military planes in the fleet");
            System.out.println("7. Print the fastest plane in the fleet");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addPlane(planeManager, scanner);
                    break;
                case 2:
                    removePlane(planeManager, scanner);
                    break;
                case 3:
                    searchPlane(planeManager, scanner);
                    break;
                case 4:
                    printAllPlanes(planeManager);
                    break;
                case 5:
                    printCommercialPlanes(planeManager);
                    break;
                case 6:
                    printMilitaryPlanes(planeManager);
                    break;
                case 7:
                    printFastestPlane(planeManager);
                    break;
                case 0:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 0);

        scanner.close();
    }

    private static void addPlane(PlaneManager planeManager, Scanner scanner) {
        System.out.println("1. Military");
        System.out.println("2. Commercial");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        scanner.nextLine();

        System.out.print("ID? ");
        String id = scanner.nextLine();
        
        System.out.print("Manufacturer? ");
        String manufacturer = scanner.nextLine();
        
        System.out.print("Model? ");
        String model = scanner.nextLine();
        
        System.out.print("Year? ");
        int year = scanner.nextInt();
        
        System.out.print("Max Passengers? ");
        int maxPassengers = scanner.nextInt();
        
        System.out.print("Max Speed? ");
        double maxSpeed = scanner.nextDouble();
        
        switch (choice) {
            case 1:
            System.out.print("Missiles number? ");
            int numMissiles = scanner.nextInt();
                if (planeManager.addPlane(new MilitaryPlane(id, manufacturer, model, year, maxPassengers, maxSpeed, numMissiles))) {
                    System.out.println("SUCEDIDO");
                }else{
                    System.out.println("NÃO SUCEDIDO");
                }
                break;

            case 2:
                System.out.print("Max Cargo? ");
                int maxCargo = scanner.nextInt();
                if (planeManager.addPlane(new CommercialPlane(id, manufacturer, model, year, maxPassengers, maxSpeed, maxCargo))) {
                    System.out.println("SUCEDIDO");
                }else{
                    System.out.println("NÃO SUCEDIDO");
                }
                break;

            default:
                System.out.println("Invalid choice. Please try again.");
                break;
        }
    }

    private static void removePlane(PlaneManager planeManager, Scanner scanner) {
        System.out.print("ID? ");
        String id = scanner.nextLine();

        if (planeManager.removePlane(id)) {
            System.out.println("SUCEDIDO");
        }else{
            System.out.println("NÃO SUCEDIDO");
        }
    }

    private static void searchPlane(PlaneManager planeManager, Scanner scanner) {
        System.out.print("ID? ");
        String id = scanner.nextLine();

        
        System.out.println(planeManager.searchPlane(id));
    }

    private static void printAllPlanes(PlaneManager planeManager) {
        planeManager.ListAllPlanes();
    }

    private static void printCommercialPlanes(PlaneManager planeManager) {
        for (Plane plane : planeManager.getCommercialPlanes()) {
            System.out.println(plane);
        }
    }

    private static void printMilitaryPlanes(PlaneManager planeManager) {
        for (Plane plane : planeManager.getMilitaryPlanes()) {
            System.out.println(plane);
        }
    }

    private static void printFastestPlane(PlaneManager planeManager) {
        planeManager.printFastestPlane();
    }
}
