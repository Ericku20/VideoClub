package Modelo;

/**
 *
 * @author uno y Sofia
 */
public class Clientes implements ControldeEntidad {

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

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Clientes(String cedula, String nombre, String fechaNacimiento, String telefono, String correo, String direccion) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
        this.correo = correo;
        this.direccion = direccion;
    }

    public Object[] mostrarEnTabla() {
        Object[] data = {
            cedula, nombre, telefono, correo, direccion, fechaNacimiento
        };
        return data;
    }

    @Override
    public String toString() {
        return "Cedula: " + cedula + " Nombre: " + nombre + " Fecha de Nacimiento: " + fechaNacimiento + " Telefono: " + telefono
                + " Correo: " + correo + " Direccion: " + direccion;
    }

    @Override
    public boolean isComplete() {
        return !this.cedula.equals("") && !this.nombre.equals("") && !this.correo.equals("");
    }

    @Override
    public Object[] toArrayObject() {
        return new Object[]{this.cedula, this.nombre, this.telefono, this.correo};
    }

}
