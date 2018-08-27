
public class View {

public static void ausgaben() {
	// not used!
	/*int anzahlRandom;
	int anzahldersteineQuadrat = 0;
	int anzahldersteineRechteck = 0;
	int anzahldersteineKreis = 0;
	int anzahldersteineDreieck = 0;
	
	String typendersteineQuadrat = "Quadrat/e";
	String typendersteineRechteck = "Rechteck/e";
	String typendersteineKreis = "Kreis/e";
	String typendersteineDreieck = "Dreieck/e";
	
	String farberot = "rot/e";
	String farbegrün = "grün/e";
	String farbeblau = "blau/e";
	String farbegelb = "gelb/e";
	
	
	
	System.out.println("Willkommen beim Mosaik-Generator. Ein Mosaik wird jetzt erstellt.");
	System.out.println("Es gibt" + " " + anzahldersteineQuadrat + " " + farberot + " " + typendersteineQuadrat);
	System.out.println("Es gibt" + " " + anzahldersteineQuadrat + " " + farbegrün + " " + typendersteineQuadrat);
	System.out.println("Es gibt" + " " + anzahldersteineQuadrat + " " + farbeblau + " " + typendersteineQuadrat);
	System.out.println("Es gibt" + " " + anzahldersteineQuadrat + " " + farbegelb + " " + typendersteineQuadrat);
	System.out.println("Es gibt" + " " + anzahldersteineRechteck + " " + farberot + " " + typendersteineRechteck);
	System.out.println("Es gibt" + " " + anzahldersteineRechteck + " " + farbegrün + " " + typendersteineRechteck);
	System.out.println("Es gibt" + " " + anzahldersteineRechteck + " " + farbeblau + " " + typendersteineRechteck);
	System.out.println("Es gibt" + " " + anzahldersteineRechteck + " " + farbegelb + " " + typendersteineRechteck);
	System.out.println("Es gibt" + " " + anzahldersteineKreis + " " + farberot + " " + typendersteineKreis);
	System.out.println("Es gibt" + " " + anzahldersteineKreis + " " + farbegrün + " " + typendersteineKreis);
	System.out.println("Es gibt" + " " + anzahldersteineKreis + " " + farbeblau + " " + typendersteineKreis);
	System.out.println("Es gibt" + " " + anzahldersteineKreis + " " + farbegelb + " " + typendersteineKreis);
	System.out.println("Es gibt" + " " + anzahldersteineDreieck + " " + farberot + " " + typendersteineDreieck);
	System.out.println("Es gibt" + " " + anzahldersteineDreieck + " " + farbegrün + " " + typendersteineDreieck);
	System.out.println("Es gibt" + " " + anzahldersteineDreieck + " " + farbeblau + " " + typendersteineDreieck);
	System.out.println("Es gibt" + " " + anzahldersteineDreieck + " " + farbegelb + " " + typendersteineDreieck); */
}
// amount of shapes is being created
public static void randomObjekte()
{	
	for(int random = 0; random < 50; random++)
	{
	Quadrat rQuadrat = new Quadrat();
	rQuadrat.randomQuadrat();
	int randompc = (int)((Math.random()) * 100 + 1);
	random = randompc;
	if (randompc > 50) {
		getrandomQ(randompc);
		Quadrat.allesQuadrat();
	}
	
	for(int random1 = 0; random1 < 50; random1++)
	{
	Rechteck rRechteck = new Rechteck();
	rRechteck.randomRechteck();
	int randompc1 = (int)((Math.random()) * 100 + 1);
	random1 = randompc1;
	if (randompc1 > 50) {
		getrandomR(randompc1);
		Rechteck.allesRechteck();
	}
	
	for(int random2 = 0; random2 < 50; random2++)
	{
	Kreis rKreis = new Kreis();
	rKreis.randomKreis();
	int randompc2 = (int)((Math.random()) * 100 + 1);
	random2 = randompc2;
	if (randompc2 > 50) {
		getrandomK(randompc2);
		Kreis.allesKreis();
		
	}
	
	for(int random3 = 0; random3 < 50; random3++)
	{
	Dreieck rDreieck = new Dreieck();
	rDreieck.randomDreieck();
	int randompc3 = (int)((Math.random()) * 100 + 1);
	random3 = randompc3;
	if (randompc3 > 50) {
	getrandomD(randompc3);
	Dreieck.allesDreieck();
	}
    }
   }
  }
 }
}
 //random getter to print shapes
 public static void getrandomD(int rd){
	 int rda = rd;
	 System.out.println(rda);
 }
 public static void getrandomK(int rk){
	 int rda1 = rk;
	 System.out.println(rda1);
 }
 public static void getrandomQ(int rq){
	 int rda2 = rq;
	 System.out.println(rda2);
 }
 public static void getrandomR(int rr){
	 int rda3 = rr;
	 System.out.println(rda3);
 }
}
