/**
 * Diese Klasse enthält Methoden zur Invertierung und zum Weiterzählen von 
 * Farbcodes im RGB-Format.
 * 
 * @author Jan Witthaus
 */
public class Farben {

    /**
     * Gibt für die Beispiele (0, 0, 0) und (10, 128, 255) den invertierten 
     * Wert und für (10, 11, 12), (10, 128, 255), (0, 255, 255) und 
     * (255, 255, 255) den nächsten Wert auf dem Bildschirm aus.
     *
     * @param args  wird nicht verwendet
     */
    public static void main(String[] args) {
        
        // Ausgabe des invertierten Wertes von (0, 0, 0)
        System.out.println(invertiere(0));
        // Ausgabe des invertierten Wertes von (10, 128, 255)
        System.out.println(invertiere(10128255));
        
        // Ausgabe der nächsten Farbe von (10, 11, 12)
        System.out.println(gibNaechsteFarbe(10011012));
        // Ausgabe der nächsten Farbe von (10, 128, 255)
        System.out.println(gibNaechsteFarbe(10128255));
        // Ausgabe der nächsten Farbe von (0, 255, 255)
        System.out.println(gibNaechsteFarbe(255255));
        // Ausgabe der nächsten Farbe von (255, 255, 255)
        System.out.println(gibNaechsteFarbe(255255255));
    }
    
    /**
     * Diese Methode gibt für eine Farbe im RGB-Format die invertierte Form 
     * zurück.
     * Hierzu wird der integer Übergabewert "farbe" zunächst in die einzelnen 
     * Farbanteile zerlegt um im nächsten Schritt die einzelnen Farbanteile von 
     * 255 abzuziehen. Im letzten Schritt werden die Farbanteile wieder an 
     * einander gefügt und das Ergebnis zurück gegeben.
     * 
     * @param farbe Übergabewert für die Farbe vom Typ Integer
     * @return invertiereteAusgabe
     */
    public static int invertiere(int farbe) {
        // Deklaration der Variablen
        int farbanteilRot;
        int farbanteilGruen;
        int farbanteilBlau;
        int invertiereteAusgabe;
        
        // Zerlegen von farbe in die Farbanteile Rot, Gruen und Blau
        farbanteilRot = farbe / 1000000;
        farbanteilGruen = farbe % 1000000 / 1000;
        farbanteilBlau = farbe % 1000;
        
        /* Invertieren der Farbanteile Rot, Grün und Blau durch das 
        subtrahieren von 255. */
        farbanteilRot = 255 - farbanteilRot;
        farbanteilGruen = 255 - farbanteilGruen;
        farbanteilBlau = 255 - farbanteilBlau;
        
        // Aneinander hängen der einzelnen invertierten Farbanteile
        invertiereteAusgabe = farbanteilRot * 1000000 + farbanteilGruen * 1000 
                + farbanteilBlau;
        
        return invertiereteAusgabe;
    }
    
    /**
     * Diese Methode gibt für eine Farbe im RGB-Format nächste Farbe zurück.
     * Hierzu wird der integer Übergabewert "farbe" zunächst in die einzelnen 
     * Farbanteile zerlegt um im nächsten Schritt den ersten Farbanteil um 1 zu 
     * erhöhen. Überscheitet diese die 255 grenze wird er auf 0 gesetzt und der 
     * nächst folgende Farbanteil um 1 erhöht, überschreitet dieser ebenfalls 
     * die 255 Grenze so wird auch er auf 0 gesetzt und der nächst folgende um 
     * 1 erhöht. Im letzten Schritt werden die Farbanteile an einander Gehängt 
     * und zurückgeben.
     * 
     * @param farbe Übergabewert für die Farbe vom Typ Integer
     * @return naechsteAusgabe
     */
    public static int gibNaechsteFarbe(int farbe) {
        // Deklaration der Variablen
        int farbanteilRot;
        int farbanteilGruen;
        int farbanteilBlau;
        int naechsteAusgabe;
        
        // Zerlegen von farbe in die Farbanteile Rot, Gruen und Blau
        farbanteilRot = farbe / 1000000;
        farbanteilGruen = farbe % 1000000 / 1000;
        farbanteilBlau = farbe % 1000;
        
        /* Farbanteil blau wird um ein erhöht und die Überschreitung über den 
        Wertebereich von 255 geprüft */
        farbanteilBlau = (farbanteilBlau + 1) % 256;
        /* Wenn blau den Wertebereich überschritten hat wird Grün um ein erhöht 
        und die Überschreitung über den Wertebereich von 255 geprüft */
        farbanteilGruen = (farbanteilBlau == 0) ? (farbanteilGruen + 1) % 256 
                : farbanteilGruen;
        /* Wenn blau und Grün den Wertebereich überschritten haben wird Rot um 
        ein erhöht und die Überschreitung über den Wertebereich von 255 geprüft 
        */
        farbanteilRot = (farbanteilGruen == 0 & farbanteilBlau == 0) 
                ? (farbanteilRot + 1) % 256 : farbanteilRot;
        
        // Aneinander hängen der einzelnen invertierten Farbanteile
        naechsteAusgabe = farbanteilRot * 1000000 + farbanteilGruen * 1000 
                + farbanteilBlau;
        
        return naechsteAusgabe;
    }
}
