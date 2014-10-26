/** Diese Klasse führt Umrechnungen von verschiedenen Arten durch.
 *Autor: Björn Benninghoff
 */
public class Umrechnungen {

    /**
     * Gibt eine kurze Begruessung auf dem Bildschirm aus.
     *
     * @param args  wird nicht verwendet
     */
    public static void main(String[] args) {
        /* Aufgabe 2.1
         * Umrechnung von Grad Fahrenheit in Grad Celsius. 
         * Die Normalformel lautet: c = 5/9 ( f -32)
         * Demnach wurde die Formel wie folgt umgestellt:
         * c = 5 * (f - 32) / 9
         */
        System.out.println(5 * (40 - 32) / 9);
        System.out.println(5 * (41 - 32) / 9);
        
        /* Aufgabe 2.2
         * Umrechnung von DM in Euro 
         * Die Normalformel lautet: e = d / 1,95583
         * Demnach wurde die Formel wie folgt umgestellt bzw. erweitert
         * e = d * 10000 / 195583 
         */
        
        System.out.println(100 * 100000 / 195583);
        System.out.println(10000 * 100000 / 195583);
        
        /* Aufgabe 2.1
         * Zeit Umrechnung von Minuten in Stunden und Minuten
         * Die gegebenen Minuten werden in Stunden und rest Minuten umgewandelt
         */
        System.out.println((5 / 60) * 100 + (5 % 60));
        System.out.println((59 / 60) * 100 + (59 % 60));
        System.out.println((60 / 60) * 100 + (60 % 60));
        System.out.println((61 / 60) * 100 + (61 % 60));
        System.out.println((825 / 60) * 100 + (825 % 60));
    }
} 
