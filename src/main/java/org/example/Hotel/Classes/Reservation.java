package org.example.Hotel.Classes;

import org.example.Hotel.Enum.StatusReservation;

public class Reservation {
    private int numero;
    private StatusReservation status;
    private Client client;
    private Chambre chambre;
    private static int cpt =1;

    public Reservation() {
    }

    public Reservation(boolean status, Client client, Chambre chambre) {
        this.numero = cpt++;
        this.status = status? StatusReservation.Validée : StatusReservation.Annulée;
        this.client = client;
        this.chambre = chambre;
    }

    public Client getClient() {
        return client;
    }

    public int getNumero() {
        return numero;
    }

    public Chambre getChambre() {
        return chambre;
    }

    public void setStatus(StatusReservation status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Reservation " +
                "n°" + numero +
                ", status : " + status +
                ",\n client : " + client +
                ",\n chambre : " + chambre;
    }
}
