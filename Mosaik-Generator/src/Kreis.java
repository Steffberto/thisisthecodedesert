
public class Kreis {
	 private static String nameKreis = "Kreis";
	 private static String farbeKreis;
	 
	 public static double durchmesserKreis;
	 public static double radiusKreis;
	 public static double fl�cheKreis;
	 public static int zufallfarbeKreis;
	 public static void randomKreis()
	// random area and color is being generated
	 {
		 durchmesserKreis = (double)((Math.random()) * 10 + 1);
		 radiusKreis = durchmesserKreis / 2;
		 
		 fl�cheKreis = radiusKreis * radiusKreis * Math.PI;
		 
		 zufallfarbeKreis = (int)((Math.random()) * 4 + 1);
		 int zufallfarbeintRechteck = zufallfarbeKreis;
		 if(zufallfarbeintRechteck == 1)
		 {
			 farbeKreis = "rot";
		 }
		 else if(zufallfarbeintRechteck == 2)
		 {
			 farbeKreis = "gr�n";
		 }
		 else if(zufallfarbeintRechteck == 3)
		 {
			 farbeKreis = "blau";
		 }
		 else
		 {
			 farbeKreis = "gelb";
		 }
		// get and ouput methods
	 }
	 public static void writenameKreis() {
		 System.out.println(nameKreis);
	 }
	 public static String getfarbeKreis() {
		 return farbeKreis;
	 }
	 public static void writefarbeKreis() {
		 System.out.println(farbeKreis);
	 }
	 public static double getfl�cheKreis() {
		 return fl�cheKreis;
	 }
	 public static void writefl�cheKreis() {
		 System.out.println(fl�cheKreis);
	 }
	// this method collects all methods to built a circle
	 public static void allesKreis() {
		 getfarbeKreis();
		 writefarbeKreis();
		 getfl�cheKreis();
		 writefl�cheKreis();
		 writenameKreis();
	 }
}
