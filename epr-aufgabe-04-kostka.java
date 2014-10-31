/** Author: Sebastian Kostka
  * Diese Klasse enthält Ausdrücke mit Berechnungen, die unter
  * Verwendung von Variablen durchgeführt werden.
  */

public class Stromrechnung {
    
    /** 
      * @param args wird nicht verwendet
      */
    
    public static void main(String[] args) {
        
        /* Berechnung des jährlichen Betrags einer Stromrechnung, auf der
         * Basis von zwei Tarifen, die sich aus einem verbrauchsabhängigen
         * Anteil und einem Grundpreis zusammensetzen. Ausgegeben wird nur
         * der günstigere, der beiden Tarife.
         * Formel: jahresBetrag = (grundPreis * 12) +
         * (verbrauchsPreis / 100 * verbrauch)
         */
        
        /* Deklaration des Verbrauchs, als Variable "verbrauch",
         * vom Typ Double.
         */
        
        double verbrauch = 3536;
        
        /* Deklaration der Grundpreise beider Tarife, als Variablen
         * "grundPreis1" und "grundPreis2", vom Typ Double.
         */
        
        double grundPreis1 = 5.75;
        double grundPreis2 = 9.85;
        
        /* Deklaration der Verbrauchspreise beider Tarife, als Variablen
         * "verbrauchsPreis1" und "verbrauchsPreis2", vom Typ Double.
         */
        
        double verbrauchsPreis1 = 23.49;
        double verbrauchsPreis2 = 22.10;
        
        /* Deklaration der jährlichen Kosten beider Tarife, als Variablen
         * "jahresBetrag1" und "jahresBetrag2", vom Typ Double.
         */
        
        double jahresBetrag1;
        double jahresBetrag2;
        
        /* Berechnung der jährlichen Kosten für beide Tarife, nach der Formel:
         * (grundPreis * 12) + (verbrauchsPreis / 100 * verbrauch)
         *
         * Nach dieser Formel, beinhaltet das Ergebnis zuviele
         * Nachkommastellen. Durch die Multiplikation mit 100, wird
         * das Komma um zwei Stellen verschoben und diese auf 2 verringert.
         * Nach der mathematischen Formel, zur korrekten Rundung, werden
         * noch 0.5 addiert. Bei einer anschließenden Konvertierung, zum
         * Typ Integer, fallen Nachkommastellen weg. Die zwei Stellen erhält
         * man, mit Hilfe einer Konvertierung zum Typ Double und einer
         * Division durch 100.
         */
        
        jahresBetrag1 = ((double) ((int) (100 * (((grundPreis1 * 12)
                + (verbrauchsPreis1 / 100 * verbrauch))) + 0.5))) / 100;
        jahresBetrag2 = ((double) ((int) (100 * (((grundPreis2 * 12)
                + (verbrauchsPreis2 / 100 * verbrauch))) + 0.5))) / 100;
        
        /* Ausgabe der jährlichen Kosten, des günstigeren Tarifs.
         * Mit Hilfe eines bedingten Ausdrucks, wird der günstigere Tarif
         * abgefragt und ausgegeben. Die Bedingung beinhaltet die Ausgabe-
         * möglichkeiten "jahresBetrag1" und "jahresBetrag2" und setzt voraus,
         * dass "jahresBetrag1" < "jahresBetrag2" ist. Ist die Bedingung
         * erfüllt (true), wird der Betrag des ersten Tarifs ausgegeben,
         * ist sie nicht erfüllt (false), der des zweiten Tarifs.
         */
        
        System.out.println((jahresBetrag1 < jahresBetrag2)
                ? jahresBetrag1 : jahresBetrag2);
        
    }
    
}
