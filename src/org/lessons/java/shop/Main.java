package org.lessons.java.shop;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        prodotto smartphone = new prodotto(
                "Smartphone",
                "Un telefono cellulare",
                new BigDecimal(1000.00),
                new BigDecimal(0.22));

        System.out.println(smartphone.getNomeEsteso());
        System.out.println(smartphone.getPrezzoIvato());
    }
}
