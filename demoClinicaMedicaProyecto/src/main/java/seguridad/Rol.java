package seguridad;


import jakarta.persistence.*;

@Entity
@Table(name="Rol")

public class Rol {
    @Id
    private Integer ID_Rol;
    private String nombreRol;

    public Rol() {}

    public Rol(Integer ID_Rol, String nombreRol) {
        this.ID_Rol = ID_Rol;
        this.nombreRol = nombreRol;
    }

    @Override
    public String toString() {
        return "Rol{" +
                "ID_Rol=" + ID_Rol +
                ", nombreRol='" + nombreRol + '\'' +
                '}';
    }
}
