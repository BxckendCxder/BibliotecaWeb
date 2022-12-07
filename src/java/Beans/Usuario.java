package Beans;

public class Usuario {
        private int id;
        private String usuario;
        private String password;
        private String rol;
        private String nombre;
        private String apellido;

        public Usuario() {
        }

        public Usuario(int id, String usuario, String password, String rol, String nombre, String apellido) {
                this.id = id;
                this.usuario = usuario;
                this.password = password;
                this.rol = rol;
                this.nombre = nombre;
                this.apellido = apellido;
        }

        public Usuario(String usuario, String password, String rol, String nombre, String apellido) {
                this.usuario = usuario;
                this.password = password;
                this.rol = rol;
                this.nombre = nombre;
                this.apellido = apellido;
        }

        public Usuario(int id) {
                this.id = id;
        }

        public int getId() {
                return id;
        }

        public void setId(int id) {
                this.id = id;
        }

        public String getUsuario() {
                return usuario;
        }

        public void setUsuario(String usuario) {
                this.usuario = usuario;
        }

        public String getPassword() {
                return password;
        }

        public void setPassword(String password) {
                this.password = password;
        }

        public String getRol() {
                return rol;
        }

        public void setRol(String rol) {
                this.rol = rol;
        }

        public String getNombre() {
                return nombre;
        }

        public void setNombre(String nombre) {
                this.nombre = nombre;
        }

        public String getApellido() {
                return apellido;
        }

        public void setApellido(String apellido) {
                this.apellido = apellido;
        }
        
        
}
