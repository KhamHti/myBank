package com.kkkh;

public class Bank {
    Account[] accounts = new Account[100];

    public void openNewAcc (String accName, String password, double iniBalance ) {
        Account account = new Account(accName, password, iniBalance);
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] == null) {
                accounts[i] = account;
                break;
            }
        }System.out.println("Congratulation! You have successfully created your account.");

    }


    public boolean isFound(String accName, String password ) {
        for (Account account : accounts) {
            if (account != null) {
                if (accName.equals( account.getAccName() ) && password.equals( account.getPassword() ) ) {
                    return true;
                }
            }
        }
        return false;
    }
}
