package model;

import Beans.Usuario;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UsuarioModel extends ConexionSQL {

        private static final String SP_PROCEDURE = "CALL checkLogin('daniel','pineda')";

        public void buscarUsuario() throws SQLException {
                ConexionSQL.getConnection();
                cs = conexion.prepareCall(SP_PROCEDURE);
                rs = cs.executeQuery();
                System.out.println("antes");
                System.out.println(rs);
        }
}
