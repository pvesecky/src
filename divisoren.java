/**
 * divisoren ist ein kleines Programm, das Teil der ersten
 * Übung ist.
 * 
 * @author Patrick Vesecky
 * @version 1.1 n,m --> minimum und maximum
 *
 */
public class divisoren {
    
	/**
     * Die Methode sucheAnzahlDivisoren berechnet die Maximale
     * Anzahl der Divisoren der größten Zahl(m) und vergleicht
     * mit der kleineren Zahl(n) wieviel gemeinsame Divisoren 
     * sie besitzen.
     * 
     * Intern in der Methode wird die Methode ausgebenMaximal
     * und die Methode ausgebenMehrfach aufgerufen
     * 
     * @param n ist die kleinere Zahl(Minimalwert)
     * @param m ist die größere Zahl(Maximalwert)
     * @see #ausgebenMaximal(int)
     * @see #ausgebenMehrfach(int)
     * 
     */
    private void sucheAnzahlDivisoren(int minimum, int maximum){
		divisoren d = new divisoren();
		int zaehlerDivisoren = 0;
                int zaehlerMehrfach = 0;
		int prueferFuerMaximum = 0;
                int prueferFuerMinimum = 0;
		
			for(int i = 1; i <= maximum; i++){
                            prueferFuerMaximum = maximum%i;
				if(prueferFuerMaximum == 0)
                                    {zaehlerDivisoren++;}
                                if(i<=minimum)
                                {prueferFuerMinimum = minimum%i;
                                if(prueferFuerMinimum ==prueferFuerMaximum)
                                    {zaehlerMehrfach++;}
                                }           
                                        
                                        
			}
                d.ausgebenMaximal(zaehlerDivisoren);
                d.ausgebenMehrfach(zaehlerMehrfach);
	}
	
    /**
     * Die Methode ausgebenMaximal bekommt aus der Methode sucheAnzahlDivisoren
     * direkt die Anzahl mitgeteilt und gibt sie über einen String aus
     * 
     * @param n ist die Anzahl der Divisoren des Maxmalwertes
     * @see #sucheAnzahlDivisoren(int, int)
     */
    public void ausgebenMaximal(int zahl){
		String s = "";
		s = "Maximale Anzahl der Divisoren ="+zahl;
		System.out.println(s);
    }
    
    /**
     * Die Methode ausgebenMehrfach bekommt aus der Methode sucheAnzahlDivisoren
     * direkt die Anzahl mitgeteilt und gibt sie über einen String aus
     * 
     * @param n ist die Anzahl der Mehrfachtreffer des Minimal und Maximalwertes 
     * 			in Bezug auf die Divisoren
     * @see #sucheAnzahlDivisoren(int, int)
     * 
     */
    public void ausgebenMehrfach(int zahl){
		String s = "";
		s = "Mehrfache Anzahl der Divisoren ="+zahl;
		System.out.println(s);
    }
    
    /**
     * Die Methode main wird vom JVM gestartet und 
     * erzeugt (instantiiert) ein neues Divisor Objekt
     * und ruft direkt die Methode sucheAnzahlDivisor auf
     * 
     * @see #sucheAnzahlDivisoren(int, int)
     */
    public static void main(String[] args) {
        divisoren d = new divisoren();
        d.sucheAnzahlDivisoren(2, 10000000);
    }
    
}
