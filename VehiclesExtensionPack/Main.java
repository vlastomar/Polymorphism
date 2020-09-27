package VehiclesExtensionPack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));


            Vehicle car = null;
            Vehicle truck = null;
            Bus bus = null;

            for (int i = 0; i <3 ; i++) {
                String[] input  = read.readLine().split("\\s+");
                switch (input[0]){
                    case "Car":
                        car = new Car(Double.parseDouble(input[1]), Double.parseDouble(input[2]), Double.parseDouble(input[3]));
                        break;
                    case "Truck":
                        truck = new Truck(Double.parseDouble(input[1]), Double.parseDouble(input[2]), Double.parseDouble(input[3]));
                        break;
                    case "Bus":
                        bus = new Bus(Double.parseDouble(input[1]), Double.parseDouble(input[2]), Double.parseDouble(input[3]));
                }

            }

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
                            case "Bus":
                                bus.driving(Double.parseDouble(tokens[2]));
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
                            case "Bus":
                                bus.refueling(Double.parseDouble(tokens[2]));
                                break;
                        }
                        break;
                    case "DriveEmpty":
                        bus.drivingWithoutDriver(Double.parseDouble(tokens[2]));
                        break;
                }
            }
            System.out.println(String.format("Car: %.2f", car.getFuelQuantity()));
            System.out.println(String.format("Truck: %.2f", truck.getFuelQuantity()));
            System.out.println(String.format("Bus: %.2f", bus.getFuelQuantity()));
        System.out.println(bus.getClass().toString());

    }


}
