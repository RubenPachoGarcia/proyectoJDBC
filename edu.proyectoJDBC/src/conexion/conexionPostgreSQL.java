package conexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexionPostgreSQL {

    // Configuración de conexión
    private final String url = "jdbc:postgresql://localhost:1045/postgres"; // Cambia por el nombre de tu base de datos
    private final String user = "postgres";  // Cambia por tu usuario de PostgreSQL
    private final String password = "sevillista04"; // Cambia por tu contraseña de PostgreSQL

    public Connection conectar() {
        Connection conexion = null;
        try {
            // Cargar el driver JDBC de PostgreSQL
            Class.forName("org.postgresql.Driver");
            // Intentar la conexión
            conexion = DriverManager.getConnection(url, user, password);
            System.out.println("Conexión exitosa a PostgreSQL!");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Driver no encontrado: " + e.getMessage());
        }
        return conexion;
    }

    public static void main(String[] args) {
    	conexionPostgreSQL conexionPostgreSQL = new conexionPostgreSQL();
        conexionPostgreSQL.conectar();
    }
}
