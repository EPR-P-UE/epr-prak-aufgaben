/**
 * Diese Klasse enthält Methoden, die zwei Zahlen, egal zu welcher Basis 
 * dargestellt, addieren und zur selben Basis darstellt wieder zurückgeben.
 * 
 * @author Jan Witthaus
 */
public class Zahldarstellung {
    /**
     * Gibt für die Beispiele den Rückgabewert der Methode addiere, der Klasse 
     * Zahldarstellung auf dem Bildschirm aus.
     *
     * @param args  wird nicht verwendet
     */
    public static void main(String[] args) {
        System.out.println(addiere(1001, 11, 2));
        System.out.println(addiere(11011, 1110, 2));
        System.out.println(addiere(210, 11, 2));
        System.out.println(addiere(773, 0, 8));
        System.out.println(addiere(0, 107, 8));
        System.out.println(addiere(773, 107, 8));
        System.out.println(addiere(773, 1239, 8));
    }
    
    /**
     * Diese Methode addiert zwei gegebene Zahlen, die zu einer gegebenen Basis 
     * dargestellt sind. 
     * Hierzu wird zunächst geprüft ob die Darstellung der beiden Zahlen 
     * korrekt um sie anschließend in die dezimale Darstellung um zu wandeln. 
     * Ist eine der beiden gegebenen Zahlen nicht korrekt Dargestellt wird eine 
     * -1 als summe gespeichert. Sind beide Zahlendarstellungen OK, werden die 
     * beiden Zahlen in dezimaler Darstellung addiert. Ist die Summe -1 gibt 
     * die Methode -1 zurück ansonsten wird die Dezimalzahl in die Darstellung 
     * zur Ursprungsbasis zurückgerechnet und das Ergebnis zurück gegeben.
     * 
     * @param darstellung1 Erste Zahl die addiert werden soll
     * @param darstellung2 Zweite Zahl die addiert werden soll
     * @param basis Basis zu der die beiden Zahlen dargestellt sind
     * @return Summe der Addition zur gegeben Basis dargestellt
     */
    public static long addiere(long darstellung1, long darstellung2, 
            int basis) {
        // Deklaration der Variablen
        long summe;
        long endSumme;
        long summand1;
        long summand2;
        boolean darstellung1Ok;
        boolean darstellung2Ok;
        
        // Prüfen ob die Zahlen korrekt dargestellt ist
        darstellung1Ok = darstellungKorrekt(darstellung1, basis);
        darstellung2Ok = darstellungKorrekt(darstellung2, basis);
        
        // Zahl in dezimalen Wert umrechnen
        summand1 = gibWertZurBasis(darstellung1, basis);
        summand2 = gibWertZurBasis(darstellung2, basis);
        
        summe = (!darstellung1Ok || !darstellung2Ok) 
                ? -1
                : summand1 + summand2;
        
        endSumme = (summe == -1)
                ? summe 
                : rechneInZahlendarstellung(summe, basis);
        
        return endSumme;
    }
    
    /**
     * Diese Methode rechnet eine Zahl, die zu einer gegeben Basis dargestellt 
     * ist, in ihren dezimalen Wert um.
     * Hierzu wird wenn die gegebene Zahl 0 ist eine 0 zurückgegeben, ansonsten 
     * wird die vorherige Stelle mit der Basis multipliziert und die aktuelle 
     * Stelle addiert.
     * 
     * @param darstelung Zahl die umgerechnet werden soll
     * @param basis Basis zu der die Zahl dargestellt ist
     * @return Dezimaler Wert der gegeben Zahl
     */
    public static long gibWertZurBasis(long darstelung, int basis) {
        long dezimalerWert;
        
        dezimalerWert = (darstelung == 0)
                ? 0
                : basis * gibWertZurBasis(darstelung / 10, basis) 
                    + (darstelung % 10);
        
        return dezimalerWert;
    }
    
    /**
     * Diese Methode rechnet eine gegebene dezimale Zahl in eine Darstellung zu 
     * einer gegeben Basis um.
     * Hiezu wird, wenn die Zahl 0 ist eine 0 zurück gegeben, ansonsten wird 
     * wenn die Zahl durch die Basis geteilt 0 ist, der Restwert der Division 
     * durch die Basis zurück gegeben. Wenn die Zahl durch die Basis geteilt 
     * nicht 0 ist wird der Wert der Division und die Basis erneut geprüft und 
     * das Ergebnis mit 10 multipliziert und Restwert der Division durch die 
     * Basis addiert.
     * 
     * @param zahl Zahl die umgerechnet werden soll
     * @param basis Basis zu der die Zahl umgerechnet  werden soll
     * @return Wert zur gegebenen Basis dargestellt
     */
    public static long rechneInZahlendarstellung(long zahl, int basis) {
        long wertInZahlendarstellung;
        
        wertInZahlendarstellung = (zahl == 0)
                ? 0
                : ((zahl / basis) == 0)
                    ? zahl % basis
                    : rechneInZahlendarstellung(zahl / basis, basis) * 10 
                        + (zahl % basis);
        
        return wertInZahlendarstellung;
    }
    
    /**
     * Diese Methode prüft ob eine Zahl zu einer gegebenen Basis dargestellt 
     * richtig dargestellt ist, also keine Zahlen enthält die größer oder 
     * gleich der Basis sind.
     * Hierzu wird, wenn die letzte Stelle der Ziffer kleiner als die Basis ist 
     * und die Zahl zweistellig ist ein <code>true</code> zurück gegeben. Ist 
     * die zahl nicht zweistellig wird die vorherige Stelle untersucht. Ist die 
     * Zahl einstellig und größer als die Basis so wird ein <code>false</code> 
     * zurück gegeben.
     * 
     * @param darstelung Zahl die geprüft werden soll
     * @param basis Basis zu der die Zahl dargestellt ist
     * @return Ist die Zahl korrekt Dargestellt oder nicht?
     */
    public static boolean darstellungKorrekt(long darstelung, int basis) {
        boolean darstellungOk;
        
        darstellungOk = (darstelung % 10 < basis) 
                ? (darstelung < 10) 
                    ? true 
                    : darstellungKorrekt(darstelung / 10, basis) 
                : false;
        
        return darstellungOk;
    }
}
