/**
 * @author LoB
 */
public class Stromrechnung {
 /**Diese Klasse soll Strompreise auf Basis eines Grundpreises EUR pro Monat
 * sowie eines Verbrauchspreises in Cent pro kW/h berechnen
 * Anschließend sollen die Preise miteinander verglichen werden.
 * @param args wird nicht verwendet
 */

    public static void main(String[] args) {
    /* 
    Zuerst werden die variablen festgelegt
    Für jeden Tarif gibt es zwei zur Berechnung des Grund und Verbrauchspreises
    Außerdem gibt es Variablen um die Rechnung durchzuführen
    und Zwischenergebnisse zu speichern
    */   
        double ersterTarifEuroProMonat;
        double ersterTarifCentProkWh;
        double zweiterTarifEuroProMonat;
        double zweiterTarifCentProkWh;
        double jahresverbrauch; 
        double gesamtkostenTarifEins;
        double gesamtkostenTarifZwei;
        double endergebnisInEuro;
        
        double jahresGrundkosten;
        double kostenFuerVerbrauch;
        
        /*
        Danach werden die variablen mti Werten belegt
        Hierbei ist zu beachten dass die tarifwerte unterschliedliche
        Einheiten nutzen also müssen diese später umgewandelt werden
        Der jahresverbrauch ist in kW angegeben
        */
        ersterTarifEuroProMonat = 5.75;
        ersterTarifCentProkWh = 23.49;
        zweiterTarifEuroProMonat = 9.85;
        zweiterTarifCentProkWh = 22.10;
        jahresverbrauch = 3536;
        
        /*Hier werden die Grundkosten fürs Jahr berechnet
          Die anschließende Rechnung berechnet die Kosten für den Verbrauch
          Danach werden diese addiert.
          Um zu runden wird das Ergebnis nach links verschoben.
          Es wird mit 5 addiert und dann wieder durch 10 geteilt, sodass 
          Kommastellen entstehen, welche durch die Int-konvertierung wegfallen.
        */
        jahresGrundkosten = ersterTarifEuroProMonat * 12;
        kostenFuerVerbrauch = ersterTarifCentProkWh * jahresverbrauch / 100;
        gesamtkostenTarifEins = ((int) (((kostenFuerVerbrauch 
                + jahresGrundkosten) * 1000) + 5) / 10);
      
        /*Dies wird für den zweiten Tarif wiederholt
          und als seperates Ergebnis gepeichert
        */
        jahresGrundkosten = zweiterTarifEuroProMonat * 12;
        kostenFuerVerbrauch = zweiterTarifCentProkWh * jahresverbrauch / 100;
        gesamtkostenTarifZwei = ((int) (((kostenFuerVerbrauch 
                + jahresGrundkosten) * 1000) + 5) / 10); 
        
        /*Anschließend werden die Ausdrücke miteinander verglichen
        Der günstigere/niedrigere soll mit println ausgegeben werden
        Der Vergleich wird mit einem bedingten Ausdruck realisiert.
        */
       
        System.out.println((gesamtkostenTarifEins < gesamtkostenTarifZwei)
                           ? gesamtkostenTarifEins / 100
                           : gesamtkostenTarifZwei / 100);
        
    }
}
