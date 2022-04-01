package ood.stackoverflowsystem.questions;

import java.util.Date;

public class Bounty {
    private int reputation;
    private Date expiryDate;

    public void modifyReputation(int reputation){
        this.reputation = reputation;
    }
}
