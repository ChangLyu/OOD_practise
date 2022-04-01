package ood.shoppingsystem.accounts;

import java.util.Date;

public class Notification {
    private int notificationId;
    private String content;
    private Date createdOn;

    public boolean sendNotification(Account account){
        return true;
    }
}
