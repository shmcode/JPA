package proveedor;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;

@Entity
@Table(name = "DetalleProveedor")

public class DetalleProveedor {
    @Id
    private Integer ID_DetalleProveedor;
    private String Nombre;
    private String Organizacion;
    private String Telefono;

    public DetalleProveedor(){}

    public DetalleProveedor(Integer ID_DetalleProveedor, String nombre, String organizacion, String telefono) {
        this.ID_DetalleProveedor = ID_DetalleProveedor;
        Nombre = nombre;
        Organizacion = organizacion;
        Telefono = telefono;
    }

    public Integer getID_DetalleProveedor() {
        return ID_DetalleProveedor;
    }

    public void setID_DetalleProveedor(Integer ID_DetalleProveedor) {
        this.ID_DetalleProveedor = ID_DetalleProveedor;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getOrganizacion() {
        return Organizacion;
    }

    public void setOrganizacion(String organizacion) {
        Organizacion = organizacion;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }
}
