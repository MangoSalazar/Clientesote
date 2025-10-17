
public class Sesiones {
    String nombre;
    String contraseña;

    public String Sesiones(String nombre, String contraseña) {
        if (numCaracteres(nombre , contraseña )) {
            this.nombre = nombre;
            this.contraseña = contraseña;
            return "Usuario registrado";
        }
        return "El nombre o la contraseña estan incorrectos";
    }
    
    public boolean numCaracteres (String nombre, String contraseña){
        if (nombre.length() < 15 && nombre.length() > 3  && contraseña.length() < 10 && contraseña.length() > 3 ) {
            return true;
        }
        return false;
    }

}
