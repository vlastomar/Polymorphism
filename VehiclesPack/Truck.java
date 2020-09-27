package VehiclesPack;

import java.text.DecimalFormat;

public class Truck extends Vehicle{
    public Truck(double fuelQuantity, double fuelConsumption) {
        super(fuelQuantity, fuelConsumption);
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
        this.setFuelQuantity(getFuelQuantity()  + ltrs * 0.95);
    }
}
