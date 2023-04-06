package org.example.ManagementBook.Classes;

public class Autor {

    private int id;
    private String firstName;
    private String lastName;

    private static int cpt = 0;
    public Autor() {
    }

    public Autor( String firstName, String lastName) {
        this.id = cpt++;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Autor{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
