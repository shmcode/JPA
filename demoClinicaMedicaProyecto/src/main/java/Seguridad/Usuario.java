package Seguridad;

public class Usuario {

    private String id;
    private String primerNombre;
    private String primerApellido;

    public Usuario() {}

    public Usuario(String ID_Usuario, String primerNombre, String primerApellido) {
        this.id = ID_Usuario;
        this.primerNombre = primerNombre;
        this.primerApellido = primerApellido;
    }

    public String getId() {
        return id;
    }

    public void setId(String ID_Usuario) {
        this.id = ID_Usuario;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) throws Exception {
        if (primerNombre.length() == 0 ) {
            throw new Exception("not allowed the firstName to be empty");
        }
        this.primerNombre = primerNombre;    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "ID_Usuario='" + id + '\'' +
                ", primerNombre='" + primerNombre + '\'' +
                ", primerApellido='" + primerApellido + '\'' +
                '}';
    }
}
