/**
 * Diese Klasse enthält Methoden die prüfen ob eine Ziffer in einer Zahl 
 * enthalten ist, die, die Anzahl wie oft eine Ziffer in einer Zahl vorkommt 
 * ausgibt und die Ziffer aus einer Zahl herausfiltert.
 * 
 * @author Jan Witthaus
 */
public class Zahlenspielerei {
    /**
     * Gibt für die Beispiele die Rückgabewerte der Methoden der Klasse 
     * Zahlenspielerei auf dem Bildschirm aus.
     *
     * @param args  wird nicht verwendet
     */
    public static void main(String[] args) {
        System.out.println(enthaelt(4711, 1));
        System.out.println(enthaelt(4711, 2));
        System.out.println(enthaelt(789, 9));
        System.out.println(enthaelt(0, 0));
        System.out.println(' ');
        
        System.out.println(gibAnzahl(4711, 1));
        System.out.println(gibAnzahl(4711, 2));
        System.out.println(gibAnzahl(789, 9));
        System.out.println(gibAnzahl(0, 0));
        System.out.println(' ');
        
        System.out.println(filter(1332, 3));
        System.out.println(filter(3333, 3));
        System.out.println(filter(1332, 4));
        System.out.println(filter(1000, 0));
        System.out.println(filter(1, 1));
        System.out.println(filter(0, 0));
        System.out.println(filter(0, 5));
    }
    
    /**
     * Diese Methode prüft ob eine Ziffer in einer Zahl enthalten ist.
     * Hierzu wird zuerst geprüft ob die letzte Stelle er Zahl, der gegebenen 
     * Ziffern entspricht, wenn Ja dann wird sofort ein <code>true</code> 
     * zurück gegeben, ansonnten wird, wenn die Zahl einstellig ist ein 
     * <code>false</code> zurück gegeben, wenn nicht wird die nächste Stelle 
     * überprüft.
     * 
     * @param dezimalzahl Dezimalzahl die untersucht werden soll
     * @param ziffer Ziffer, von der fest gestellt werden soll ob sie in der 
     * Zahl enthalten ist
     * @return <code>true</code> wenn Ziffer enthalten ist, <code>false</code> 
     * wenn Ziffer nicht enthalten ist
     */
    public static boolean enthaelt(long dezimalzahl, int ziffer) {
        boolean enthaeltZahl;

        enthaeltZahl = (dezimalzahl % 10 == ziffer) 
                ? true 
                : (dezimalzahl < 10) 
                    ? false 
                    : enthaelt(dezimalzahl / 10, ziffer);
        
        return enthaeltZahl;
    }
    
    /**
     * Diese Methode gibt die Häufigkeit in der eine Ziffer in einer Zahl 
     * vorkommt zurück.
     * Hierzu wird zuerst geprüft ob die letzte Stelle er Zahl der gegebenen 
     * Ziffer entspricht und diese nicht 0 ist, dann wird die Anzahl um 1 
     * erhöht und die nächste Stelle überprüft. Ist die letzte Stelle nicht die 
     * gegebene Ziffer und die Zahl ist zweistellig, dann wird die nächste 
     * stelle aufgerufen.h Ist die Zahl einstellig und ist die 0 wird eine 1 
     * zurückgegeben ansonsten eine 0.
     * 
     * @param dezimalzahl Dezimalzahl die untersucht werden soll
     * @param ziffer Ziffer, von der die Häufigkeit des Vorkommens fest 
     * gestellt werden soll
     * @return Anzahl der Häufigkeit des Vorkommens
     */
    public static int gibAnzahl(long dezimalzahl, int ziffer) {
        int anzahl;
        
        anzahl = (dezimalzahl % 10 == ziffer && dezimalzahl != 0) 
                ? 1 + gibAnzahl(dezimalzahl / 10, ziffer)
                : (dezimalzahl >= 10)
                    ? gibAnzahl(dezimalzahl / 10, ziffer)
                    : (dezimalzahl == ziffer)
                        ? 1
                        : 0;
        
        return anzahl;
    }
    /**
     * Diese Methode filtert bestimme Ziffern aus einer Zahl und gibt die 
     * gefilterte Zahl zurück.
     * Hierzu wird, wenn die Zahl zweistellig ist und die letzte Stelle der 
     * Ziffer entspricht, wird die Stelle wegfallen gelassen und die nächste 
     * Stelle untersucht. Entspricht die letzte Stelle der Zahl nicht der 
     * Ziffer, so wird diese  beibehalten und die nächste Stelle untersucht. 
     * Ist die Zahl identisch mit der Ziffer so wird eine 0 zurück gegeben 
     * ansonsten wird die Dezimalzahl zurück gegeben.
     * 
     * @param dezimalzahl Dezimalzahl die untersucht werden soll
     * @param ziffer Ziffer die herausgefiltert werden soll
     * @return gefilterte Zahl
     */
    public static long filter(long dezimalzahl, int ziffer) {
        long gefilterteZahl;
        
        gefilterteZahl = (dezimalzahl >= 10)
                ? (dezimalzahl % 10 == ziffer)
                    ? filter(dezimalzahl / 10, ziffer)
                    : filter(dezimalzahl / 10, ziffer) * 10 + (dezimalzahl % 10)
                : (dezimalzahl == ziffer)
                    ? 0
                    : dezimalzahl;
        
        return gefilterteZahl;
    } 
}
