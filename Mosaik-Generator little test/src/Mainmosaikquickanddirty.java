import java.util.Scanner;

public class Mainmosaikquickanddirty {

	public static void main(String[] args) {
		String eingabe;
		System.out.println("Mosaik-Generator. Ihr Mosaik wird erstellt.");
		int completesize = 0;
		int c1 = 0, c2 = 0, c3 = 0, c4 = 0,  c5 = 0, c6 = 0, c7 = 0, c8 = 0, c9 = 0, c10 = 0, c11 = 0, c12 = 0, c13 = 0, c14 = 0, c15 = 0, c16 = 0;
		for(int i = 0; i < 10; i++)
		{
			String color = "wert";
			String look = "wert";
			int counter = 0;
			int randomColor = (int)((Math.random()) * 4 + 1);
			int randomLook = (int)((Math.random()) * 4 + 1);
			int randomSize = (int)((Math.random()) * 10 + 1);
			if(randomColor == 1) {
				 color = "green";
			} 
			else if(randomColor == 2 ){
				color = "blue";
			}
			else if(randomColor == 3) {
				color = "yellow";
			}
			else
				color = "red"; 
		
			if(randomLook == 1) {
				look = "Triangle";
			} 
			else if(randomLook == 2){
				look = "Rectangle";
			}
			else if(randomLook == 3) {
				look = "Circle";
			}
			else
				look = "Square";
			
			if(randomLook == 1 && randomColor == 1) {
				c1++;
				System.out.println(look + " " + color + " " + randomSize + " " + c1);	
			}
			else if(randomLook == 1 && randomColor == 2){
				c2++;
				System.out.println(look + " " + color + " " + randomSize + " " + c2);
			}
			else if(randomLook == 1 && randomColor == 3) {
				c3++;
					System.out.println(look + " " + color + " " + randomSize + " " + c3);
			}
			else if(randomLook == 1 && randomColor == 4) {
				c4++;
				System.out.println(look + " " + color + " " + randomSize + " " + c4);
			}
			else if(randomLook == 2 && randomColor == 1) {
				c5++;
					System.out.println(look + " " + color + " " + randomSize + " " + c5);
			}
			else if(randomLook == 2 && randomColor == 2) {
				c6++;
				System.out.println(look + " " + color + " " + randomSize + " " + c6);
			}
			else if(randomLook == 2 && randomColor == 3) {
				c7++;
					System.out.println(look + " " + color + " " + randomSize + " " + c7);
			}
			else if(randomLook == 2 && randomColor == 4) {
				c8++;
				System.out.println(look + " " + color + " " + randomSize + " " + c8);
			}
			else if(randomLook == 3 && randomColor == 1) {
				c9++;
					System.out.println(look + " " + color + " " + randomSize + " " + c9);
			}
			else if(randomLook == 3 && randomColor == 2) {
				c10++;
				System.out.println(look + " " + color + " " + randomSize + " " + c10);
			}
			else if(randomLook == 3 && randomColor == 3) {
				c11++;
					System.out.println(look + " " + color + " " + randomSize + " " + c11);
			}
			else if(randomLook == 3 && randomColor == 4) {
				c12++;
				System.out.println(look + " " + color + " " + randomSize + " " + c12);
			}
			else if(randomLook == 4 && randomColor == 1) {
				c13++;
					System.out.println(look + " " + color + " " + randomSize + " " + c13);
			}
			else if(randomLook == 4 && randomColor == 2) {
				c14++;
				System.out.println(look + " " + color + " " + randomSize + " " + c14);
			}
			else if(randomLook == 4 && randomColor == 3) {
				c15++;
					System.out.println(look + " " + color + " " + randomSize + " " + c15);
			}
			else if(randomLook == 4 && randomColor == 4) {
				c16++;
				System.out.println(look + " " + color + " " + randomSize + " " + c16);
			} 
			completesize += randomSize;
			
		}
		System.out.println("Seize: " + completesize);
		System.out.println("Möchtest du noch einen Stein hinzufügen? Dann Ja eingeben");
		Scanner scan = new Scanner(System.in);
		eingabe = scan.nextLine();
		
		if(eingabe != "Ja")
		{
			System.out.println("Okay");
			int completesize1 = 0;
			int c111 = 0, c21 = 0, c31 = 0, c41 = 0,  c51 = 0, c61 = 0, c71 = 0, c81 = 0, c91 = 0, c101 = 0, c1111 = 0, c121 = 0, c131 = 0, c141 = 0, c151 = 0, c161 = 0;
			for(int i = 0; i < 1; i++)
			{
				String color = "wert";
				String look = "wert";
				int counter = 0;
				int randomColor = (int)((Math.random()) * 4 + 1);
				int randomLook = (int)((Math.random()) * 4 + 1);
				int randomSize = (int)((Math.random()) * 10 + 1);
				if(randomColor == 1) {
					 color = "green";
				} 
				else if(randomColor == 2 ){
					color = "blue";
				}
				else if(randomColor == 3) {
					color = "yellow";
				}
				else
					color = "red"; 
			
				if(randomLook == 1) {
					look = "Triangle";
				} 
				else if(randomLook == 2){
					look = "Rectangle";
				}
				else if(randomLook == 3) {
					look = "Circle";
				}
				else
					look = "Square";
				
				if(randomLook == 1 && randomColor == 1) {
					c1111++;
					System.out.println(look + " " + color + " " + randomSize + " " + c1111);	
				}
				else if(randomLook == 1 && randomColor == 2){
					c21++;
					System.out.println(look + " " + color + " " + randomSize + " " + c21);
				}
				else if(randomLook == 1 && randomColor == 3) {
					c31++;
						System.out.println(look + " " + color + " " + randomSize + " " + c31);
				}
				else if(randomLook == 1 && randomColor == 4) {
					c41++;
					System.out.println(look + " " + color + " " + randomSize + " " + c41);
				}
				else if(randomLook == 2 && randomColor == 1) {
					c51++;
						System.out.println(look + " " + color + " " + randomSize + " " + c51);
				}
				else if(randomLook == 2 && randomColor == 2) {
					c61++;
					System.out.println(look + " " + color + " " + randomSize + " " + c61);
				}
				else if(randomLook == 2 && randomColor == 3) {
					c71++;
						System.out.println(look + " " + color + " " + randomSize + " " + c71);
				}
				else if(randomLook == 2 && randomColor == 4) {
					c81++;
					System.out.println(look + " " + color + " " + randomSize + " " + c81);
				}
				else if(randomLook == 3 && randomColor == 1) {
					c91++;
						System.out.println(look + " " + color + " " + randomSize + " " + c91);
				}
				else if(randomLook == 3 && randomColor == 2) {
					c101++;
					System.out.println(look + " " + color + " " + randomSize + " " + c101);
				}
				else if(randomLook == 3 && randomColor == 3) {
					c1111++;
						System.out.println(look + " " + color + " " + randomSize + " " + c1111);
				}
				else if(randomLook == 3 && randomColor == 4) {
					c121++;
					System.out.println(look + " " + color + " " + randomSize + " " + c121);
				}
				else if(randomLook == 4 && randomColor == 1) {
					c131++;
						System.out.println(look + " " + color + " " + randomSize + " " + c131);
				}
				else if(randomLook == 4 && randomColor == 2) {
					c141++;
					System.out.println(look + " " + color + " " + randomSize + " " + c141);
				}
				else if(randomLook == 4 && randomColor == 3) {
					c151++;
						System.out.println(look + " " + color + " " + randomSize + " " + c151);
				}
				else if(randomLook == 4 && randomColor == 4) {
					c161++;
					System.out.println(look + " " + color + " " + randomSize + " " + c161);
				} 
				completesize1 += randomSize;
				
			}
			int anothersize;
			anothersize = completesize + completesize1;
			System.out.println("Seize now:" + anothersize);
		}
	}
}


