
public class Rechteck {
	 private static String nameRechteck = "Rechteck";
	 private static String farbeRechteck;
	 
	 public static double l�ngeRechteck;
	 public static double breiteRechteck;
	 public static double fl�cheRechteck;
	 public static int zufallfarbeRechteck;
	 public static void randomRechteck()
	 {
		// random area and color is being generated
		 l�ngeRechteck = (double)((Math.random()) * 10 + 1);
		 breiteRechteck = (double)((Math.random()) * 10 + 1);
		 
		 fl�cheRechteck = l�ngeRechteck * breiteRechteck;
		 
		 zufallfarbeRechteck = (int)((Math.random()) * 4 + 1);
		 int zufallfarbeintRechteck = zufallfarbeRechteck;
		 if(zufallfarbeintRechteck == 1)
		 {
			 farbeRechteck = "rot";
		 }
		 else if(zufallfarbeintRechteck == 2)
		 {
			 farbeRechteck = "gr�n";
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
	 public static double getfl�cheRechteck() {
		 return fl�cheRechteck;
	 }
	 public static void writefl�cheRechteck() {
		 System.out.println(fl�cheRechteck);
	 }
	//this method collects all methods to built a rectangle
	 public static void allesRechteck() {
		 getfarbeRechteck();
		 writefarbeRechteck();
		 getfl�cheRechteck();
		 writefl�cheRechteck();
		 writenameRechteck();
	 }
}
