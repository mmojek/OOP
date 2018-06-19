package com.infoshare.oop;

import com.infoshare.oop.card.*;
import com.infoshare.oop.exceptions.NotEnoughFundsException;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) throws Exception {
        //   Card card = new Card("Karta", "1234");
        Card creditCard = new CreditCard("Karta kredytowa", "123", BigDecimal.ONE, new BigDecimal(200), CustomerType.INDIVIDUAL);

        Card debitCard = new DebitCard("karta debetowa", "5534267345", new BigDecimal(500), CustomerType.COMPANY);

        CanTransferTo prepaidCard = new PrepaidCard("karta przedplacona", "234234324", BigDecimal.ONE, CustomerType.INDIVIDUAL, true);

        CanTransferTo myNewObject = new CanTransferTo() {
            public void transferToCard(BigDecimal amount) {
                System.out.println("Implementacja - klasa wewnetrzna.");
            }
        };

        // card.pay();
        // creditCard.pay();
        //   System.out.println(//card.toString());

        System.out.println(creditCard.toString());
        System.out.println(debitCard.toString());
        System.out.println(prepaidCard.toString());

        CanTransferTo NewOneObject = new CanTransferTo() {
            public void transferToCard(BigDecimal amount) {
                System.out.println("Implementacja wewnętrznej klasy anonimowej CanTransferTo");
            }
        };



        try {
            creditCard.pay();
            debitCard.pay();
        //    prepaidCard.pay();
        } catch (NotEnoughFundsException e) {
            System.out.println(e.getMessage());
        }

        prepaidCard.transferToCard(BigDecimal.ZERO);
        CreditCard myCreditCard = (CreditCard) creditCard;
        System.out.println(myCreditCard.toString());

    }
}