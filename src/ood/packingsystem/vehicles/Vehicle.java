package ood.packingsystem.vehicles;

import ood.packingsystem.constants.VehicleType;
import ood.packingsystem.parkingObject.ParkingTicket;

public abstract class Vehicle {
    private String licenseNumber;
    private final VehicleType type;
    private ParkingTicket ticket;

    protected Vehicle(VehicleType type) {
        this.type = type;
    }
    public void assignTicket(ParkingTicket ticket){
        this.ticket = ticket;
    }
}
