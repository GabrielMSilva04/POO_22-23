package aula04.ex34;

import java.util.Scanner;

public class CarDemo {

    static Scanner sc = new Scanner(System.in);

    static int registerCars(Car[] cars) {
        int registed = 0;
        while(true){
            System.out.print("Insira dados do carro (marca modelo ano quilómetros): ");
            String carString = sc.nextLine();    

            if (carString == "") {
                return registed;
            }

            String[] splitted = carString.split(" ");

            if(splitted.length >= 4){
                String make = splitted[0];
                String model = "";
                for (int i = 1; i < splitted.length - 2; i++) {
                    model += splitted[i] + " ";
                }
                model = model.trim();
                String year = splitted[splitted.length-2];
                String kms = splitted[splitted.length-1];
            

                if(year.matches("\\d{1,}") && kms.matches("\\d{1,}") && make.matches("\\w{1,}") && model.matches(".*\\c.*")){
                    int intyear = Integer.parseInt(year);
                    int intkms = Integer.parseInt(kms);

                    cars[registed] = new Car(make, model, intyear, intkms);
                    registed++;
                }else{System.out.println("Dados mal formatados. Tente novamente......");}
            }else{System.out.println("Dados mal formatados. Tente novamente.");}
        }
   }

    static void registerTrips(Car[] cars, int numCars) {
        while(true){
            System.out.print("Registe uma viagem no formato \"carro:distância\": ");
            String carString = sc.nextLine();    

            if (carString == "") {
                return;
            }

            //validação
            if (carString.contains(":")) {
                String[] splitted = carString.split(":");

                String car = splitted[0];
                String kms = splitted[1];

                if (car.matches("\\d{1,}") && kms.matches("\\d{1,}")) {
                    int intcar = Integer.parseInt(car);
                    int intkms = Integer.parseInt(kms);
                    
                    if (intcar >= 0 && intcar <= numCars-1) {
                        cars[intcar].setKms(cars[intcar].getKms()+intkms);
                    }else {System.out.println("Carro com número escolhido não existe.");}

                }else{System.out.println("Dados mal formatados. Tente novamente.");}
            }else{System.out.println("Dados mal formatados. Tente novamente.");}
            
            
        }
    }


    static void listCars(Car[] cars) {
        System.out.println("\nCarros registados:");
        for (Car car: cars){
            if (car != null) {
                System.out.println(car);
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Car[] cars = new Car[10];

        int numCars = registerCars(cars);

        if (numCars>0) {
            listCars(cars);
            registerTrips(cars, numCars);
            listCars(cars);
        }

        sc.close();

    }
}