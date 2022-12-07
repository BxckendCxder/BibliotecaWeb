<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
        <head>
                <!-- <link rel="shortcut icon" href="Logo2.png"> -->
                <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
                <title>BibliotecaWeb</title>
                <!--Llamo a la configuración CSS para la pagina-->
                <link href="CSS/Style.css" rel="stylesheet" type="text/css"/>
        </head>

        <body>
                <div id ="contenedor1">
                        <form id="form1" action="${pageContext.request.contextPath}/IniciarSesion" method="post">
                                <img src="imagenes/Usuario.png" alt="" height="35"/>
                                <input type="text" name="usuario" placeholder="Usuario"/>
                                <hr>
                                <img src="imagenes/Password.png" alt="" height="35"/>
                                <input type="password" name="password" placeholder="Contraseña"/>
                                <hr>
                                <p id="mensajeLogin" style="color: red"> ${mensajeLogin} </p>
                                <input type="submit" value="Ingresar" />
                                <hr>
                        </form>
                </div>

                <div id ="contenedor2">
                        <form id="form2" action="${pageContext.request.contextPath}/Register" method="post">
                                <input type="submit" value="Registrarse" />
                        </form>

                        <div id ="referencias">
                                <a href = "/Invitado"> Acceder como Invitado</a>
                        </div>
                </div>
        </body>
</html>
