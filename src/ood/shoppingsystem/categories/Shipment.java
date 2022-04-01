package ood.shoppingsystem.categories;

import java.util.Date;
import java.util.List;

public class Shipment {
    private String shipmentId;
    private Date shipmentDate;
    private Date estimateDelivery;
    private String shipmentMethod;
    private List<ShipmentLog> shipmentLogs;

    public boolean addShipmentLog(ShipmentLog shipmentLog) {
        return true;
    }
}
