
public class Dreieck {
	 private static String nameDreieck = "Dreieck";
	 private static String farbeDreieck;
	 public static double dreieckbreite;
	 public static double dreieckh�he;
	 
	 public static double fl�chedreieck;
	 public static int zufallfarbeDreieck;
	 
	 // random area and color is being generated
	 public static void randomDreieck()
	 {
		 dreieckbreite = (double)((Math.random()) * 10 + 1);
		 dreieckh�he = (double)((Math.random()) * 10 + 1);
		 
		 fl�chedreieck = 0.5 * dreieckbreite * dreieckh�he;
		 
		 zufallfarbeDreieck = (int)((Math.random()) * 4 + 1);
		 int zufallfarbeintDreieck = zufallfarbeDreieck;
		 if(zufallfarbeintDreieck == 1)
		 {
			 farbeDreieck = "rot";
		 }
		 else if(zufallfarbeintDreieck == 2)
		 {
			 farbeDreieck = "gr�n";
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
	 public static double getfl�cheDreieck() {
		 return fl�chedreieck;
	 }
	 public static void writefl�cheDreieck() {
		 System.out.println(fl�chedreieck);
	 }
	 // this method collects all methods to built a triangle
	 public static void allesDreieck() {
		 getfarbeDreieck();
		 writefarbeDreieck();
		 getfl�cheDreieck();
		 writefl�cheDreieck();
		 writenameDreieck();
	 }
}
