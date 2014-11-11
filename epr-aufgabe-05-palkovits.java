/**
 * In dieser Klasse befinden sich mehrere Methoden.
 * Der Sinn dieser Klasse ist es, zusammenhängende farbwerte in Tupel zu
 * "trennen", diese zu Invertieren und jeweils den nächsten farbwert zu 
 * bestimmen.
 * Liste der Methoden:
 * int farbeZusammensetzen
 * int gebeBlau
 * int gebeGruen
 * int gebeRot
 * int gibNaechsteFarbe
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
    
    public static int farbeZusammensetzen(int rot, int gruen, int blau) {
        return (rot * 1000000) + (gruen * 1000) + (blau * 1);
    }
    
    
    /**.
    * In dieser Methode wird ein gegebener Farbwert Invertiert (also aus 255 
    * wird 0 invertiere(int).
    * @param farbe Wert der Farbe, die Invertiwert werden soll
    * @return invertierter Farbwert.
    */

    public static int invertiere(int farbe) {
        
        int rot = 255 - (gebeRot(farbe));
        int gruen = 255 - (gebeGruen(farbe));
        int blau = 255 - (gebeBlau(farbe));
        int invFarbe = farbeZusammensetzen(rot, gruen, blau);
               
        return invFarbe;
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

    public static int gibNaechsteFarbe(int farbe) {
        
        /*In dieser Abfolge von Ausdrücken wird versucht zu ermitteln,
        * wann welcher Farbwert addiert werden muss, bzw. ob sich ein 
        * Farbwert noch im Rahmen >=0 <=255 befindet. Anonnsten werden die
        * Bedingungen einfach durchkaskadiert. 
        */
        int blau = gebeBlau(farbe);
        int gruen = gebeGruen(farbe);
        int rot = gebeRot(farbe);
        
        blau = (blau >= 255) ? (0) : (blau + 1);
        
        gruen = (blau == 0)  
                ? ((gruen >= 255) ? (0) : (gruen + 1))  
                : (gruen);
        
        rot = (blau == 0)
                ? ((gruen == 0)
                    ? ((rot >= 255) ? (0) : (rot + 1))
                    : (rot))
                : (rot); 
        return farbeZusammensetzen(rot, gruen, blau);
    }




    /**
     * Dies ist die Main Methode und wird von der Klasse als erstes
     * aufgerufen. Hier werden die Farbwerte definiert und in Tupel ausgegeben.
     * @param args wird nicht verwendet.
     */
    public static void main(String [] args) {
    
        /* Hier sollen die Farben zunächst Invertiert werden. Dazu wird
        * die jeweilige Methode aufgerufen.
        */
        int rot = 0;
        int gruen = 0;
        int blau = 0;
        int farbe = farbeZusammensetzen(rot, gruen, blau);
        System.out.println(invertiere(farbe));
        
        rot = 10;
        gruen = 128;
        blau = 255;
        farbe = farbeZusammensetzen(rot, gruen, blau);
        System.out.println(invertiere(farbe));
        
        /* Nun sollen die Farben "addiert" werden. Auch dafür wird die
        *  dementsprechende Methode aufgerufen.
        */
        
        rot = 10;
        gruen = 11;
        blau = 12;
        farbe = farbeZusammensetzen(rot, gruen, blau);
        System.out.println(gibNaechsteFarbe(farbe));

        rot = 10;
        gruen = 128;
        blau = 255;
        farbe = farbeZusammensetzen(rot, gruen, blau);
        System.out.println(gibNaechsteFarbe(farbe));
        
        rot = 0;
        gruen =255;
        blau = 255;
        farbe = farbeZusammensetzen(rot, gruen, blau);
        System.out.println(gibNaechsteFarbe(farbe));
        
        rot = 255;
        gruen = 255;
        blau = 255;
        farbe = farbeZusammensetzen(rot, gruen, blau);
        System.out.println(gibNaechsteFarbe(farbe)); 
        
        System.out.println(farbeZusammensetzen(10, 20, 30));
    }
}
