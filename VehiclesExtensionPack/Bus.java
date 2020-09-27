package VehiclesExtensionPack;

import java.text.DecimalFormat;

public class Bus extends Vehicle {


    public Bus(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity);
    }

    @Override
    protected void driving(double distance) {
           double consumption = distance * 1.0 * super.getFuelConsumption() + distance * 1.4;
            if ( this.getFuelQuantity() - consumption < 0){
                System.out.println("Bus needs refueling");
            }else{
                this.setFuelQuantity(this.getFuelQuantity() - consumption);
                DecimalFormat vl = new DecimalFormat("#.##");
                System.out.println("Bus travelled " + vl.format(distance) + " km");
            }



    }

    public void drivingWithoutDriver(double distance) {
        double consumption = distance * 1.0 * super.getFuelConsumption();
        if ( this.getFuelQuantity() - consumption < 0){
            System.out.println("Bus needs refueling");
        }else{
            this.setFuelQuantity(this.getFuelQuantity() - consumption);
            DecimalFormat vl = new DecimalFormat("#.##");
            System.out.println("Bus travelled " + vl.format(distance) + " km");
        }
    }

    @Override
    protected void refueling(double ltrs) {
        if (ltrs <= 0){
            System.out.println("Fuel must be a positive number");
        }else{
            if (this.getFuelQuantity() + ltrs > this.getTankCapacity()){
                System.out.println("Cannot fit fuel in tank");
            }else {
                this.setFuelQuantity(getFuelQuantity()  + ltrs);
            }
        }


    }
}
