DENKT DRAN NICHT ABSCHREIBEN SONDERN SEELBST LÖSEN :D


/**
 * Diese Klasse berechnet zwei verschiedene Strompreise für 1 Jahr.
 * Sie gibt den niedrigsten Preis aus.
 * @author 
 */
public class Stromrechnung {

    /**
     *
     *
     * @param args  wird nicht verwendet
     */
    public static void main(String[] args) {
      /*
       * Definition der Variablen
       */
        int jahresVerbrauch = 3536;        
        double grundpreisT1 = 5.75;
        double grundpreisT2 = 9.85;
        double verbrauchCentT1 = 23.49;
        double verbrauchCentT2 = 22.10;
        double endpreisT1;
        double endpreisT2;
       /*  
        * Der Grundpreis der Stromanbieter pro Monat, wird auf ein Jahr 
        * gerechnet.
        */
        grundpreisT1 =  grundpreisT1 * 12;
        grundpreisT2 =  grundpreisT2 * 12;
        
        /*
         * Der Grundpreis für ein Jahr wird mit dem verbrauchspreis pro Stunde
         * mit der vorgegebene Anzahl multipliziert. Anschließend wird durch
         * 100 gerechnet, da wir von cent und nicht von euro sprechen.
        */
        endpreisT1 = grundpreisT1 + (jahresVerbrauch * verbrauchCentT1) / 100;
        endpreisT2 = grundpreisT2 + (jahresVerbrauch * verbrauchCentT2) / 100;
        /*
         * Die Variable endpreisT1 & endpreisT2 werden vom Type double in 
         * den Type integer umgewandelt und gleichzeitig gerundet.
        */        
        endpreisT1 = (double) (int) (100 * endpreisT1 + 0.5) / 100;
        endpreisT2 = (double) (int) (100 * endpreisT2 + 0.5) / 100;
        
        System.out.print((endpreisT1 < endpreisT2)
                ? endpreisT1 : endpreisT2);
        
        

    }
}

