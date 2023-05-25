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
        Ksiazka ksiazka1 = new Ksiazka("Tytuł 1", "Autor 1", 2020);
        Ksiazka ksiazka2 = new Ksiazka("Tytuł 2", "Autor 2", 2018);

        // Tworzenie obiektu klasy Biblioteka
        Biblioteka biblioteka = new Biblioteka();

        // Dodawanie książek do biblioteki
        biblioteka.dodajKsiazke(ksiazka1);
        biblioteka.dodajKsiazke(ksiazka2);

        // Wyświetlanie informacji o książkach w bibliotece
        for (Ksiazka ksiazka : biblioteka.getKolekcjaKsiazek()) {
            System.out.println(ksiazka.getInfo());
        }

        // Tworzenie obiektu klasy Uzytkownik
        Uzytkownik uzytkownik = new Uzytkownik("Jan", "Kowalski", 12345);

        // Wyświetlanie informacji o użytkowniku
        System.out.println("Imię: " + uzytkownik.getImie());
        System.out.println("Nazwisko: " + uzytkownik.getNazwisko());
        System.out.println("Numer identyfikacyjny: " + uzytkownik.getNumerIdentyfikacyjny());
    }
}