
public class Kreis {
	 private static String nameKreis = "Kreis";
	 private static String farbeKreis;
	 
	 public static double durchmesserKreis;
	 public static double radiusKreis;
	 public static double flächeKreis;
	 public static int zufallfarbeKreis;
	 public static void randomKreis()
	// random area and color is being generated
	 {
		 durchmesserKreis = (double)((Math.random()) * 10 + 1);
		 radiusKreis = durchmesserKreis / 2;
		 
		 flächeKreis = radiusKreis * radiusKreis * Math.PI;
		 
		 zufallfarbeKreis = (int)((Math.random()) * 4 + 1);
		 int zufallfarbeintRechteck = zufallfarbeKreis;
		 if(zufallfarbeintRechteck == 1)
		 {
			 farbeKreis = "rot";
		 }
		 else if(zufallfarbeintRechteck == 2)
		 {
			 farbeKreis = "grün";
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
	 public static double getflächeKreis() {
		 return flächeKreis;
	 }
	 public static void writeflächeKreis() {
		 System.out.println(flächeKreis);
	 }
	// this method collects all methods to built a circle
	 public static void allesKreis() {
		 getfarbeKreis();
		 writefarbeKreis();
		 getflächeKreis();
		 writeflächeKreis();
		 writenameKreis();
	 }
}
