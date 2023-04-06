package org.example.Hotel.Classes;

public class Client {
    private int id;
    private String nom;
    private String prenom;
    private String telephone;

    private static int cpt =1;
    public Client( String nom, String prenom, String telephone) {
        this.id = cpt++;
        this.nom = nom;
        this.prenom = prenom;
        this.telephone = telephone;
    }

    public String getTelephone() {
        return telephone;
    }

    @Override
    public String toString() {
        return "Client " +
                "n°" + id +
                ", nom : " + nom  +
                ", prenom : " + prenom  +
                ", telephone : " + telephone;
    }
}
