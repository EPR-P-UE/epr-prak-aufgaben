/**
 * In dieser Klasse befinden sich mehrere Methoden.
 * Der Sinn dieser Klasse ist es, zusammenhängende farbwerte in Tupel zu
 * "trennen", diese zu Invertieren und jeweils den nächsten farbwert zu 
 * bestimmen.
 * Liste der Methoden:
 * long farbeZusammensetzen
 * int gebeBlau
 * int gebeGruen
 * int gebeRot
 * lont gibNaechsteFarbe
 * int invertiere
 * void main
 * @author Robin Palkovits
 */
public class Farben {

    /**
     * Diese Methode dient dazu, aus dem zusammengesetzen farbwert den Rotwert
     * zu ermittel.
     * @param farbwert zusammengesetzer farbwert.
     * @return Die ersten 3 Stellen für den Rotwert.
     */

    public static int gebeRot(long farbwert) {
        return (int) farbwert / 1000000;
    }

    /**
     * Diese Methode dient dazu, aus dem zusammengesetzen farbwert den Grünwert
     * zu ermitteln.
     * @param farbwert zusammengesetzer farbwert.
     * @return Die mittleren 3 stellen für den Grünwert.
     */

    public static int gebeGruen(long farbwert) {
        return (int) (farbwert / 1000) % 1000;
    }

    /**
     * Diese Methode dient dazu, aus dem zusammengesetzen farbwert den Blauwert
     * zu ermitteln.
     * @param farbwert zusammengesetzer farbwert.
     * @return Die letzen 3 Stellen für den Blauwert.
     */

    public static int gebeBlau(long farbwert) {
        return (int) (farbwert % 1000);
    }

    /**.
     * In dieser Methode werden aus den 3 Farbwerten Rot Grün und Blau wieder
     * eine Zahl (rrrgggbbb) geformt.
     * @param rot : Wert der Roten Farbe
     * @param gruen : Wert der Grünen Farbe
     * @param blau : Wert der Blaun Farbe
     * @return zusammengesetzerFarbwert: Zusammengesetzer Farbwert (rrrgggbbb)
     */
    
    public static long farbeZusammensetzen(int rot, int gruen, int blau) {
        return (rot * 1000000) + (gruen * 1000) + (blau * 1);
    }
    
    
    /**.
    * In dieser Methode wird ein gegebener Farbwert Invertiert (also aus 255 
    * wird 0 invertiere(int).
    * @param farbe Wert der Farbe, die Invertiwert werden soll
    * @return invertierter Farbwert.
    */

    public static int invertiere(int farbe) {
        return (255 - farbe);
    }

    /** In dieser Methode soll nun immer die nächste Farbe
    * berechnet werden. Da jeder Farbwert nur bis max. 255 geht
    * wird überprüft, wann das jeweils andere Farbentupel erhöht werden
    * soll.
    * @param rot Rotwert
    * @param gruen Grünwert
    * @param blau Blauwert
    * @return die neuen 3 Farbtuppel
    */

    public static long gibNaechsteFarbe(int rot, int gruen, int blau) {
        
        /*In dieser Abfolge von Ausdrücken wird versucht zu ermitteln,
        * wann welcher Farbwert addiert werden muss, bzw. ob sich ein 
        * Farbwert noch im Rahmen >=0 <=255 befindet. Anonnsten werden die
        * Bedingungen einfach durchkaskadiert. 
        */
        
        blau = (blau >= 255) ? (0) : (blau + 1);
        
        gruen = (blau == 0)  
                ? ((gruen >= 255) ? (0) : (gruen + 1))  
                : (gruen);
        
        rot = (gruen == 0)
                ? ((rot >= 255) ? (0) : (rot + 1))
                : (rot);
        return farbeZusammensetzen(rot, gruen, blau);
    }




    /**
     * Dies ist die Main Methode und wird von der Klasse als erstes
     * aufgerufen. Hier werden die Farbwerte definiert und in Tupel ausgegeben.
     * @param args wird nicht verwendet.
     */
    public static void main(String [] args) {
    
        long farbe = 0_0_0;
        int rot = (int) gebeRot(farbe);
        int gruen = (int) gebeGruen(farbe);
        int blau = (int) gebeBlau(farbe);
    
        /* Hier sollen die Farben zunächst Invertiert werden. Dazu wird
        * die jeweilige Methode aufgerufen.
        */
        System.out.println(farbeZusammensetzen(invertiere(rot), 
                            invertiere(gruen), invertiere(blau)));
        
        farbe = 10_128_255;
        rot = (int) gebeRot(farbe);
        gruen = (int) gebeGruen(farbe);
        blau = (int) gebeBlau(farbe);
        
        System.out.println(farbeZusammensetzen(invertiere(rot), 
                            invertiere(gruen), invertiere(blau)));
        
        /* Nun sollen die Farben "addiert" werden. Auch dafür wird die
        *  dementsprechende Methode aufgerufen.
        */
        
        farbe = 10_11_12;
        rot = gebeRot(farbe);
        gruen = gebeGruen(farbe);
        blau = gebeBlau(farbe);
        System.out.println(gibNaechsteFarbe(rot, gruen, blau));

        farbe = 10_128_255;
        rot = gebeRot(farbe);
        gruen = gebeGruen(farbe);
        blau = gebeBlau(farbe);
        System.out.println(gibNaechsteFarbe(rot, gruen, blau));
        
        farbe = 255_255;
        rot = gebeRot(farbe);
        gruen = gebeGruen(farbe);
        blau = gebeBlau(farbe);
        System.out.println(gibNaechsteFarbe(rot, gruen, blau));
        
        farbe = 255_255_255;
        rot = gebeRot(farbe);
        gruen = gebeGruen(farbe);
        blau = gebeBlau(farbe);
        System.out.println(gibNaechsteFarbe(rot, gruen, blau));   
    }
}
