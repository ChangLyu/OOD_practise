package ood.packingsystem.parkingObject;

import java.util.Date;

public class ParkingTicket {
    private String number;
    private Date startTime;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }
}
