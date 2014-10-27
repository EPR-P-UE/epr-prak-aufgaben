/** Author: Sebastian Kostka
  * Diese Klasse enthält Ausdrücke mit Berechnungen, die unter
  * Verwendung von Variablen durchgeführt werden.
  */

public class Zinsberechnung {
    
    /** 
      * @param args wird nicht verwendet
      */
    
    public static void main(String[] args) {
        
        /* Berechnung eines Betrags ("betrag1"), der für drei Jahre
         * (als "betrag"), zu einem Zinssatz (als "zinssatz") angelegt wird.
         * Formel: betrag1 = betrag * (1 + zinssatz / 100)
         */
        
        /* Deklaration des Betrags, als Variable "betrag",
         * vom Typ Integer.
         */
        
        int betrag = 117;
        
        /* Deklaration des Zinssatzes, als Variable "zinssatz",
         * vom Typ Integer.
         */
        
        int zinssatz = 3;
        
        /* Deklaration der Zinseszinsen, als Variable "zins",
         * vom Typ Integer.
         */
        
        int zins = (zinssatz + 100);
        
        /* Umstellung der Formel für ein Jahr
         * betrag * (3 + 100) / 100
         * betrag * (3 + 100) % 100
         */
        
        int euro = betrag * zins / 100;
        int cent = betrag * zins % 100;
        
        // Ausgabe von "betrag1" nach Ablauf eines Jahres.
        System.out.print(euro);
        System.out.print(',');
        System.out.println(cent);
        
        /* Umstellung der Formel für zwei Jahre
         * betrag * (3 + 100) * (3 + 100) / 10000
         * (betrag * (3 + 100) * (3 + 100) % 10000) / 100
         */
        
        euro = betrag * zins * zins / 10000;
        cent = betrag * zins * zins % 10000 / 100;
                
        // Ausgabe von "betrag1" nach Ablauf von zwei Jahren.
        System.out.print(euro);
        System.out.print(',');
        System.out.println(cent);
        
        /* Umstellung der Formel für drei Jahre
         * betrag * (3 + 100) * (3 + 100) * (3 + 100) / 1000000
         * (betrag * (3 + 100) * (3 + 100) * (3 + 100) % 1000000) / 10000
         */
        
        euro = betrag * zins * zins * zins / 1000000;
        cent = betrag * zins * zins * zins % 1000000 / 10000;
        
        // Ausgabe von "betrag1" nach Ablauf von drei Jahren.
        System.out.print(euro);
        System.out.print(',');
        System.out.println(cent);
        
        
        /* Ab hier folgt der zweite Aufgabenteil:
         * Rundung der Beträge auf volle Cent.
         */
        
        // Berechnung für ein Jahr.
        euro = betrag * zins / 100;
        cent = betrag * zins % 100 * 100;
        
        // Rundung auf volle Cent.
        cent = (cent + 50) / 100;
        
        // Ausgabe von "betrag1", gerundet auf volle Cent, nach einem Jahr.
        System.out.print(euro);
        System.out.print(',');
        System.out.println(cent);
        
        // Berechnung für zwei Jahre.
        euro = betrag * zins * zins / 10000;
        cent = betrag * zins * zins % 10000;
        
        // Rundung auf volle Cent.
        cent = (cent + 50) / 100;
        
        // Ausgabe von "betrag1", gerundet auf volle Cent, nach zwei Jahren.
        System.out.print(euro);
        System.out.print(',');
        System.out.println(cent);
        
        // Berechnung für drei Jahre.
        euro = betrag * zins * zins * zins / 1000000;
        cent = betrag * zins * zins * zins % 1000000 / 100;
        
        // Rundung auf volle Cent.
        cent = (cent + 50) / 100;
        
        // Ausgabe von "betrag1", gerundet auf volle Cent, nach drei Jahren.
        System.out.print(euro);
        System.out.print(',');
        System.out.println(cent);
        
    }
    
}
