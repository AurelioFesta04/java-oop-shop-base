package org.lessons.java.shop;

import java.math.BigDecimal;
import java.util.Random;

public class prodotto {
    private int codice = new Random().nextInt(9999);
    private String nome;
    private String descrizione;
    private BigDecimal prezzo;
    private BigDecimal iva;

    public prodotto(String nome, String descrizione, BigDecimal prezzo, BigDecimal iva) {
        this.codice = getCodice();
        this.nome = setNome(nome);
        this.descrizione = setDescrizione(descrizione);
        this.prezzo = setPrezzo(prezzo);
        this.iva = setIva(iva);

    }

    public int getCodice() {
        return codice;
    }

    public void setCodice(int codice) {
        this.codice = codice;
    }

    public String getNome() {
        return nome;
    }

    public String setNome(String nome) {
        return this.nome = nome;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public String setDescrizione(String descrizione) {
        return this.descrizione = descrizione;
    }

    public BigDecimal getPrezzo() {
        return prezzo;
    }

    public BigDecimal setPrezzo(BigDecimal prezzo) {
        return this.prezzo = prezzo;
    }

    public BigDecimal getIva() {
        return iva;
    }

    public BigDecimal setIva(BigDecimal iva) {
        return this.iva = iva;
    }

    public BigDecimal getPrezzoIvato() {
        return prezzo.add(prezzo.multiply(iva));
    }

    public String getNomeEsteso() {
        return getCodice() + " - " + getNome();
    }
}
