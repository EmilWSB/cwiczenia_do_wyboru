package uzytkownik;

/**
 * Klasa "Uzytkownik" reprezentuje użytkownika biblioteki.
 */
public class Uzytkownik {
    private String imie;
    private String nazwisko;
    private int numerIdentyfikacyjny;

    /**
     * Konstruktor tworzący obiekt klasy Uzytkownik.
     *
     * @param imie                  imię użytkownika
     * @param nazwisko              nazwisko użytkownika
     * @param numerIdentyfikacyjny   numer identyfikacyjny użytkownika
     */
    public Uzytkownik(String imie, String nazwisko, int numerIdentyfikacyjny) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.numerIdentyfikacyjny = numerIdentyfikacyjny;
    }

    /**
     * Zwraca imię użytkownika.
     *
     * @return imię użytkownika
     */
    public String getImie() {
        return imie;
    }

    /**
     * Zwraca nazwisko użytkownika.
     *
     * @return nazwisko użytkownika
     */
    public String getNazwisko() {
        return nazwisko;
    }

    /**
     * Zwraca numer identyfikacyjny użytkownika.
     *
     * @return numer identyfikacyjny użytkownika
     */
    public int getNumerIdentyfikacyjny() {
        return numerIdentyfikacyjny;
    }
}