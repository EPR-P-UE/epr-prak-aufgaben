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
        double gesamtkostenNachKomma;
        double EndergebnisInEuro;
        
        double jahresGrundkosten;
        double kostenFürVerbrauch;
        
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
        */
        jahresGrundkosten = ersterTarifEuroProMonat * 12;
        kostenFürVerbrauch = ersterTarifCentProkWh * jahresverbrauch / 100;
        gesamtkostenTarifEins = ((jahresGrundkosten + kostenFürVerbrauch) 
                * 100 + 0.5) / 100;
        System.out.println("übrerprüfung" + gesamtkostenTarifEins);
        
        /*Dies wird für den zweiten tarif wiederholt
          und als seperates Ergebnis gepeichert
        */
        jahresGrundkosten = zweiterTarifEuroProMonat * 12;
        kostenFürVerbrauch = zweiterTarifCentProkWh * jahresverbrauch / 100;
        gesamtkostenTarifZwei = ((jahresGrundkosten + kostenFürVerbrauch) 
                * 100 + 0.5) / 100;
        System.out.println("übrerprüfung" + gesamtkostenTarifZwei);
        
        /*Anschließend werden die Ausdrücke miteinander verglichen
        Der günstigere/niedrigere soll mit println ausgegeben werden
        Der Vergleich wird mit einem if/else Ausdruck realisiert
        Um die Stellen nach der Zweiten abzuschneiden wird das Ergebnis 
        in zwei Ausdrücke gespalten. Einen Vor und Nachkomma-Teil.
        */
        if (gesamtkostenTarifEins < gesamtkostenTarifZwei) {
            gesamtkostenNachKomma = gesamtkostenTarifEins * 100 % 100;
            EndergebnisInEuro = gesamtkostenTarifEins + gesamtkostenNachKomma;
                    
            System.out.println((int)gesamtkostenTarifEins);
            System.out.println(',');
            System.out.println((int)gesamtkostenNachKomma);
        } else {
            gesamtkostenNachKomma = gesamtkostenTarifZwei * 100 % 100;
            System.out.println((int)gesamtkostenTarifZwei);
            System.out.println(',');
            System.out.println((int)gesamtkostenNachKomma);   
        }
    }
}
