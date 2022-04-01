package ood.stackoverflowsystem.users;

import ood.stackoverflowsystem.constants.AccountStatus;

public class Account {
    String accountId;
    String password;
    String userName;
    AccountStatus accountStatus;
    String email;
    String phone;
    int reputation;
    Address address;

    public void resetPassword(){}
    public void logIn(){}
    public void logOut(){}
}
