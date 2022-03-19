package ood.packingsystem.parkingObject;

import ood.packingsystem.constants.ParkingSpotType;
import ood.packingsystem.vehicles.Vehicle;

public abstract class ParkingSpot {
    private final ParkingSpotType type;
    private Vehicle vehicle;
    private String number;
    private boolean free;
    protected ParkingSpot(ParkingSpotType type) {
        this.type = type;
    }

    public boolean assignVehicle(Vehicle vehicle){
        if(this.vehicle!=null){
            return false;
        }else {
            this.vehicle = vehicle;
            free = false;
            return true;
        }
    }

    public boolean removeVehicle(){
        this.vehicle = null;
        free = true;
        return true;
    }
}
