package org.example.ManagementBook;

import org.example.ManagementBook.ClasseServices.BookServices;
import org.example.ManagementBook.Classes.Autor;
import org.example.ManagementBook.Classes.Book;
import org.example.ManagementBook.Classes.Publisher;
import org.example.ManagementBook.Enums.CoverType;

import java.math.BigDecimal;
import java.util.List;

public class MainBook {

    public static void main() {
        Autor[] auteurs = {new Autor("Jon", "Johnson"),new Autor( "William", "Wilson"),new Autor("Walter", "Peterson")};
        Publisher[] publishers = {new Publisher( "Publisher_1"),new Publisher( "Publisher_2 ")};
        Book[] livres = {
                new Book( "Book_1", 1990, 231,
                        BigDecimal.valueOf(24.99), 1,
                        publishers[0],
                        new Autor[]{auteurs[0]}),
                new Book( "Book_2", 2000, 120,
                        BigDecimal.valueOf(19.99), 2,
                        publishers[1],
                        new Autor[]{auteurs[0], auteurs[1] }),
                new Book( "Book_3", 1997, 300,
                        BigDecimal.valueOf(35.99), 2,
                        publishers[0],
                        new Autor[]{auteurs[2]}),
        };

        BookServices service = new BookServices();
        List<Book> byAutor = service.filterBooksByAuthor(auteurs[0],livres);
        Book[] byPublisher = service.filterBooksByPublisher(publishers[0],livres);
        Book[] byYear = service.filterBooksAfterSpecifiedYear(1990,livres);

        for (Book livre:livres) {
            System.out.println(livre);
        }

        System.out.println("-----------livre par auteurs ----------------");
        for (Book book:byAutor) {
            System.out.println(book);
        }

        System.out.println("-----------livre par publisher ----------------");
        for (Book book:byPublisher) {
            System.out.println(book);
        }
        System.out.println("-----------livre par années ----------------");
        for (Book book:byYear) {
            System.out.println(book);
        }
    }



    };

