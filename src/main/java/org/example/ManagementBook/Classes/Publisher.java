package org.example.ManagementBook.Classes;

public class Publisher {
    private int id;
    private String publisherName;
    private static int cpt =0;

    public Publisher() {
    }

    public Publisher(String publisherName) {
        this.id = cpt++;
        this.publisherName = publisherName;
    }

    @Override
    public String toString() {
        return "Publisher{" +
                "id=" + id +
                ", publisherName='" + publisherName + '\'' +
                '}';
    }
}
