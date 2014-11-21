/**
 * In dieser Klasse werden zahlen auf diverse ziffern überprüft,
 * die ziffern gezählt und zahlen gefiltert. 
 * @author robin
 */
public class Zahlenspielerei {
    /** In dieser Methode soll herausgefunden werden, ob eine zahl 
     * eine bestimmte ziffer enthält.
     * @param zahl zahl die auf die... 
     * @param ziffer ...geprüft werden soll.
     * @return Ist die ziffer in der zahl enthaelten (true) oder nicht (false)?
     */
    
    public static boolean enthaelt(long zahl, int ziffer) {
        return (ziffer == zahl % 10) 
               ? (true) 
               : ((zahl / 10 == 0)
                    ? (false)
                    : ((enthaelt(zahl / 10, ziffer)) 
                        ? (true)
                        : (false)));
    }
    
    /**.
     * In dieser Methode soll gezählt werden, wie oft die Ziffer in der 
     * Zahl vorkommt.
     * @param zahl Zahl in welcher geprüft werden soll wie oft die ...
     * @param ziffer ...in der Zahl vorkommt.
     * @return Anzahl der häufigkeit, wie oft die Ziffer in der Zahl vorkommt.
     */
    public static int gibAnzahl(long zahl, int ziffer) {
        /*Sonderfall: Um eine unendliche Rekursion zu verhindern,
        * wird vermieden, dass die Rekursion startet, wenn beide Parameter den
        * Wert 0 tragen.
        */
        return (zahl == 0 && ziffer == 0)
                ? (1)
                : (ziffer == zahl % 10)
                    ? 1 + gibAnzahl(zahl / 10, ziffer)
                    : ((zahl / 10 == 0) 
                        ? 0 
                        : 0 + (gibAnzahl(zahl / 10, ziffer)));
    }
    
    /**.
     * In dieser Methode soll eine Zahl so gefiltert werden, das sie beim
     * Ausgeben nur die Zahlen, welche nicht der Ziffer entsprechen.
     * @param zahl aus welcher die...
     * @param ziffer ..."rausgestrichen" bzw. Rausgefiltert wird.
     * @return "gefilterte" Zahl.
     */
    public static long filter(long zahl, int ziffer) {
        
        return (zahl / 10 > 0)
                    ? ((zahl % 10 == ziffer)
                        ? (filter(zahl / 10, ziffer))
                        : (10 * filter(zahl / 10, ziffer) + zahl % 10))
                    : ((zahl % 10 == ziffer)
                        ? (0)
                        : (zahl % 10)); 
                
    }
    
    /**
     * Dies ist die Main Methode der Klasse "Zahlenspielerrei".
     * @param args wird nicht verwendet.
     */
    public static void main(String[] args) {
        /*Hier die Ausgaben der Methode "enthaelt" (Aufgabenteil a)*/ 
        System.out.println(enthaelt(4711, 1));
        System.out.println(enthaelt(4711, 2));
        System.out.println(enthaelt(789, 9));
        System.out.println(enthaelt(0, 0));
        
        /* Hier die Ausgaben der Methode "gibAnzahl" (Aufgabenteil b)*/
        System.out.println(gibAnzahl(4711, 1));
        System.out.println(gibAnzahl(4711, 2));
        System.out.println(gibAnzahl(789, 9));
        System.out.println(gibAnzahl(0, 0));
        
        /* Hier die Ausgaben der Methode "filter" (Aufgabenteil c)*/ 
        System.out.println(filter(1332, 3));
        System.out.println(filter(3333, 3));
        System.out.println(filter(1332, 4));
        System.out.println(filter(1000, 0));
        System.out.println(filter(1, 1));
        System.out.println(filter(0, 0));
        System.out.println(filter(0, 5));
    }
}
