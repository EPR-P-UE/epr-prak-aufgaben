/**
 *
 * Diese Klasse gibt den guenstigeren Endpreis einer Stromrechnung mit zwei
 * Tarifen auf dem Bildschirm aus.
 * 
 * @author Jan Witthaus
 */
public class Stromrechnung {

    /**
     * Gibt den guenstigeren Endpreis von zwei Tarifen einer Stromrechnung aus.
     *
     * @param args  wird nicht verwendet
     */
    public static void main(String[] args) {
        // Deklaration der Variablen
        int verbrauch = 3536;
        double grundpreisT1 = 5.75;
        double grundpreisT2 = 9.85;
        double verbrauchspreisT1 = 23.49;
        double verbrauchspreisT2 = 22.10;
        double endpreis;
        double endpreisT1;
        double endpreisT2;
        
        // Verbrauchspreis von Cent in Euro umrechnen
        verbrauchspreisT1 = verbrauchspreisT1 / 100;
        verbrauchspreisT2 = verbrauchspreisT2 / 100;
        
        /* Errechnung des Endpreises für 1 Jahr mit Grundpreis plus verbrauchte
        kWh mal Verbrauchspeis. */
        endpreisT1 = (grundpreisT1 * 12) + (verbrauch * verbrauchspreisT1);
        endpreisT2 = (grundpreisT2 * 12) + (verbrauch * verbrauchspreisT2);
        
        /* Runden des Endpreis und abscheiden auf 2 Stellen nach dem Komma durch
        int */
        endpreisT1 = (double) ((int) (100 * endpreisT1 + 0.5)) / 100;
        endpreisT2 = (double) ((int) (100 * endpreisT2 + 0.5)) / 100;
        
        // Vergleichen der Tarife und den günstigeren in Endpreis merken
        endpreis = (endpreisT1 >= endpreisT2) ? endpreisT2 : endpreisT1;
        
        // Ausgeben des Endpreises
        System.out.println(endpreis);
    }
}
