/**
 *
 * @author Jan Witthaus
 */
/** Klasse Zinsberechnung.
 * Diese Klasse gibt einen Betrag nach 1, 2 und 3 Jahren Verzinsung auf dem
 * Bildschirm aus.
 */
public class Zinsberechnung {

    /**
     * Gibt einen Betrag nach 1, 2 und 3 Jahren Verzinsung auf dem Bildschirm
     * aus.
     *
     * @param args  wird nicht verwendet
     */
    public static void main(String[] args) {
        // Aufgabe 3.1: Berechnung der Zinsen / Zinseszinsen auf einen Betrag 
        int betrag = 117;
        int zinssatz = 3;
        int euro;
        int cent;
        
        zinssatz = zinssatz + 100;
        
        // Berechnungen nach 1 Jahr
        euro = betrag * zinssatz / 100;
        cent = betrag * zinssatz % 100;
        
        System.out.print(euro);
        System.out.print(',');
        System.out.println(cent);
        
        // Berechnungen nach 2 Jahren
        euro = betrag * zinssatz * zinssatz / 10000;
        cent = betrag * zinssatz * zinssatz / 100 % 100;
        
        System.out.print(euro);
        System.out.print(',');
        System.out.println(cent);
        
        // Berechnungen nach 3 Jahren
        euro = betrag * zinssatz * zinssatz * zinssatz / 1000000;
        cent = betrag * zinssatz * zinssatz * zinssatz / 10000 % 100;
        
        System.out.print(euro);
        System.out.print(',');
        System.out.println(cent);
        
        /* Aufgabe 3.2: Wie Aufgabe 3.1 nur das die Beträge korrekt gerundet 
        werden. */
        // Berechnungen nach 1 Jahr
        euro = betrag * zinssatz / 100;
        cent = betrag * zinssatz % 100 * 100;
        // Rundung
        cent = (cent + 50) / 100;
        
        System.out.print(euro);
        System.out.print(',');
        System.out.println(cent);
        
        // Berechnungen nach 2 Jahren
        euro = betrag * zinssatz * zinssatz / 10000;
        cent = betrag * zinssatz * zinssatz % 10000;
        // Rundung
        cent = (cent + 50) / 100;
        
        System.out.print(euro);
        System.out.print(',');
        System.out.println(cent);
        
        // Berechnungen nach 3 Jahren
        euro = betrag * zinssatz * zinssatz * zinssatz / 1000000;
        cent = betrag * zinssatz * zinssatz * zinssatz % 1000000 / 100;
        // Rundung 
        cent = (cent + 50) / 100;
        
        System.out.print(euro);
        System.out.print(',');
        System.out.println(cent);
    }
}
