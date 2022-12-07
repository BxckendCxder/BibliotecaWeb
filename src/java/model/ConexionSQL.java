package model;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class ConexionSQL {

        static private final String SQL_URL = "jdbc:mysql://localhost:3306/biblioteca?useSSL=false";
        static private final String SQL_USER = "root";
        static private final String SQL_PASS = "admin";
        protected static Connection conexion = null;
        protected PreparedStatement st;
        protected CallableStatement cs;
        protected ResultSet rs;

        public static Connection getConnection() throws SQLException {
                return DriverManager.getConnection(SQL_URL, SQL_USER, SQL_PASS);
        }

        public static void close(ResultSet rs) throws SQLException {
                rs.close();
        }

        public static void close(PreparedStatement stmt) throws SQLException {
                stmt.close();
        }

        public static void close(Connection conn) throws SQLException {
                conn.close();
        }
}
