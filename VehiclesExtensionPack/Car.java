package VehiclesExtensionPack;

import java.text.DecimalFormat;

public class Car extends Vehicle {


    public Car(double fuelQuantity, double fuelConsumption, double tankCapacity) {

        super(fuelQuantity, fuelConsumption, tankCapacity);
    }

    @Override
    protected void driving(double distance) {
        double consumption = distance * 1.0 * super.getFuelConsumption() + distance * 0.9;
        if ( this.getFuelQuantity() - consumption < 0){
            System.out.println("Car needs refueling");
        }else{
            this.setFuelQuantity(this.getFuelQuantity() - consumption);
            DecimalFormat vl = new DecimalFormat("#.##");
            System.out.println("Car travelled " + vl.format(distance) + " km");
        }
    }

    @Override
    protected void refueling(double ltrs) {
        if (ltrs <= 0){
            System.out.println("Fuel must be a positive number");
        }else {
            if (this.getFuelQuantity() + ltrs > this.getTankCapacity()){
                System.out.println("Cannot fit fuel in tank");
            }else {
                this.setFuelQuantity(getFuelQuantity()  + ltrs);
            }
        }



    }


}

