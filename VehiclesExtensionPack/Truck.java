package VehiclesExtensionPack;

import java.text.DecimalFormat;

public class Truck extends Vehicle {
    public Truck(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity);
    }

    @Override
    protected void driving(double distance) {
        double consumption = distance * 1.0 * super.getFuelConsumption() + distance * 1.6;
        if (this.getFuelQuantity() - consumption < 0){
            System.out.println("Truck needs refueling");
        }else{
            this.setFuelQuantity(this.getFuelQuantity() - consumption);
            DecimalFormat vl = new DecimalFormat("#.##");
            System.out.println("Truck travelled " + vl.format(distance) + " km");
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
                this.setFuelQuantity(getFuelQuantity()  + ltrs * 0.95);
            }
        }




    }
}
