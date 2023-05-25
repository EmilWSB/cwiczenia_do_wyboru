/**
 * Pakiet "test" zawiera klasę testującą funkcjonalność powyższych klas.
 */
package test;

import biblioteka.Biblioteka;
import biblioteka.Ksiazka;
import uzytkownik.Uzytkownik;

/**
 * Klasa "Testowanie" testuje funkcjonalność powyższych klas.
 */
public class Testowanie {
    public static void main(String[] args) {
        // Tworzenie obiektów klasy Ksiazka
        Ksiazka ksiazka1 = new Ksiazka("Harry Potter i Kamień Filozoficzny", "Rowling J. K.", 2016);
        Ksiazka ksiazka2 = new Ksiazka("Zwierzogród", "Suzanne Francis", 2016);
        Ksiazka ksiazka3 = new Ksiazka("Nawyki warte miliony", "Tracy Brian", 2021);

        // Tworzenie obiektu klasy Biblioteka
        Biblioteka biblioteka = new Biblioteka();

        // Dodawanie książek do biblioteki
        biblioteka.dodajKsiazke(ksiazka1);
        biblioteka.dodajKsiazke(ksiazka2);
        biblioteka.dodajKsiazke(ksiazka3);

        // Wyświetlanie informacji o książkach w bibliotece
        for (Ksiazka ksiazka : biblioteka.getKolekcjaKsiazek()) {
            System.out.println(ksiazka.getInfo());
        }

        // Tworzenie obiektu klasy Uzytkownik
        Uzytkownik uzytkownik = new Uzytkownik("Jan", "Kowalski", 1);

        // Wyświetlanie informacji o użytkowniku
        System.out.println("Imię: " + uzytkownik.getImie());
        System.out.println("Nazwisko: " + uzytkownik.getNazwisko());
        System.out.println("Numer identyfikacyjny: " + uzytkownik.getNumerIdentyfikacyjny());
    }
}