/**
 *Diese Klasse berechnet verschiedene Aufgaben zu RGB Farbmodellen. Dabei
 *werden alle Werte in einem rrrgggbbb Modell ausgegeben.
 *In der ersten Methode sollen Rafcoded invertiert-
 *in der Zweiten hochgezählt werden.
 *@author LoB
 */
public class Farben {

    /**
     * Die Main-Methode gibt die Ergebnise aus.
     * @param args wird nicht verwendet
     */
    public static void main(String[] args) {
        /*
        * Der Println-Ausdruck gibt die zusammengesetzten Farben an
        * die Methoden weiter.
        */
        System.out.println(invertiere(000000000));
        System.out.println(invertiere(10128255));
        
        System.out.println(gibNaechsteFarbe(10011120));
        System.out.println(gibNaechsteFarbe(100128255));
        System.out.println(gibNaechsteFarbe(255255));
        System.out.println(gibNaechsteFarbe(255255255)); 
    
    }
  
    /**
     * Diese Methode invertiert die Farbziffern.
     * @return was schreibt man hier hin?
     * @param farbziffer Parameter für die Invertierung
     */
    public static int invertiere(int farbziffer) {
        /* Zuerst werden die Variablen deklariert.
        * Für jeden farbanteil gibt es eine. 
        * Die Kombination aus /zehnerstelle und %Zehnerstelle
        * verschiebt die Werte auf ihre Ursprungsstelle zurück.
        * Bsp: (255)(0)() = (geschrieben) 255000000
        * 255000000 / 1000000 = 255 => "echte" Wertigkeit der Farbe.
        * Dabei wird dieser Wert von 255 subtraiert, um so zu invertieren.
        * Danach wird die Verschiebung rückgängig gemacht.
        */
        int farbcodeRot = 255 - (farbziffer / 1000000); 
        int farbcodeGruen = 255 - (farbziffer % 1000000 / 1000);
        int farbcodeBlau = 255 - (farbziffer % 1000);
        
        int invertierung = (farbcodeRot * 1000000) 
                + (farbcodeGruen * 1000)
                + (farbcodeBlau);
        
        return (invertierung);
        
    }
    /** Dieser Methode gibt die nächst höhere Farbfizzer aus.
     * 
     * @param farbziffer Parameter für die Addierung
     * @return was schreibt man hier hin?
     */
    public static int gibNaechsteFarbe (int farbziffer) {
        /* Beim Hochzählen gilt zu beachten, dass nach jedem 255er Wert
        * der Code auf 0 gesetzt werden muss. Ist das geschehen,
        * muss die nächst höhere Stelle einen Übertrag erhalten.
        * Dies wird durch bedingte Ausdrücke erzeugt, welche prüfen, ob ein Wert
        * die 255er Marke erreicht hat oder nicht.
        * Zunächst wird aber wie zuvor um Stellen verschoben:
        */
        
        int farbcodeBlau = (farbziffer % 1000);
        int farbcodeGruen = (farbziffer % 1000000 / 1000);
        int farbcodeRot = (farbziffer / 1000000); 
        int uebertrag;
        
        /* Der Bedingte Ausdruck sorgt für eine Abfrage ob eine Stelle 
        * zurückgestellt werden musste. 
        * Ist dem so, wird ein Übertragswert erstellt.
        * Der Übertrag wird dann mit der nächsten Stelle verrechnet.
        */
        farbcodeBlau = (farbcodeBlau + 1) >= 256
                ? 0 
                : farbcodeBlau + 1;
        
        uebertrag = (farbcodeBlau == 0)
                ? 1
                : 0;
        
        farbcodeGruen = (farbcodeGruen + uebertrag) >= 256
                 ? 0
                 : farbcodeGruen + uebertrag;
         
        uebertrag = farbcodeGruen == 0
                 ? 1
                 : 0;
         
        farbcodeRot = (farbcodeRot + uebertrag) >= 256
                ? 0
                : farbcodeRot + uebertrag;
         
        // Die Stellenverschiebung wird während return rückgängig gemacht.      
        return ((farbcodeRot * 1000000) 
                + (farbcodeGruen * 1000)
                + (farbcodeBlau));
    }
        
}
