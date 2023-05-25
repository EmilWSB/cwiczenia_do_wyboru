package biblioteka;


/**
 * Klasa "Biblioteka" reprezentuje całą bibliotekę.
 */
public class Biblioteka {
    private List<Ksiazka> kolekcjaKsiazek;

    /**
     * Konstruktor tworzący obiekt klasy Biblioteka.
     */
    public Biblioteka() {
        kolekcjaKsiazek = new ArrayList<>();
    }

    /**
     * Dodaje książkę do biblioteki.
     *
     * @param ksiazka książka do dodania
     */
    public void dodajKsiazke(Ksiazka ksiazka) {
        kolekcjaKsiazek.add(ksiazka);
    }

    /**
     * Zwraca kolekcję książek w bibliotece.
     *
     * @return kolekcja książek
     */
    public List<Ksiazka> getKolekcjaKsiazek() {
        return kolekcjaKsiazek;
    }
}