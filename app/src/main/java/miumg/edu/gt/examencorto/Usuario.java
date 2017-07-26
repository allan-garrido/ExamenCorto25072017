package miumg.edu.gt.examencorto;

/**
 * Created by alumno on 25/07/2017.
 */

public class Usuario {
    private String nombre, apellidos, contrasena;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public Usuario(String nombre, String apellidos, String contrasena) {

        this.nombre = nombre;
        this.apellidos = apellidos;
        this.contrasena = contrasena;
    }

    public Usuario() {

    }
}
