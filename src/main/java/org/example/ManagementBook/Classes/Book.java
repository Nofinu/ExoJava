package org.example.ManagementBook.Classes;

import org.example.ManagementBook.Enums.CoverType;

import java.math.BigDecimal;
import java.util.Arrays;

public class Book {

    private int id;
    private String name;

    private Autor[] auteurs;
    private Publisher publisher;

    private int PublishingYear;
    private int AmountOfPages;
    private BigDecimal prix;

    private CoverType coverType;

    private static int cpt = 0;
    public Book() {
    }

    public Book( String name, int publishingYear, int amountOfPages, BigDecimal prix,int covertype,Publisher publisher,Autor[] auteurs) {
        this.id = cpt++;
        this.name = name;
        this.PublishingYear = publishingYear;
        this.AmountOfPages = amountOfPages;
        this.prix = prix;
        this.coverType = covertype == 1? CoverType.Broché : CoverType.Relié;
        this.publisher = publisher;
        this.auteurs = auteurs;
    }



    public String getName() {
        return name;
    }

    public Autor[] getAuteurs() {
        return auteurs;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public int getPublishingYear() {
        return PublishingYear;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", auteurs=" + Arrays.toString(auteurs) +
                ", publisher=" + publisher +
                ", PublishingYear=" + PublishingYear +
                ", AmountOfPages=" + AmountOfPages +
                ", prix=" + prix +
                ", coverType=" + coverType +
                '}';
    }

}
