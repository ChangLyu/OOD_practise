package ood.packingsystem.accountsObject;

import ood.packingsystem.constants.AccountStatus;

public abstract class Account {
    String userName;
    String password;
    String email;
    AccountStatus accountStatus;
    private Person person;

    public boolean resetPassWord() {
        return false;
    }
}
