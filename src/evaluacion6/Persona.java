package evaluacion6;

public class Persona {

    private String usuario;
    private String contrasena;
    private String nombreCompleto;
    private String fechaNacimiento;

    public Persona() {
    }

    public Persona(String usuario, String contrasena, String nombreCompleto, String fechaNacimiento) {
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.nombreCompleto = nombreCompleto;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "usuario='" + usuario + '\'' +
                ", contrasena='" + contrasena + '\'' +
                ", nombreCompleto='" + nombreCompleto + '\'' +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                '}';
    }
}
