package com.teachmeskills.lesson7_hw.task1.card;

public class CreditCard {

    private String accountNumber;
    private int amountOnAccount;

    public CreditCard(String accountNumber, int amountOnAccount) {
        this.accountNumber = accountNumber;
        this.amountOnAccount = amountOnAccount;
    }

    public void chargeAmount(int amount) {
        this.amountOnAccount += amount;
        System.out.println("Successful!");
    }

    public void withdrawAmount(int amount) {
        if (this.amountOnAccount >= amount) {
            this.amountOnAccount -= amount;
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    public void getCreditCardInfo() {
        System.out.printf("Amount on credit card '%s' is: '%d'%n", this.accountNumber, this.amountOnAccount);
    }
}
