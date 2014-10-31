/**
 * Klasse, welche auf Basis von Variablen verschiedene Zinsberechungen
 * ausführt.
 * @author robin
 */
public class Zinsberechnung {
    /**in dieser Funktion werden Zinsen in Kommadarstellung abgebildet.
     * Jedoch werden hier keine Fliesskommazahlen sondern zwei Integer Zahlen
     * verwendet, um die Genauigkeit zu erhöhen.
     * @param args wird nicht verwendet.
T     */
    public static void main(String [] args) {
        /*Zunächt wird eine Variable für die Anlage und den Zinssatz 
                Deklariert.)*/
        
        int iAnlage;
        int iZSatz;
        
        /*Als nächstes brauchen wir noch Variablen für die Ausgabe.*/
        
        int iVorkomma;
        int iNachkomma;
        
        //int iJahre = 2;
        
        /* Nun können wir die Variablen für den Betrag und den Zinssatz
            Definieren.
        */
        
        iAnlage = 117;
        iZSatz = (3 + 100);
        
        /*Hier Rechnen wir nun die Werte für die Vorkommastelle (iVorkomma)
            und die Nachkommastelle (iNachkomma) aus.
        */
        
        iVorkomma = ((iAnlage * iZSatz) / 100);
        iNachkomma = ((iAnlage * iZSatz) % 100);
       
        /*Nun fügen wir noch die vorkommastelle und die Nachkommastelle in
            den Print() Methoden zusammen, so dass unsere ausgabe wie folgt
            aussieht: iVorkomma,iNachkomma.
        */
        
        System.out.print(iVorkomma);
        System.out.print(',');
        System.out.println(iNachkomma); 
        
        iVorkomma = ((iAnlage * ((iZSatz) * (iZSatz))) / 10000);
        iNachkomma = ((iAnlage * ((iZSatz) * (iZSatz))) % 100);
        
        System.out.print(iVorkomma);
        System.out.print(',');
        System.out.println(iNachkomma); 
        
        iVorkomma = ((iAnlage * ((iZSatz) * (iZSatz) * (iZSatz))) / 1000000);
        iNachkomma = ((iAnlage * ((iZSatz) * (iZSatz) * (iZSatz))) % 100);
        
        System.out.print(iVorkomma);
        System.out.print(',');
        System.out.println(iNachkomma);
        
        /*Hier sollen nun nocheinmal die Zinsen berechnet werden, jedoch
            werden hier nun die Beträge auf ganze Cents gerundet.
        */
        
        /*Damit wir vernünftig runden können, müssen wir unsere Stellen 
            zunächst einmal ein 2 Variabeln (einer und Zehner) aufteilen.
        */
        
        int iEiner;
        int iZehner;
        
        iVorkomma = ((iAnlage * iZSatz) / 100);
        iNachkomma = ((iAnlage * iZSatz) % 100);
        
        iEiner = (iNachkomma % 10);
        iZehner = (iNachkomma / 10);
        
        /*Als nächstes brauchen wir noch einen Übertrag, damit wir später auf
            volle Cent runden können. Der Übertrag berechnet sich aus der
            einerstelle + 50 (weil wir ab 5 aufrunden) dividiert duch 100.
            Haben wir nun eine Zahl welche mit 50 Addiert noch 100 liegt (0.9)
            brauchen wir nicht zu runden.
            Liegt unsere Zahl allerdings über 100 (1.0) wird die Zehnerstelle
            aufgerundet, indem wir sie mit dem Übertrag verrechnen 
            (bedenke: Bei Integer Variablen wird die Kommastelle immer
            verworfen!).
        */
        
        int iUebertrag;
        
        iUebertrag = (((iEiner * 10) + 50) / 100);
        iZehner = (iZehner + iUebertrag);
        
        /*Danach wird noch die Einerstelle durch eine Division durch 10
            verworfen.
        */
        
        iEiner = (iEiner / 10);
        
        System.out.print(iVorkomma);
        System.out.print(',');
        System.out.print(iZehner);
        System.out.println(iEiner);
        
        /*Dieses System wiederholen wir zunächst für die Berechnung der
            Zinseszinsen für 2 Jahre.
        */
        iVorkomma = ((iAnlage * ((iZSatz) * (iZSatz))) / 10000);
        iNachkomma = ((iAnlage * ((iZSatz) * (iZSatz))) % 100);
        
        iEiner = (iNachkomma % 10);
        iZehner = (iNachkomma / 10);
        
        iUebertrag = (((iEiner * 10) + 50) / 100);
        iZehner = (iZehner + iUebertrag);
        
        iEiner = (iEiner / 10);
        
        System.out.print(iVorkomma);
        System.out.print(',');
        System.out.print(iZehner);
        System.out.println(iEiner);
        
        /*Und zu guter letzt noch für 3 Jahre.
        */
        
        iVorkomma = ((iAnlage * ((iZSatz) * (iZSatz) * (iZSatz))) / 1000000);
        iNachkomma = ((iAnlage * ((iZSatz) * (iZSatz) * (iZSatz))) % 100);
        
        
        iEiner = (iNachkomma % 10);
        iZehner = (iNachkomma / 10);
        
        iUebertrag = (((iEiner * 10) + 50) / 100);
        
        iZehner = (iZehner + iUebertrag);
        
        iEiner = (iEiner / 10);
        
        System.out.print(iVorkomma);
        System.out.print(',');
        System.out.print(iZehner);
        System.out.println(iEiner);
    }
}
