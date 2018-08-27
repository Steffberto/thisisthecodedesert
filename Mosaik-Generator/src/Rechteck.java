
public class Rechteck {
	 private static String nameRechteck = "Rechteck";
	 private static String farbeRechteck;
	 
	 public static double längeRechteck;
	 public static double breiteRechteck;
	 public static double flächeRechteck;
	 public static int zufallfarbeRechteck;
	 public static void randomRechteck()
	 {
		// random area and color is being generated
		 längeRechteck = (double)((Math.random()) * 10 + 1);
		 breiteRechteck = (double)((Math.random()) * 10 + 1);
		 
		 flächeRechteck = längeRechteck * breiteRechteck;
		 
		 zufallfarbeRechteck = (int)((Math.random()) * 4 + 1);
		 int zufallfarbeintRechteck = zufallfarbeRechteck;
		 if(zufallfarbeintRechteck == 1)
		 {
			 farbeRechteck = "rot";
		 }
		 else if(zufallfarbeintRechteck == 2)
		 {
			 farbeRechteck = "grün";
		 }
		 else if(zufallfarbeintRechteck == 3)
		 {
			 farbeRechteck = "blau";
		 }
		 else
		 {
			 farbeRechteck = "gelb";
		 }
		// get and ouput methods
	 }
	 public static void writenameRechteck() {
		 System.out.println(nameRechteck);
	 }
	 public static String getfarbeRechteck() {
		 return farbeRechteck;
	 }
	 public static void writefarbeRechteck() {
		 System.out.println(farbeRechteck);
	 }
	 public static double getflächeRechteck() {
		 return flächeRechteck;
	 }
	 public static void writeflächeRechteck() {
		 System.out.println(flächeRechteck);
	 }
	//this method collects all methods to built a rectangle
	 public static void allesRechteck() {
		 getfarbeRechteck();
		 writefarbeRechteck();
		 getflächeRechteck();
		 writeflächeRechteck();
		 writenameRechteck();
	 }
}
