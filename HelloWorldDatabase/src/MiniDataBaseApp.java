import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
 
/**
 * Das Programm erstellt eine Verbindung zu einer MySQL Datenbank her und lie�t
 * die Daten von einer Tabelle aus. Dies kann beliebig erweitert werden. Hierzu
 * muss eine Bibliothek f�r MySQL importiert werden und benutzt werden.
 * 
 * @author ST-Page.de
 * 
 */
public class MiniDataBaseApp {
 
    private String db_host = "localhost";
    private String db_port = "3306";
    private String db_user = "root";
    private String db_pass = "";
    private String db_base = "phpmyadmin";
 
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private Connection connection = null;
 
    /**
     * Eine Verbindung zur Datenbank wird hergestellt und von einer Tabelle
     * werden alle Eintr�ge ausgelesen.
     * 
     * @throws SQLException
     *             Wenn keine Verbindung zu einer Datenbank hergestellt werden
     *             konnte.
     * @throws ClassNotFoundException
     *             Wenn der Datenbanktreiber nicht gefunden werden konnte.
     */
    public void createConnection() throws SQLException, ClassNotFoundException {
        // Treiber initialisieren
        Class.forName(DRIVER);
        // Uri f�r die Verbindung zu der Datenbank
        String mySqlUrl = "jdbc:mysql://" + db_host + ":" + db_port + "/"
                + db_base;
        // Verbindung herstellen.
        connection = DriverManager.getConnection(mySqlUrl, db_user, db_pass);
    }
 
    /**
     * Alle Eintr�ge der Datenbanktabelle, werden in der Konsole gedruckt. Statt
     * {@link Statement} kann man auch {@link PreparedStatement} nutzen, welche
     * schneller eine Abfrage durchf�hren m�ssten. Die Abfragezeit betr�gt ca. 2
     * Sekunden.
     * 
     * @param nameOfTable
     *            Name der Tabelle, welche ausgelesen werden.
     * @throws SQLException
     *             Wenn die Abfrage an der Datenbank nicht gemacht werden
     *             konnte.
     */
    public void showAll(String nameOfTable) throws SQLException {
        // Statement mit Benennung der Tablle
        String query = "SELECT * FROM " + nameOfTable;
        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery(query);
        int columns = rs.getMetaData().getColumnCount();
        System.out.println("Alle Eintr�ge zu den Personen ");
        System.out.println();
        // Ich zeige die Tabellenspaltennamen an.
        for (int i = 1; i <= columns; i++)
            System.out.print(rs.getMetaData().getColumnLabel(i) + "\t\t");
        System.out.println();
        System.out.println();
        // Ich zeige den Inhalt der Tabelle an. Normaler Weise w�rde man die
        // Ergebnisse in eine Liste schreiben und diese zur�ck liefern.
        while (rs.next()) {
            for (int i = 1; i <= columns; i++) {
                System.out.print(rs.getString(i) + "\t\t");
            }
            System.out.println();
        }
        // Ich schlie�e die Streams wieder und gebe die Tabelle wieder frei.
        rs.close();
        stmt.close();
    }
 
    /**
     * Ich schlie�e die Verbindung zu der Datenbank und gebe den Port am
     * Computer frei.
     * 
     * @throws SQLException
     *             Wenn die Verbindung nicht geschlossen werden konnte.
     */
    public void closeProgramm() throws SQLException {
        this.connection.close();
    }
 
    /**
     * Hier startet das Programm und ruft die einzelnen notwendigen Methoden
     * auf, die Methoden zum Bearbeiten der Datenbank k�nnen dazwischen stehen.
     * 
     * @param args
     *            Damit k�nnte man das Programms sp�ter noch steuern und mit
     *            INSERT, DELETE, UPDATE arbeite.
     */
    public static void main(String[] args) {
        MiniDataBaseApp app = new MiniDataBaseApp();
        try {
            // Verbindung herstellen
            app.createConnection();
            // Ergebnisse anzeigen.
            app.showAll("pma_history");
            // Verbindung schlie�en
            app.closeProgramm();
        } catch (SQLException e) {
            System.err.println("SQL Fehler - " + e.getLocalizedMessage());
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.err.println("Der Datenbank treiber wurde nicht gefunden. - "
                    + e.getLocalizedMessage());
            e.printStackTrace();
        }
        // Programm beenden.
        System.exit(0);
    }
}
