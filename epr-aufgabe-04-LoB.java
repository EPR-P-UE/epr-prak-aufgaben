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
         
    */   
        double ersterTarifEuroProMonat;
        double ersterTarifEuroProkWh;
        double zweiterTarifCentProMonat;
        double zweiterTarifCentProkWh;
        double jahresverbrauch; 
        double gesamtkosten;
        double gesamtkostenNachKomma;
        
        double jahresGrundkosten;
        double kostenFürVerbrauch;
        
        ersterTarifEuroProMonat = 5.75;
        ersterTarifEuroProkWh = 23.49;
        zweiterTarifCentProMonat = 9.58;
        zweiterTarifCentProkWh = 22.10;
        jahresverbrauch = 3536;
        
        jahresGrundkosten = ersterTarifEuroProMonat * 12;
        
        kostenFürVerbrauch = ersterTarifEuroProkWh * jahresverbrauch / 100;
        
        gesamtkosten = ((jahresGrundkosten + kostenFürVerbrauch) 
                * 100 + 0.5) / 100;
        
        gesamtkostenNachKomma = gesamtkosten * 100 % 100;
        
        System.out.println((int)gesamtkosten);
        System.out.println(',');
        System.out.println((int)gesamtkostenNachKomma);
    }
}
