package org.example.Hotel.Classes;

import org.example.Hotel.Enum.StatusChambre;

import java.math.BigDecimal;

public class Chambre {
    private int numero;
    private StatusChambre status;
    private BigDecimal prix;
    private int capacite;
    private static int cpt =1;

    public int getCapacite() {
        return capacite;
    }

    public StatusChambre getStatus() {
        return status;
    }

    public int getNumero() {
        return numero;
    }

    public void setStatus(StatusChambre status) {
        this.status = status;
    }

    public Chambre(boolean status, BigDecimal prix, int capacite) {
        this.numero = cpt++;
        this.status = status ? StatusChambre.Libre : StatusChambre.Occupée;
        this.prix = prix;
        this.capacite = capacite;
    }

    @Override
    public String toString() {
        return "Chambre" +
                "n° " + numero +
                ", status : " + status +
                ", prix : " + prix +"€"+
                ", capacite : " + capacite;
    }
}
