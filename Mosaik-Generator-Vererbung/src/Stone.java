
public class Stone {
	private String name;
	private String color;
	private double area;
	private double length;
	double stonelength;
	
	public Stone(String stonename, String stonecolor) {
		name = stonename;
		color = stonecolor;
	}
	public String setName(String stonename) {
		name = stonename;
		return stonename;
	}
	public String setColor(String stonecolor) {
		color = stonecolor;
		return stonecolor;
	}
	public void setArea(double stonearea) {
		area = stonearea;
		
		
	}
	public void setLength(double stonelength){
		length = stonelength;
	}
	public void print() {
		System.out.println(name);
		System.out.println(color);
		System.out.println(area);
		System.out.println(length);
	}
	public double randomStone()
	 {
		 stonelength = (double)((Math.random()) * 10 + 1);
		 return stonelength;
		 /*dreieckhöhe = (double)((Math.random()) * 10 + 1);
		 
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
		 */
	 }
}
