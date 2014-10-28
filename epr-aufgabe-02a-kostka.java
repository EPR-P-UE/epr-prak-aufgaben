/** Author: Sebastian Kostka
  * Diese Klasse enthält Ausdrücke, zur Durchführung von Prozentrechnungen.
  */

public class Prozentrechnungen {
    
     /** 
       * @param args wird nicht verwendet
       */
    
    public static void main(String[] args) {
        
        /* Berechnung eines Betrags "b1", der ein Jahr zuvor
         * (als Betrag "b") zu einem Zinssatz "p" angelegt wurde.
         * Formel: b1 = b * (1 + p / 100)
         * Umstellung d. Formel: b1 = b * (p + 100) / 100
         */
        
        System.out.println(240 * 103 / 100);
        System.out.println(80 * 102 / 100);
        
        /* Wird der Betrag "b" für zwei Jahre angelegt, erhöht sich "b"
         * durch Zinsen und Zinseszinsen auf einen Betrag "b2".
         * Formel: b2 = b * (1 + p / 100) * (1 + p / 100)
         * Umstellung d. Formel: b2 = b * (p + 100) * (p + 100) / 10000
         */
        
        System.out.println(240 * (107) * (107) / 10000);
        
    }
    
}
