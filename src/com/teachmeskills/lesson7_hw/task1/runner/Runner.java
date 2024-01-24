package com.teachmeskills.lesson7_hw.task1.runner;

import com.teachmeskills.lesson7_hw.task1.card.CreditCard;

public class Runner {

    public static void main(String[] args) {
        CreditCard creditCard1 = new CreditCard("AB123", 1890);
        CreditCard creditCard2 = new CreditCard("CD456", 2500);
        CreditCard creditCard3 = new CreditCard("EF789", 3750);

        creditCard1.chargeAmount(150);
        creditCard2.chargeAmount(290);
        creditCard3.withdrawAmount(3751);

        creditCard1.getCreditCardInfo();
        creditCard2.getCreditCardInfo();
        creditCard3.getCreditCardInfo();
    }
}
