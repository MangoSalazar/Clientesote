
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
    

}
