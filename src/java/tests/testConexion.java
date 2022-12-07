package tests;

import model.ConexionSQL;

public class testConexion {
        public static void main(String[] args) {
                try {
                        System.out.println(ConexionSQL.getConnection());
                } catch (Exception e) {
                        e.printStackTrace();
                }
        }
}
