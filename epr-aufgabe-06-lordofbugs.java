/** Diese Klasse bearbeitet die Aufgaben in der Praktikumsaufgaben 6.
 * Dabei handelt es sich um Rekursiv gelöste Zahlenspielereien
 * @author LodOfBugs
 */
public class Zahlenspielerei {
    
    /**
     * Die Main Methode gibt die Reihenfolge an mit der die Aufgaben bearbeitet
     * werden.
     * Die Ergebnisse werden per println ausgegeben.
     * @param args wird nicht verwendet
     */
    public static void main(String []args) {
        System.out.println(enthaelt(4711, 1));
        System.out.println(enthaelt(4711, 2));
        System.out.println(enthaelt(789, 9));
        System.out.println(enthaelt(0, 0));
       
        System.out.println(gibAnzahl(4711, 1));
        System.out.println(gibAnzahl(4711, 2));
        System.out.println(gibAnzahl(789, 9));
        System.out.println(gibAnzahl(0, 0));
        
        System.out.println(filter(1332, 3));
        System.out.println(filter(3333, 3));
        System.out.println(filter(1332, 4));
        System.out.println(filter(1000, 0));
        System.out.println(filter(1, 1));
        System.out.println(filter(0, 0));
        System.out.println(filter(0, 5));
    }
    
    /**
     * Bei dieser Aufgabe ist eine Zahl und eine Ziffer gegeben.
     * Es soll geprüft werden ob die Ziffer in der Zahl enthalten ist
     * Falls dem so ist, soll das println der MainMethode "true" ausgeben.
     * @param zahl 
     * @param ziffer 
     * @return zahl was auch immer
     */
    public static boolean enthaelt(long zahl, int ziffer) {

        return (zahl % 10 == ziffer
            ? true
            : zahl <= 9
                ? false
                : enthaelt(zahl / 10, ziffer);
    }
    
    /**
     * Bei dieser Aufgabe ist eine Zahl und eine Ziffer gegeben.
     * Es soll angegeben werden wie oft die Ziffer in der Zahl enthalten ist
     * @param zahl 
     * @param ziffer 
     * @return zahl was auch immer
     */
    
    public static int gibAnzahl(long zahl, int ziffer) {
        int ausgabeWert;
        
        ausgabeWert = zahl <= 9
                ? zahl == ziffer
                    ? +1
                    : +0
                : gibAnzahl(zahl / 10, ziffer)
                + (zahl % 10 == ziffer
                        ? +1
                        : +0);
        
        return (ausgabeWert);
    }
    
    public static long filter(long zahl, int ziffer) {
        
        return (zahl <= 9 
                ? zahl % 10 == ziffer
                    ? 0
                    : zahl % 10
                : zahl % 10 == ziffer
                    ? filter(zahl / 10, ziffer)
                    : 10 * filter (zahl / 10, ziffer) + (zahl % 10));
    }
}
