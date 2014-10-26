/** Author: Sebastian Kostka
  * Diese Klasse führt Umrechnungen verschiedener Einheiten durch.
  */

public class Umrechnungen {
    
     /** 
       * @param args wird nicht verwendet
       */
    
    public static void main(String[] args) {
        
        /* Umrechnung von Fahrenheit nach Celsius.
         * Formel: c = 5/9 * (Fahrenheit - 32)
         * Umstellung d. Formel: c = 5 * (Fahrenheit - 32)/9
         */
        
        System.out.println(5 * (40 - 32) / 9);
        System.out.println(5 * (41 - 32) / 9);
        
        /* Umrechnung von DM in Euro.
         * Formel: € = DM/1.95583
         * Umstellung d. Formel: € = (DM * 100000)/195583
         */
        
        System.out.println((100 * 100000) / 195583);
        System.out.println((10000 * 100000) / 195583);
        
        /* Umrechnung einer Anzahl von Minuten in volle
         * Stunden und verbleibende Minuten, nach dem Format hmm.
         * 1. Errechnung der vollen Stunden: (Minuten / 60) * 100
         * 2. Addieren der verbleidenden Minuten per Modulo: (Minuten % 60)
         */
        
        System.out.println((5 / 60) * 100 + (5 % 60));
        System.out.println((59 / 60) * 100 + (59 % 60));
        System.out.println((60 / 60) * 100 + (60 % 60));
        System.out.println((61 / 60) * 100 + (61 % 60));
        System.out.println((825 / 60) * 100 + (825 % 60));
        
    }
}
