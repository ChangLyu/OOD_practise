package ood.packingsystem.displayObject;

import ood.packingsystem.parkingObject.*;

// one floor have one board, and it will show free spot
public class ParkingDisplayBoard {

    // it will only display one free spot in same time for this floor
    private HandicappedSpot handicappedFreeSpot;
    private CompactSpot compactFreeSpot;
    private LargeSpot largeFreeSpot;
    private MotorBikeSpot motorbikeFreeSpot;
    private ElectricSpot electricFreeSpot;



    public void showEmptySpotInfo(){
        // display empty spot information in monitor
    }

    public HandicappedSpot getHandicappedFreeSpot() {
        return handicappedFreeSpot;
    }

    public void setHandicappedFreeSpot(HandicappedSpot handicappedFreeSpot) {
        this.handicappedFreeSpot = handicappedFreeSpot;
    }

    public CompactSpot getCompactFreeSpot() {
        return compactFreeSpot;
    }

    public void setCompactFreeSpot(CompactSpot compactFreeSpot) {
        this.compactFreeSpot = compactFreeSpot;
    }

    public LargeSpot getLargeFreeSpot() {
        return largeFreeSpot;
    }

    public void setLargeFreeSpot(LargeSpot largeFreeSpot) {
        this.largeFreeSpot = largeFreeSpot;
    }

    public MotorBikeSpot getMotorbikeFreeSpot() {
        return motorbikeFreeSpot;
    }

    public void setMotorbikeFreeSpot(MotorBikeSpot motorbikeFreeSpot) {
        this.motorbikeFreeSpot = motorbikeFreeSpot;
    }

    public ElectricSpot getElectricFreeSpot() {
        return electricFreeSpot;
    }

    public void setElectricFreeSpot(ElectricSpot electricFreeSpot) {
        this.electricFreeSpot = electricFreeSpot;
    }
}
