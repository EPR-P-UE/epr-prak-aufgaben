/**
 * In dieser Klasse werden zunächst 2 Stromtarife miteinander verglichen.
 * Danach wird der günsigste zunächst auf eine bestimmte Anzahl von Stellen
 * gerundet und danach ausgegeben.
 * @author robin
 */
public class Stromrechnung {
    /**...
     * @param args wird nicht verwednet.
     */
    public static void main(String[] args) {
        /*
        * Zunächst legen wir 2 Variablen für den Grundpreis unserer Verträge an.
            Da die Preise für ein Jahr berechnet werden sollen, multiplizieren
            wir diese direkt mit 12 monaten. 
        */
        
        double grundpreisTarif1 = (5.75 * 12);
        double grundpreisTarif2 = (9.85 * 12);
        
        /*
        * Jetzt müssen wir noch 2 Variablen für die Verbrauchpreise
        * unserer Tarife anlegen.
        */
        
        double verbrauchspreisTarif1 = 23.49;
        double verbrauchspreisTarif2 = 22.10;
        
        /*
        * Nun legen wir noch eine Variale für den Verbrauch an.
        */
        
        int verbrauch = 3536;
        
        
        /*
        * Jetzt Verrechnen wir unsere beiden Tarife mit dem Verbrauch.
            Dazu legen wir 2 weitere Variablen für das Ergebniss an:
        */
        
        double gesamtpreisTarif1 = ((verbrauchspreisTarif1 / 100) * verbrauch) 
                                    + grundpreisTarif1;
        
        double gesamtpreisTarif2 = (verbrauchspreisTarif2 * verbrauch)
                                    + grundpreisTarif2;
        
        /* Nun sollen wir den erechneten Betrag auf 2 Stellen runden.
            dies können wir mit einer Umgestellten Rundungsformel:
                100 * Zahl + 0,5 / 100
            Damit diese Formel funktioniert benutzen wir einen kleinen Trick.
                Zunächst wandeln wir das Ergebniss der Rechnung
                100 * Zahl +0.5 in eine Integervariable um. Ist eine Zahl mit
                0.5 verrechnet nun größer als 0.99 wird die Zahl mit 1 
                addiert (da Integervariablen keine Nachkommastellen besitzen).
                
                Zu diesem Zeitpunkt ist die Zahl natürlich noch viel zu
                groß. Um nun die letzen beiden Stellen wieder in den
                Nachkommabereich zu bekommen (und nicht einfach nur abzu-
                schneiden) wandeln wir zunächst die Zahl wieder in eine
                double Zahl (welche Nachkommastellen besitzt) um und Dividieren
                die Zahl mit 100.
        */
        
        gesamtpreisTarif1 = ((int) (100 * gesamtpreisTarif1 + 0.5)) 
                                / (double) 100;
        
        gesamtpreisTarif2 = ((int) (100 * gesamtpreisTarif2 + 0.5)) 
                                / (double) 100;
        
        /*Nun werden noch die Preise der beiden Tarife miteinander verglichen.
            Der Günstigste der beiden Tarife zu dem Verbrauch, welcher sich in
            der Variable Verbrauch befindet soll ausgegeben werden.
        */
        
        double guenstigsterTarif = 
                (gesamtpreisTarif1 < gesamtpreisTarif2 ? gesamtpreisTarif1
                                                       : gesamtpreisTarif2);
                                        
        System.out.println(guenstigsterTarif);
    }
}
