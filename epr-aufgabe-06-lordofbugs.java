/** Diese Klasse bearbeitet die Aufgaben in der Praktikumsaufgaben 6.
 * Dabei handelt es sich um Rekursiv gelöste Zahlenspielereien
 * @author Rafael Martin
 */
public class Zahlenspielerei {
    
    /**
     * Die Main Methode gibt die Reihenfolge an mit der die Aufgaben bearbeitet
     * werden.
     * Die Ergebnisse werden per println ausgegeben.
     * @param args wird nicht verwendet
     */
    public static void main(String []args) {
        //Testfälle Aufgabe 1
        System.out.println(enthaelt(4711, 1));
        System.out.println(enthaelt(4711, 2));
        System.out.println(enthaelt(789, 9));
        System.out.println(enthaelt(0, 0));
        
       //Testfälle Aufgabe 2
        System.out.println(gibAnzahl(4711, 1));
        System.out.println(gibAnzahl(4711, 2));
        System.out.println(gibAnzahl(789, 9));
        System.out.println(gibAnzahl(0, 0));
        
        //Testfälle Aufgabe 3
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

        //Wenn die letzte Stelle = Ziffer ist, dann true
        return (zahl % 10 == ziffer
            ? true
            /* sonst wird geprüft ob es bereits die letzte Stelle ist
                * Ist dem so, dann ist die Angabe false
                */
            : zahl <= 9
                ? false
                /* SONST: rufe die Methode erneut auf
                * Die Zahl  eine Stelle kürzen und sie sowieo Ziffer übergeben
                * Dann von oben: erneut prüfen bis letzte Stelle erreicht ist.
                */ 
                : enthaelt(zahl / 10, ziffer));
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
    //Wenn die Zahl kleiner als 9 ist
        ausgabeWert = zahl <= 9
                //dann wird direkt auf die Ziffer geprüft
                ? zahl == ziffer
                //falls ja, wird einmal hochgezählt
                    ? +1
                //sonst nicht
                    : +0
                //Sonst: Methode neu aufrufen mit einer Stelle versetzt
                : gibAnzahl(zahl / 10, ziffer)
                //Die abgeschnittene Stelle wird auf die Ziffer geprüft
                + (zahl % 10 == ziffer
                //Falls es sie ist: Hochzählen.
                        ? +1
                //Sonst: Nichts
                        : +0);
        
        return (ausgabeWert);
    }
    
    /**
     * Bei dieser Aufgabe ist eine Zahl und eine Ziffer gegeben.
     * Es sollen Stellen entsprechend der Ziffer gestrichen werden.
     * @param zahl 
     * @param ziffer 
     * @return zahl was auch immer
     */ 
    public static long filter(long zahl, int ziffer) {
        //Zuerst wird geprüft ob beriets die letzte Ziffer vorliegt
        return (zahl <= 9 
                //Falls ja: wird geprüft ob die Zahl = Ziffer ist
                ? zahl == ziffer
                //Falls ja wird sie gelöscht (0 gesetzt)
                    ? 0
                //Falls nein, bleibt sie erhalten.
                    : zahl
                //Bei Mehrstelligkeit wird die hinterste Stelle abgeschnitten
                //Und auf Ziffergleichheit geprüft
                : zahl % 10 == ziffer
                /* Sollte dem so sein so wird die Stelle abgeschnitten
                * Die verkürzte Zahl wird samt der Ziffer übergeben
                */
                    ? filter(zahl / 10, ziffer)
                /* Ansonsten wird die Stelle wieder angehängt
                 * und der Methode für die nächste Prüfung übergeben
                 * Da die Prüfung eher stattfindet werden die Stellen erst
                 * beim Zurückgehen (rekursiv) angehängt
                */
                    : (zahl % 10) + filter(zahl / 10, ziffer) * 10);
    }
}
