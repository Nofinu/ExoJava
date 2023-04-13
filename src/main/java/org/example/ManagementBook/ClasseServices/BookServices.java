package org.example.ManagementBook.ClasseServices;

import org.example.ManagementBook.Classes.Autor;
import org.example.ManagementBook.Classes.Book;
import org.example.ManagementBook.Classes.Publisher;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BookServices {
    public List<Book> filterBooksByAuthor(Autor auteur, Book[] livres) {
        List<Book> livreTrie = Arrays.stream(livres).filter(l ->{
            List<Autor> auth = Arrays.asList(l.getAuteurs());
            if(auth.contains(auteur)){
                return true;
            }
            else{
                return false;
            }
        }).collect(Collectors.toList());

        return livreTrie;

//        for (Book livre:livres) {
//            Autor[] tabs = livre.getAuteurs();
//            for (Autor autor :tabs) {
//                if(autor.equals(auteur)){
//                    livreTrie.add(livre);
//                }
//            }
//        }

    }

    public Book[] filterBooksByPublisher(Publisher editeur, Book[] livres) {
        Book[] livreTrie = Arrays.stream(livres)
                .filter(l -> l.getPublisher().equals(editeur))
                .toArray(Book[]::new);

        return  livreTrie;

//        for (Book livre:livres) {
//            if (livre.getPublisher().equals(editeur) ){
//                Book[] tmptab = new Book[livreTrie.length+1];
//                for (int i = 0; i < livreTrie.length; i++) {
//                    tmptab[i] = livreTrie[i];
//                }
//                tmptab[livreTrie.length]=livre;
//                livreTrie = tmptab;
//            }
//        }
    }

    public Book[] filterBooksAfterSpecifiedYear(int yearFromInclusively, Book[] livres) {
        Book[] livreTrie = Arrays.stream(livres)
                .filter(l-> l.getPublishingYear() >= yearFromInclusively)
                .toArray(Book[]::new);

        return  livreTrie;

//        for (Book livre:livres) {
//            if (livre.getPublishingYear()==yearFromInclusively){
//                Book[] tmptab = new Book[livreTrie.length+1];
//                for (int i = 0; i < livreTrie.length; i++) {
//                    tmptab[i] = livreTrie[i];
//                }
//                tmptab[livreTrie.length]=livre;
//                livreTrie = tmptab;
//            }
//        }
    }
}
