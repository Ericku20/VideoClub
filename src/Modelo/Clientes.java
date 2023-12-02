package Modelo;

/**
 *
 * @author Sofia_2
 */
public class Clientes {

    private String cedula;
    private String nombre;
    private String fechaNacimiento;
    private String telefono;
    private String correo;
    private String direccion;

    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getTelefono() {
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
