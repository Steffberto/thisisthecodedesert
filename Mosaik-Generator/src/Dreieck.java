
public class Dreieck {
	 private static String nameDreieck = "Dreieck";
	 private static String farbeDreieck;
	 public static double dreieckbreite;
	 public static double dreieckhöhe;
	 
	 public static double flächedreieck;
	 public static int zufallfarbeDreieck;
	 
	 // random area and color is being generated
	 public static void randomDreieck()
	 {
		 dreieckbreite = (double)((Math.random()) * 10 + 1);
		 dreieckhöhe = (double)((Math.random()) * 10 + 1);
		 
		 flächedreieck = 0.5 * dreieckbreite * dreieckhöhe;
		 
		 zufallfarbeDreieck = (int)((Math.random()) * 4 + 1);
		 int zufallfarbeintDreieck = zufallfarbeDreieck;
		 if(zufallfarbeintDreieck == 1)
		 {
			 farbeDreieck = "rot";
		 }
		 else if(zufallfarbeintDreieck == 2)
		 {
			 farbeDreieck = "grün";
		 }
		 else if(zufallfarbeintDreieck == 3)
		 {
			 farbeDreieck = "blau";
		 }
		 else
		 {
			 farbeDreieck = "gelb";
		 }
		 // get and ouput methods
	 }
	 public static void writenameDreieck() {
		 System.out.println(nameDreieck);
	 }
	 public static String getfarbeDreieck() {
		 return farbeDreieck;
	 }
	 public static void writefarbeDreieck() {
		 System.out.println(farbeDreieck);
	 }
	 public static double getflächeDreieck() {
		 return flächedreieck;
	 }
	 public static void writeflächeDreieck() {
		 System.out.println(flächedreieck);
	 }
	 // this method collects all methods to built a triangle
	 public static void allesDreieck() {
		 getfarbeDreieck();
		 writefarbeDreieck();
		 getflächeDreieck();
		 writeflächeDreieck();
		 writenameDreieck();
	 }
}
