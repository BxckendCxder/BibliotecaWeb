package tests;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.UsuarioModel;

public class testUsuarioModel {

        public static void main(String[] args) {
                UsuarioModel usuarioDao = new UsuarioModel();
                try {
                        usuarioDao.buscarUsuario();
                } catch (SQLException ex) {
                        Logger.getLogger(testUsuarioModel.class.getName()).log(Level.SEVERE, null, ex);
                }
        }

}
