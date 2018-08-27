
public class Quadrat {
 private static String nameQuadrat = "Quadrat";
 private static String farbeQuadrat;
 
 public static double längeQuadrat;
 public static double breiteQuadrat;
 public static double flächeQuadrat;
 public static int zufallfarbeQuadrat;
 
 public static void randomQuadrat()
 {
	// random area and color is being generated
	 längeQuadrat = (double)((Math.random()) * 10 + 1);
	 breiteQuadrat = (double)((Math.random()) * 10 + 1);
	 
	 flächeQuadrat = längeQuadrat * breiteQuadrat;
	 
	 zufallfarbeQuadrat = (int)((Math.random()) * 4 + 1);
	 int zufallfarbeintQuadrat = zufallfarbeQuadrat;
	 if(zufallfarbeintQuadrat == 1)
	 {
		 farbeQuadrat = "rot";
	 }
	 else if(zufallfarbeintQuadrat == 2)
	 {
		 farbeQuadrat = "grün";
	 }
	 else if(zufallfarbeintQuadrat == 3)
	 {
		 farbeQuadrat = "blau";
	 }
	 else
	 {
		 farbeQuadrat = "gelb";
	 }
	// get and ouput methods
 }
 public static void writenameQuadrat() {
	 System.out.println(nameQuadrat);
 }
 public static String getfarbeQuadrat() {
	 return farbeQuadrat;
 }
 public static void writefarbeQuadrat() {
	 System.out.println(farbeQuadrat);
 }
 public static double getflächeQuadrat() {
	 return flächeQuadrat;
 }
 public static void writeflächeQuadrat() {
	 System.out.println(flächeQuadrat);
 }
//this method collects all methods to built a square
 public static void allesQuadrat() {
	 getfarbeQuadrat();
	 writefarbeQuadrat();
	 getflächeQuadrat();
	 writeflächeQuadrat();
	 writenameQuadrat();
 }
}
