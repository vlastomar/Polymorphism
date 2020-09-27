package VehiclesPack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        String[] carInfo = read.readLine().split("\\s+");
        String[] truckInfo = read.readLine().split("\\s+");

        Vehicle car = new Car(Double.parseDouble(carInfo[1]), Double.parseDouble(carInfo[2]));
        Vehicle truck = new Truck(Double.parseDouble(truckInfo[1]), Double.parseDouble(truckInfo[2]));

        int number = Integer.parseInt(read.readLine());

        for (int i = 0; i < number ; i++) {
            String[] tokens = read.readLine().split("\\s+");
            switch (tokens[0]){
                case "Drive":
                    switch (tokens[1]){
                        case "Car":
                            car.driving(Double.parseDouble(tokens[2]));
                            break;
                        case "Truck":
                            truck.driving(Double.parseDouble(tokens[2]));
                            break;
                    }
                    break;
                case "Refuel":
                    switch (tokens[1]){
                        case "Car":
                            car.refueling(Double.parseDouble(tokens[2]));
                            break;
                        case "Truck":
                            truck.refueling(Double.parseDouble(tokens[2]));
                            break;
                    }
                    break;
            }
        }
        System.out.println(String.format("Car: %.2f", car.getFuelQuantity()));
        System.out.println(String.format("Truck: %.2f", truck.getFuelQuantity()));
    }


}
