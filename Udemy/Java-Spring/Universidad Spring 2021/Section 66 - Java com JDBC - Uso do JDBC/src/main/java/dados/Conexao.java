package domain;
import java.sql.*;

public class Conexao {
    private static final String JDBC_URL="jdbc:mysql:localhost/test?useSSL=falseserverTimeZone=UTC";
    private static final String JDBC_USER="root";
    private static final String JDBC_PASSWORD="Gotoheaven12@";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
    }

    public static void close(ResultSet rs) throws SQLException {
        rs.close();
    }
    public static void close(PreparedStatement stmt) throws SQLException {
        stmt.close();
    }
    public static void close(Connection con) throws SQLException {
        con.close();
    }

}
