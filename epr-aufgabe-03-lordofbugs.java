/** Author: LordOfBugs
* Diese Klasse berechnet Zins und Zinseszins Aufgaben mit Variablen.
* Nur Ausdrücke vom Typ int sind zulässig
* Nur Operationen bis einschließlich der Vorlesung vom 24.10.2014 sind zulässig
* Die beträge sollen im Format Euro,Cent ausgegeben werden.
*/
public class Zinsberechnung {
/**
* @param args wird nicht verwendet
*/
    public static void main(String[] args) {
    /* Aufgabe 3.1 
     * Die Aufgabe fordert eine Berechnung eines Betrages 
     * der über 1,2 und 3 Jahre mit 3% verzinst wird.
     * Allgemeine Formel: BetragNeu = Betrag * (1+p%)^Jahre
     * Zunächst werden die Variablen definiert.
    */
       
        int betrag = 117;
        int prozentsatz = 3;

        /* Folgende Variable wird festgelegt um die Ausdrücke zu verkleinern.
        */
        int zinsWert = (prozentsatz + 100);
    
        /* 
        * Um das Format €,Cent zu erhalten wird wiefolgt berechnet:
        * Euro: betrag * (3 + 100) / 100 für ganze Werte
        * Cent: betrag * (3 + 100) % 100 für den nachkomma Rest
        * Es werden Variablen gesetzt um die Ausgabe übersichtlich zu halten.
        */
        int euro = betrag * zinsWert / 100;
        int cent = betrag * zinsWert % 100;
    
        System.out.print(euro);
        System.out.print(',');
        System.out.println(cent);
    
        /* Zweite Forderung: 2 Jahre.
         * Wegen fehlemden Operator zum potenzieren wird doppelt gerechnet
         * und mit einem erhöhtem Stellenwert anschließend korrigiert.
         * Euro: betrag * (3 + 100) * (3 + 100) / 10000
         * Cent: (betrag * (3 + 100) * (3 + 100) % 10000) / 100
         * Die 10er Stellen bewirken dass int nicht zu 0 rundet und der Wert
         * Anschließend korrekt ausgegeben werden kann.
         */
        euro = betrag * zinsWert * zinsWert / 10000;
        cent = (betrag * zinsWert * zinsWert % 10000) / 100;
    
        System.out.print(euro);
        System.out.print(',');
        System.out.println(cent);
        
        /* Dritte Forderung: 3 Jahre
        * Wie zuvor wird mit 10er Stellen korrigiert.
        * Die Rechnung muss nun drei mal wiederholt werden.
        * betrag * (3 + 100) * (3 + 100) * (3 + 100) / 1000000
        * (betrag * (3 + 100) * (3 + 100) * (3 + 100) % 1000000) / 10000
        */
        euro = betrag * zinsWert * zinsWert * zinsWert / 1000000;
        cent = (betrag * zinsWert * zinsWert * zinsWert % 1000000) / 10000;
    
        System.out.print(euro);
        System.out.print(',');
        System.out.println(cent);
    
    
    
        /* Aufgabe 3.2
        * Es soll auf volle Cent gerundet werden.
        * Um zu Rinden soll 0,5 addiert werden.
        * Da ein int Typ vorliegt wird durch 10er Stellen korrigiert.
        * Da es sich weiterhin um die gleichen Werte handelt,
        * werden die selben Variablen weiterhin verwendet.
        */
        euro = betrag * zinsWert / 100;
        cent = betrag * zinsWert % 100;
        cent = (cent + 50) / 100;
    
        System.out.print(euro);
        System.out.print(',');
        System.out.println(cent);
    
        /* Zweite Forderung: berechnung und Rundung für zwei Jahre.
        * Die Formel wird zwei mal verwendet. Gerundet wird zuletzt.
        */
        euro = betrag * zinsWert * zinsWert / 10000;
        cent = (betrag * zinsWert * zinsWert % 10000) / 100;
        cent = (cent + 50) / 100;

        System.out.print(euro);
        System.out.print(',');
        System.out.println(cent);
    
        /* Dritte Forderung: berechnung und Rundung für zwei Jahre.
        * Die Formel wird drei mal verwendet.
        */
    
        euro = betrag * zinsWert * zinsWert * zinsWert / 1000000;
        cent = (betrag * zinsWert * zinsWert * zinsWert % 1000000) / 10000;
        cent = (cent + 50) / 100;
    
        System.out.print(euro);
        System.out.print(',');
        System.out.println(cent);
    
    }
}
