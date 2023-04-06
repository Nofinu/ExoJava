package org.example.Hotel.Ihm;

import org.example.Hotel.Classes.Chambre;
import org.example.Hotel.Classes.Client;
import org.example.Hotel.Classes.Hotel;
import org.example.Hotel.Classes.Reservation;
import org.example.Hotel.Enum.StatusChambre;
import org.example.Hotel.Enum.StatusReservation;

import java.math.BigDecimal;
import java.util.List;
import java.util.Scanner;

public class Ihm {
    static Scanner s = new Scanner(System.in);

    static Hotel hotel = new Hotel("hotel");

    public static void start() {
        init();
        Menu();
    }

    public static void Menu (){
        afficherMenu();
        System.out.println("entrer la valeur correspondant a l'action voulu :");
        int entry = s.nextInt();
        switch (entry){
            case 1 :
                addClient();
                Menu();
                break;
            case 2 :
                afficherClients();
                Menu();
                break;
            case 3 :
                afficherReservationClient();
                Menu();
                break;
            case 4 :
                ajouterReservation();
                Menu();
                break;
            case 5 :
                annulerReservation();
                Menu();
                break;
            case 6 :
                afficherReservation();
                Menu();
                break;
            case 0 :
                break;
            default:
                Menu();
                break;

        }
    }

    public static void init (){
        List<Chambre> chambres =List.of(new Chambre(false, BigDecimal.valueOf(150.99),5),
                new Chambre(true,BigDecimal.valueOf(80.99),3),
                new Chambre(true,BigDecimal.valueOf(200.99),8));
        hotel.setChambres(chambres);

        hotel.AddCLients("nom","prenom","123");
    }

    public static void afficherMenu(){
        System.out.println("\n\n------------Menu-------------");
        System.out.println("1- Ajouter un client");
        System.out.println("2- Afficher la liste des clients");
        System.out.println("3- Afficher la reservation d'un client");
        System.out.println("4- Ajouter une reservation");
        System.out.println("5- Annuler une reservation");
        System.out.println("6- Afficher la liste des reservation");
        System.out.println("0- quitter");
    }

    public static void addClient (){
        System.out.println("------------Ajout client------------");
        System.out.println("entrer le nom du client :");
        String nom = s.next().toLowerCase();
        System.out.println("entrer le prenom du client :");
        String prenom = s.next().toLowerCase();
        System.out.println("entrer le telephone du client :");
        String telephone = s.next().toLowerCase();
        hotel.AddCLients(nom,prenom,telephone);
    }

    public static void afficherClients (){
        System.out.println("------------Afficher les clients------------");
        List<Client> clients = hotel.getCLients();
        for (Client client:clients) {
            System.out.println(client);
        }
    }

    public static void ajouterReservation (){
        int entry;
        boolean test = true;
        System.out.println("------------Ajout d'une reservation------------");
        System.out.println("entrer le numeros de telephone du client :");
        String numero = s.next().toLowerCase();
        Client clientFind = hotel.findCLient(numero);
        if(clientFind.getTelephone() != ""){
            System.out.println("entrer le nombre de personne :");
            int nbrPersonne = s.nextInt();
            List<Chambre> chambreFind = hotel.findChambres(nbrPersonne);
            for (Chambre chambre:chambreFind) {
                if(chambre.getStatus() == StatusChambre.Libre){
                    System.out.println(chambre);
                }
            }
            do {
                System.out.println("entrer le numeros de la chambre que vous voulez reserver");
                System.out.println("entrer 0 pour quitter");
                entry = s.nextInt();
                if (entry == 0){
                    test = false;
                }else{
                    for (Chambre chambre:chambreFind) {
                        if(chambre.getNumero() == entry){
                            hotel.addReservation(clientFind,chambre);
                            System.out.println("reservation effectué!");
                            test=false;
                        }
                    }
                    if(test){
                        System.out.println("aucune chambre trouver au numero : "+entry);
                    }
                }
            }while (test);
        }
        else {
            System.out.println("aucun client trouver");
        }
    }

    public static void afficherReservationClient (){
        System.out.println("------------Afficher les reservations d'un client------------");
        System.out.println("Entrer le numero du clien d'on vous chercher les reservation :");
        String numero = s.next();
        Client clientFind = hotel.findCLient(numero);
        List<Reservation> reservationFind = hotel.findReservation(clientFind);
        for (Reservation reservation:reservationFind) {
            System.out.println(reservation);
        }
    }

    public static void afficherReservation(){
        System.out.println("------------Afficher les reservations------------");
        List<Reservation> reservations = hotel.getReservations();
        for (Reservation reservation:reservations) {
            System.out.println(reservation);
        }
    }

    public static void annulerReservation(){
        System.out.println("------------Annuler une reservation------------");
        System.out.println("entrer le numero de la reservation a annuler :");
        int numero = s.nextInt();
        Reservation reservationfind = hotel.findReservationById(numero);
        if(reservationfind.equals(new Reservation())){
            System.out.println("aucune reservation trouver");
        }
        else{
            reservationfind.setStatus(StatusReservation.Annulée);
            reservationfind.getChambre().setStatus(StatusChambre.Libre);
            System.out.println("reservation annulée !");
        }

    }

}
