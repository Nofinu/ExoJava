package org.example.Hotel.Classes;


import org.example.Hotel.Enum.StatusChambre;

import java.util.ArrayList;
import java.util.List;

public class Hotel {

    private final String nom;
    private List<Chambre> chambres = new ArrayList<>();
    private List<Reservation> reservations = new ArrayList<>();
    private List<Client> CLients = new ArrayList<>();

    public Hotel(String nom) {
        this.nom = nom;
    }

    public List<Client> getCLients() {
        return CLients;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void AddCLients(String nom, String prenom, String telephone) {
        CLients.add(new Client(nom,prenom,telephone));
    }

    public void setChambres(List<Chambre> chambres) {
        this.chambres = chambres;
    }

    public Client findCLient (String numero){
        Client clientfind = new Client("","","");
        for (Client client:this.CLients) {
            if(client.getTelephone().equals(numero)){
                clientfind = client;
            }
        }
        return clientfind;
    }

    public List<Chambre> findChambres (int nbrPersone){
        List<Chambre> chambresFind = new ArrayList<>();
        for (Chambre chambre:this.chambres) {
            if(chambre.getCapacite() >= nbrPersone){
                chambresFind.add(chambre);
            }
        }
        return chambresFind;
    }

    public List<Reservation> findReservation (Client client){
        List<Reservation> reservationFind = new ArrayList<>();
        for (Reservation reservation:this.reservations) {
            if(reservation.getClient().equals(client)){
                reservationFind.add(reservation);
            }
        }
        return reservationFind;
    }

    public Reservation findReservationById(int id){
        Reservation reservationFind = new Reservation();
        for (Reservation reservation:this.reservations){
            if(reservation.getNumero() == id){
                reservationFind = reservation;
            }
        }
        return reservationFind;
    }

    public void addReservation (Client client, Chambre chambre){
        this.reservations.add(new Reservation(true,client,chambre));
        chambre.setStatus(StatusChambre.Occupée);
    }


}
