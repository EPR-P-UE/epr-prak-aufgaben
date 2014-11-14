/** Author: Sebastian Kostka
  * Diese Klasse enthält verschiedene Methoden zum Umgang mit Farben,
  * die durch das additive Farbmodell "RGB" repräsentiert werden.
  */

public class Farben {
    
    /** Zur Rückgabe der invertierten Form einer Farbe, wird der Integer-
      * Wert "farbe" in die Rot-, Grün- und Blauanteile zerlegt und diese
      * anschließend von 255 abgezogen. Zuletzt werden die einzelnen
      * Anteile wieder zusammengefügt und das Ergebnis zurückgegeben.
      *
      * @param farbe Übergabewert für die Farbe
      * @return ausgabeInvertiert
      */
    
    public static int invertiere(int farbe) {
        
        /* Deklaration der Variablen, für die Farbanteile von Rot,
         * Grün und Blau, vom Typ Integer.
         */
        
        int anteilRot;
        int anteilGruen;
        int anteilBlau;
        
        // Deklaration der Variable, zur Ausgabe der invertierten Farbe.
        int ausgabeInvertiert;
        
        /* Zerlegen der "farbe", in die einzelnen Rot-, Grün-, und
         * Blauanteile.
         */
        
        anteilRot = farbe / 1000000;
        anteilGruen = farbe % 1000000 / 1000;
        anteilBlau = farbe % 1000;
        
        /* Invertieren der Farbanteile, durch Subtraktion der
         * Werte von 255.
         */
        
        anteilRot = 255 - anteilRot;
        anteilGruen = 255 - anteilGruen;
        anteilBlau = 255 - anteilBlau;
        
        //Aneinander hängen der invertierten Farbanteile.
        ausgabeInvertiert = anteilRot * 1000000 + anteilGruen * 1000
                + anteilBlau;
        
        return ausgabeInvertiert;
        
    }
    
    
    /** Die Methode gibt die nachfolgende Farbe, einer Farbe im
      * RGB-Format zurück. Um einen Farbanteil um eins zu erhöhen, wird zuvor
      * der Integer-Wert "farbe" in die einzelnen Anteile zerlegt. Wenn der
      * Farbanteil 255 überschreitet wird er zurück auf 0 gesetzt und der
      * nächste Anteil um 1 erhöht. Dies geschieht in der gleichen Form für
      * weitere Farbanteile. Der letzte Schritt dient dazu, die einzelnen
      * Anteile aneinander zu hängen und zurück zu geben.
      *
      * @param farbe Übergabewert für die Farbe
      * @return folgendeAusgabe
      */
    
    public static int gibNaechsteFarbe(int farbe) {
        
        /* Deklaration der Variablen für die Farbanteile, der Farben Rot,
         * Grün und Blau, vom Typ Integer.
         */
        
        int anteilRot;
        int anteilGruen;
        int anteilBlau;
        
        /* Deklaration der Variable, zur Ausgabe der nachfolgenden
         * Farbe.
         */
        
        int folgendeAusgabe;
        
        /* Zerlegen der "farbe" in die einzelnen Rot-, Grün-, und
         * Blauanteile.
         */
        
        anteilRot = farbe / 1000000;
        anteilGruen = farbe % 1000000 / 1000;
        anteilBlau = farbe % 1000;
        
        /* Erhöhen des Farbanteils für Blau und Überprüfung auf
         * Überschreitung des Wertebereichs.
         */
        
        anteilBlau = (anteilBlau + 1) % 256;
        
        /* Erhöhung des Wertes für Grün, sobald Blau größer als 255 ist
         * und Überprüfung auf Überschreitung des Wertebereichs, für Grün.
         */
        
        anteilGruen = (anteilBlau == 0) ? (anteilGruen + 1) % 256 : anteilGruen;
        
        /* Erhöhung des Wertes für Rot, sobald Blau/Grün größer als 255 sind
         * und Überprüfung auf Überschreitung des Wertebereichs, für Grün.
         */
        
        anteilRot = (anteilGruen == 0 & anteilBlau == 0) ? (anteilRot + 1)
                % 256 : anteilRot;
        
        //Aneinander hängen der Farbanteile.
        folgendeAusgabe = anteilRot * 1000000 + anteilGruen * 1000 + anteilBlau;
        
        return folgendeAusgabe;
        
    }
    
    
    /** Ausgabe der invertierten Werte für die Testfälle (0, 0, 0) und
      * (10, 128, 255), sowie der nachfolgenden Werte für (10, 11, 12),
      * (10, 128, 255), (0, 255, 255) und (255, 255, 255).
      * 
      * @param args wird nicht verwendet
      */
    
    public static void main(String[] args) {
        
        //Den invertierten Wert von (0, 0, 0) ausgeben
        System.out.println(invertiere(0));
        
        //Den invertierten Wert von (10, 128, 255) ausgeben
        System.out.println(invertiere(10128255));
        
        //Die nachfolgende Farbe von (10, 11, 12) ausgeben
        System.out.println(gibNaechsteFarbe(10011012));
        
        //Die nachfolgende Farbe von (10, 128, 255) ausgeben
        System.out.println(gibNaechsteFarbe(10128255));
        
        //Die nachfolgende Farbe von (0, 255, 255) ausgeben
        System.out.println(gibNaechsteFarbe(255255));
        
        //Die nachfolgende Farbe von (255, 255, 255) ausgeben
        System.out.println(gibNaechsteFarbe(255255255));
        
    }
    
}
