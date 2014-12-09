/**
 * Diese Klasse dient dazu, Konstruktoren und Methoden der Klasse RationaleZahl 
 * zu testen und deren Funktionsweise zu veranschaulichen.
 * 
 * @author Jan Witthaus
 */
public class RationaleZahlTest {
    
    /**
     * Diese Methode erstellt rationale Zahlen als Brüche dargestellt, addiert 
     * diese und gibt sie als Text auf dem Bildschirm aus.
     * 
     * @param args wird nicht verwendet
     */
    public static void main(String[] args) {
        // Deklaration der Referenzen vom Typ rationale Zahl
        RationaleZahl zweiachtel;
        RationaleZahl fuenfsechstel;
        RationaleZahl siebzehnviertel;
        RationaleZahl siebenviertel;
        RationaleZahl hunderttausendzweiviertel;
        RationaleZahl fuenf;
        RationaleZahl bruchElf;
        RationaleZahl bruchEinunddreissig;
        RationaleZahl bruchSiebenundvierzig;
        RationaleZahl bruchDrei;
        RationaleZahl bruchSieben;
        RationaleZahl ergebnis1;
        RationaleZahl ergebnis2;
        RationaleZahl ergebnis3;
        RationaleZahl ergebnis4;
        RationaleZahl ergebnis5;
        RationaleZahl ergebnis6;
        RationaleZahl zwischenErgebnis1;
        
        // Schritt 1/2: 2/8 erzeugen und ausgeben
        zweiachtel = new RationaleZahl(2, 8);
        System.out.println(zweiachtel.gibAlsText());
        
        // Schritt 4/5: Zahl aus Schritt 1 mit 5/6 addieren und umgekehrt
        fuenfsechstel = new RationaleZahl(5, 6);
        ergebnis1 = zweiachtel.addiere(fuenfsechstel);
        System.out.println(ergebnis1.gibAlsText());
        ergebnis2 = fuenfsechstel.addiere(zweiachtel);
        System.out.println(ergebnis2.gibAlsText());
        
        // Schritt 6: 17/4 mit 7/4 addieren und ausgeben
        siebzehnviertel = new RationaleZahl(17, 4);
        siebenviertel = new RationaleZahl(7, 4);
        ergebnis3 = siebzehnviertel.addiere(siebenviertel);
        System.out.println(ergebnis3.gibAlsText());
        
        // Schritt 7: 100002/4 mit 5 addieren und ausgeben
        hunderttausendzweiviertel = new RationaleZahl(100002, 4);
        fuenf = new RationaleZahl(5);
        ergebnis4 = hunderttausendzweiviertel.addiere(fuenf);
        System.out.println(ergebnis4.gibAlsText());
        
        // Schritt 8: 11/2108303 mit 31/2117009 und das mit 47/2134421 addieren
        bruchElf = new RationaleZahl(11, 2108303);
        bruchEinunddreissig = new RationaleZahl(31, 2117009);
        bruchSiebenundvierzig = new RationaleZahl(47, 2134421);
        zwischenErgebnis1 = bruchElf.addiere(bruchEinunddreissig);
        ergebnis5 = zwischenErgebnis1.addiere(bruchSiebenundvierzig);
        System.out.println(ergebnis5.gibAlsText());
        
        // Schritt 9: 3/3037000510 mit 7/3037000500 addieren
        bruchDrei = new RationaleZahl(3, 3037000510L);
        bruchSieben = new RationaleZahl(7, 3037000500L);
        ergebnis6 = bruchDrei.addiere(bruchSieben);
        System.out.println(ergebnis6.gibAlsText());
    }
}
