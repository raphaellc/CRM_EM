package daos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    private static final String URL = "jdbc:mysql://localhost:3306/?user=root";
    private static final String USUARIO = "root";
    private static final String SENHA = "Un1$1n0$";

    public static Connection conectar() {
        Connection connection = null;

        try {
            connection = DriverManager.getConnection(URL, USUARIO, SENHA);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return connection;
    }
}
