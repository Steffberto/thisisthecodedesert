
public class Mensch extends Lebewesen{
	int alter;
	int iq = 0;
	String name;
	String haarfarbe;
	private static int anzahlMenschen = 0;
	
	static int getAnzahlMenschen() {
		return anzahlMenschen;
	}
	void bildung() {
		iq += 5;
	}
	void bildung(int wieviel) {
		iq += wieviel;
	}
	Mensch (int alter, int iq, String name, String haarfarbe) {
		this.alter = alter;
		this.iq = iq;
		this.name = name;
		this.haarfarbe = haarfarbe;
		anzahlMenschen++;
	}
	Mensch() {}
	
	void setAlter(int alter) {
		this.alter = alter;
	}
	int getAlter() {
		return alter;
	}
}
