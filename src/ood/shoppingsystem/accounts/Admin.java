package ood.shoppingsystem.accounts;

import ood.shoppingsystem.constants.AccountStatus;

public class Admin extends Account{

    public void setAccountStatus(Account account, AccountStatus status){
        account.setStatus(status);
    }
}
