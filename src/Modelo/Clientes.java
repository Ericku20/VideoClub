package Modelo;

/**
 *
 * @author Sofia_2
 */
public class Clientes {

    private int cedula;
    private String nombre;
    private String fechaNacimiento;
    private int telefono;
    private String correo;
    private String direccion;

    public int getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public int getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public String getDireccion() {
        return direccion;
    }

    @Override
    public String toString() {
        return "Cedula: " + cedula + " Nombre: " + nombre + " Fecha de Nacimiento: " + fechaNacimiento + " Telefono: " + telefono + " Correo: " + correo + " Direccion: " + direccion;
    }

}
