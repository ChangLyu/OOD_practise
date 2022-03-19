package ood.packingsystem.accountsObject;

import ood.packingsystem.accountsObject.Account;
import ood.packingsystem.parkingObject.ParkingTicket;

public class ParkingAttendant extends Account {
    public boolean processTicket(ParkingTicket ticket){
        return false;
    }
}
