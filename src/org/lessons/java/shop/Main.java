package org.lessons.java.shop;

public class Main {
    public static void main(String[] args) {
        prodotto prodotto1 = new prodotto(1, "Palla da calcio", "Descrizione prodotto 1", 10, 0.22f);
        prodotto prodotto2 = new prodotto(2, "Lampada", "Descrizione prodotto 2", 20, 0.22f);
        prodotto prodotto3 = new prodotto(3, "Bracciale", "Descrizione prodotto 3", 30, 0.22f);

        System.out.println(prodotto1.codice);
        System.out.println(prodotto1.nome);
        System.out.println(prodotto1.descrizione);
        System.out.println(prodotto1.prezzo);
        System.out.println(prodotto1.iva);

        System.out.println(prodotto2.codice);
        System.out.println(prodotto2.nome);
        System.out.println(prodotto2.descrizione);
        System.out.println(prodotto2.prezzo);
        System.out.println(prodotto2.iva);

        System.out.println(prodotto3.codice);
        System.out.println(prodotto3.nome);
        System.out.println(prodotto3.descrizione);
        System.out.println(prodotto3.prezzo);
        System.out.println(prodotto3.iva);
    }
}
