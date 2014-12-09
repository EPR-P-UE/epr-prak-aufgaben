/**
 * Ein Objekt dieser Klasse repräsentiert eine rationale Zahl die als Bruch 
 * dargestellt ist und die Eigenschaften Zähler und Nenner hat.
 * 
 * @author Jan Witthaus
 */
public class RationaleZahl {
    /**
     * Zähler der rationalen Zahl als Bruch dargestellt.
     */
    private final long zaehler;
    /**
     * Nenner der rationalen Zahl als Bruch dargestellt.
     */
    private final long nenner;
    
    /**
     * Konstruktor zur Erzeugung einer ganzen Zahl als rationale Zahl in Form 
     * eins Bruches dargestellt. Hierzu wird der ganzen Zahl ein Nenner mit dem 
     * Wert 1 hinzugefügt.
     * 
     * @param ganzeZahl Ganze Zahl die in einen Bruch umgewandelt wird
     */
    public RationaleZahl(long ganzeZahl) {
        this.zaehler = ganzeZahl;
        this.nenner = 1;
    }
    
    /**
     * Konstruktor zur Erzeugung einer rationalen Zahl in Form eins Bruches mit 
     * Zähler und Nenner dargestellt. Durch die Ermittlung des größten 
     * gemeinsamen Teilers wird der Bruch durch die Division von Zähler und 
     * Nenner durch den selbigen soweit wie möglich gekürzt.
     * 
     * @param zaehler Zähler des Bruches
     * @param nenner Nenner des Bruches
     */
    public RationaleZahl(long zaehler, long nenner) {
        long groessterTeiler;
        
        groessterTeiler = groessterTeiler(zaehler, nenner);
        
        this.zaehler = zaehler / groessterTeiler;
        this.nenner = nenner / groessterTeiler;
    }
    
    /**
     * Diese Methode addiert zwei rationale Zahlen als Bruch dargestellt.
     * Hierzu wird der größte gemeinsame Teiler der beiden Nenner errechnet um 
     * die Zähler zu erweitern und zu addieren. Anschließend wird der Nenner 
     * erweitert und das Ergebnis wird als Bruch zurück gegeben.
     * 
     * @param bruch Rationale Zahl die addiert werden soll
     * @return Summe der beiden rationalen Zahlen als Bruch dargestellt
     */
    public RationaleZahl addiere(RationaleZahl bruch) {
        long groessterTeiler;
        long erweiterterZaehler1;
        long erweiterterZaehler2;
        long summeZaehler;
        long erweiterterNenner;
        RationaleZahl summe;
        
        // Ermitteln des größten gemeinsamen Teilers beider Nenner
        groessterTeiler = groessterTeiler(this.nenner, bruch.nenner);
        
        /* Erweitern der Zähler, der beiden Nenner idem der Nenner der anderen 
        Zahl durch den größten gemeinsamen Teiler dividiert (um den Faktor mit 
        dem erweitert wird zu ermitteln) und mit dem Zähler multipliziert 
        wird. */
        erweiterterZaehler1 = bruch.nenner / groessterTeiler * this.zaehler;
        erweiterterZaehler2 = this.nenner / groessterTeiler * bruch.zaehler;
        // Addition der Zähler
        summeZaehler = erweiterterZaehler1 + erweiterterZaehler2;
        // Erweitern des Nenner wie oben beim Zähler
        erweiterterNenner = this.nenner / groessterTeiler * bruch.nenner;
        
        // Erzeugen eines neuen Bruches, der das Ergebnis darstellt
        summe = new RationaleZahl(summeZaehler, erweiterterNenner);
        
        return summe;
    }
    
    /**
     * Erzeugen eines neuen Bruches, der das Ergebnis darstellt. Hierzu wird 
     * wenn der Nenner 1 ist die Zahl als ganze Zahl zurück gegeben. Ist der 
     * Nenner größer als 1 so wird der Bruch so weit wie möglich gekürzt und 
     * Zähler und Nenner mit einem "/" getrennt zurückgegeben.
     * 
     * @return Bruch als Text dargestellt
     */
    public String gibAlsText() {
        String bruchAlsText;
        long burchZaehler;
        long burchNenner;
        long groessterTeiler;
        
        groessterTeiler = groessterTeiler(this.zaehler, this.nenner);
        
        burchZaehler = this.zaehler / groessterTeiler;
        burchNenner = this.nenner / groessterTeiler;
        
        bruchAlsText = (burchNenner == 1)
                ? burchZaehler + ""
                : burchZaehler + "/" + burchNenner;
        
        return bruchAlsText;
    }
    
    /**
     * Diese Methode ermittelt den größten gemeinsamen Teiler zweier Zahlen.
     * 
     * @param zaehler 1. Zahl
     * @param nenner 2. Zahl
     * @return Größter gemeinsamer Teiler von der 1. Zahl und der 2. Zahl
     */
    public static long groessterTeiler(long zaehler, long nenner) {
        long teiler;
        
        teiler = (zaehler ==  nenner || nenner == 0)
                ? zaehler
                : groessterTeiler(nenner, zaehler % nenner);
        
        return teiler;
    }
}
