package org.lessons.java.shop;

public class prodotto {
    public int codice;
    public String nome;
    public String descrizione;
    public float prezzo;
    public float iva;

    public prodotto(int codice, String nome, String descrizione, float prezzo, float iva) {
        this.codice = codice;
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;
    }

    public void codiceRandom() {
        this.codice = (int) (Math.random() * 1000);
    }

    public void prezzoConIva() {
        this.prezzo = this.prezzo + (this.prezzo * this.iva);
    }

    public void nomeCompleto() {
        System.out.println(this.nome + "-" + this.descrizione);
    }
}
