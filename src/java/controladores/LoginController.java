package controladores;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import util.Validaciones;

@WebServlet("/IniciarSesion")
public class LoginController extends HttpServlet {

        @Override
        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                String usuario = request.getParameter("usuario");
                String password = request.getParameter("password");

                if (Validaciones.isEmpty(usuario) || Validaciones.isEmpty(password)) {
                        request.setAttribute("mensajeLogin", "Los campos no pueden estar vacios");
                        request.getRequestDispatcher("Login.jsp").forward(request, response);
                } else if (!Validaciones.isEmpty(usuario) && !Validaciones.isEmpty(password)) {
                        request.getRequestDispatcher("Login.jsp").forward(request, response);
                }

//                request.setAttribute("mensajeLogin", "Usuario o Contraseña incorrecta");
//                request.getRequestDispatcher("Login.jsp").forward(request, response);
        }
}
