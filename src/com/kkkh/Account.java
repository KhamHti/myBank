package com.kkkh;

public class Account {
    private String accName ;
    private String password;
    private Double iniBalance;

    public Account (String accName, String password, Double balance) {
        this.accName = accName;
        this.password= password;
        this.iniBalance = balance;
    }

    public String getAccName () {
        return accName;
    }

    public void setAccName(String accName) {
        this.accName = accName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Double getIniBalance() {
        return iniBalance;
    }

    public void setIniBalance(Double iniBalance) {
        this.iniBalance = iniBalance;
    }
}

