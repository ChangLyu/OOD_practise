package ood.packingsystem.parkingObject;

import ood.packingsystem.constants.ParkingSpotType;
import ood.packingsystem.displayObject.ParkingDisplayBoard;
import ood.packingsystem.vehicles.Vehicle;

import java.util.HashMap;

public class ParkingFloor {
    private String name;
    private HashMap<String,HandicappedSpot> handicappedSpots; // id -> spot
    private HashMap<String, CompactSpot> compactSpots;
    private HashMap<String, LargeSpot> largeSpots;
    private HashMap<String, MotorBikeSpot> motorbikeSpots;
    private HashMap<String, ElectricSpot> electricSpots;
    private int freeHandicappedSpotCount;
    private int freeCompactSpotCount;
    private int freeLargeSpotCount;
    private int freeMotorbikeSpotCount;
    private int freeElectricSpotCount;
    private ParkingDisplayBoard displayBoard;// each floor has one board
    public ParkingFloor(String name) {
        this.name = name;
    }


    public void addParkingSpot(ParkingSpot spot){
        switch (spot.getType()) {
            case HANDICAPPED :
                handicappedSpots.put(spot.getNumber(), (HandicappedSpot) spot);
                freeHandicappedSpotCount++;
                break;
            case COMPACT:
                compactSpots.put(spot.getNumber(), (CompactSpot) spot);
                freeCompactSpotCount++;
                break;
            case LARGE:
                largeSpots.put(spot.getNumber(), (LargeSpot) spot);
                freeLargeSpotCount++;
                break;
            case MOTORBIKE:
                motorbikeSpots.put(spot.getNumber(), (MotorBikeSpot) spot);
                freeMotorbikeSpotCount++;
                break;
            case ELECTRIC:
                electricSpots.put(spot.getNumber(), (ElectricSpot) spot);
                freeElectricSpotCount++;
                break;
            default:
                System.out.println("Wrong parking spot type!");
        }
    }

    /** 1. try to assign spot , 2. try to update display board by fiding a new one*/
    public void assignVehicleToSpot(Vehicle vehicle, ParkingSpot spot){
        boolean assigned = spot.assignVehicle(vehicle);
        if(assigned) {
           switch(spot.getType()) {
               case HANDICAPPED:
                   updateDisplayBoardForHandicapped(spot);
                   freeHandicappedSpotCount--;
                   break;
//               case COMPACT:
//                   updateDisplayBoardForCompact(spot);
//                   break;
//               case LARGE:
//                   updateDisplayBoardForLarge(spot);
//                   break;
//               case MOTORBIKE:
//                   updateDisplayBoardForMotorbike(spot);
//                   break;
//               case ELECTRIC:
//                   updateDisplayBoardForElectric(spot);
//                   break;
               default:
                   System.out.print("Wrong parking spot type!");
           }
        }else{
            System.out.print("Spot is already Occupied");
        }

    }

    // given a removed spot, pick a new one, we should have same method for all types
    private void updateDisplayBoardForHandicapped(ParkingSpot spot) {
        // check if current displayBoard free spot is the same spot that we want to update, then we get new one
        if (this.displayBoard.getHandicappedFreeSpot().getNumber().equals(spot.getNumber())) {
            // find another free handicapped parking and assign to displayBoard
            for (String key : handicappedSpots.keySet()) {
                if (handicappedSpots.get(key).isFree()) {
                    this.displayBoard.setHandicappedFreeSpot(handicappedSpots.get(key));
                }
            }
            this.displayBoard.showEmptySpotInfo();
        }
    }

    // 1. try to free spot, try to increase count
    public boolean isFull(){
        return (freeHandicappedSpotCount +freeCompactSpotCount +freeLargeSpotCount +freeMotorbikeSpotCount + freeElectricSpotCount) ==0;
    }
    private void freeSpot(ParkingSpot spot){
        spot.removeVehicle();
        switch (spot.getType()) {
            case HANDICAPPED:
                freeHandicappedSpotCount++;
                break;
            case COMPACT:
                freeCompactSpotCount++;
                break;
            case LARGE:
                freeLargeSpotCount++;
                break;
            case MOTORBIKE:
                freeMotorbikeSpotCount++;
                break;
            case ELECTRIC:
                freeElectricSpotCount++;
                break;
            default:
                System.out.print("Wrong parking spot type!");
        }
    }
}
