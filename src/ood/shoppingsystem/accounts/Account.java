package ood.shoppingsystem.accounts;

import ood.shoppingsystem.constants.AccountStatus;

public abstract class Account {
    private String id;
    private String password;
    private AccountStatus status;
    public void resetPassword(){}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public AccountStatus getStatus() {
        return status;
    }

    public void setStatus(AccountStatus status) {
        this.status = status;
    }
}
