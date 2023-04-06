package org.example.ManagementBook.ClasseServices;

import com.sun.source.tree.LambdaExpressionTree;
import org.example.ManagementBook.Classes.Autor;
import org.example.ManagementBook.Classes.Book;
import org.example.ManagementBook.Classes.Publisher;

import java.util.ArrayList;
import java.util.List;

public class BookServices {
    public List<Book> filterBooksByAuthor(Autor auteur, Book[] livres) {
        List<Book> livreTrie = new ArrayList<Book>();
        for (Book livre:livres) {
            Autor[] tabs = livre.getAuteurs();
            for (Autor autor :tabs) {
                if(autor.equals(auteur)){
                    livreTrie.add(livre);
                }
            }
        }
        return livreTrie;
    }

    public Book[] filterBooksByPublisher(Publisher editeur, Book[] livres) {
        Book[] livreTrie ={};
        for (Book livre:livres) {
            if (livre.getPublisher().equals(editeur) ){
                Book[] tmptab = new Book[livreTrie.length+1];
                for (int i = 0; i < livreTrie.length; i++) {
                    tmptab[i] = livreTrie[i];
                }
                tmptab[livreTrie.length]=livre;
                livreTrie = tmptab;
            }
        }
        return  livreTrie;
    }

    public Book[] filterBooksAfterSpecifiedYear(int yearFromInclusively, Book[] livres) {
        Book[] livreTrie ={};
        for (Book livre:livres) {
            if (livre.getPublishingYear()==yearFromInclusively){
                Book[] tmptab = new Book[livreTrie.length+1];
                for (int i = 0; i < livreTrie.length; i++) {
                    tmptab[i] = livreTrie[i];
                }
                tmptab[livreTrie.length]=livre;
                livreTrie = tmptab;
            }
        }
        return  livreTrie;
    }
}
