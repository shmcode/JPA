package seguridad;

import jakarta.persistence.*;

@Entity
@Table(name="Visitante")
@NamedQueries({
        @NamedQuery(name="Visitante.all",query="select e from Visitante e ")
})

public class Visitante {

    @Id
    private String ID_Visitante;
    private String Primer_Nombre;
    private String Primer_Apellido;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="idCarrera",referencedColumnName = "ID_Carrera")
    private Carrera carrera;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idRol", referencedColumnName = "ID_Rol")
    private Rol rol;

    public Visitante() {}

    public Visitante(String ID_Visitante, String primer_Nombre, String primer_Apellido, Carrera carrera, Rol rol) {
        this.ID_Visitante = ID_Visitante;
        Primer_Nombre = primer_Nombre;
        Primer_Apellido = primer_Apellido;
        this.carrera = carrera;
        this.rol = rol;
    }
}
