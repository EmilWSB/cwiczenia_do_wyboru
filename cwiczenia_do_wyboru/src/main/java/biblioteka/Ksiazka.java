/**
 * Pakiet "biblioteka" zawiera klasy związane z reprezentacją książek i biblioteki.
 */
package biblioteka;

import java.util.ArrayList;
import java.util.List;

/**
 * Klasa "Książka" reprezentuje pojedynczą książkę w bibliotece.
 */
public class Ksiazka {
    private String tytul;
    private String autor;
    private int rokWydania;

    /**
     * Konstruktor tworzący obiekt klasy Książka.
     *
     * @param tytul      tytuł książki
     * @param autor      autor książki
     * @param rokWydania rok wydania książki
     */
    public Ksiazka(String tytul, String autor, int rokWydania) {
        this.tytul = tytul;
        this.autor = autor;
        this.rokWydania = rokWydania;
    }

    // Gettery i settery dla pól tytul, autor i rokWydania

    /**
     * Zwraca informacje o książce w formacie tekstowym.
     *
     * @return informacje o książce
     */
    public String getInfo() {
        return "Tytuł: " + tytul + ", Autor: " + autor + ", Rok wydania: " + rokWydania;
    }
}