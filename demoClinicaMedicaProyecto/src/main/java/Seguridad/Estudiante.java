package Seguridad;

import jakarta.persistence.*;

@Entity
@Table(name="Estudiante")
@NamedQueries({
        @NamedQuery(name="Estudiante.all",query="select e from Estudiante e ")
})

public class Estudiante extends Usuario{

    @Id
    private String ID_Estudiante;
    private String primerNombre;
    private String primerApellido;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="idCarrera",referencedColumnName = "ID_Carrera")
    private Carrera carrera;

    public Estudiante(String ID_Usuario, String primerNombre, String primerApellido, Carrera carrera) {
        super(ID_Usuario, primerNombre, primerApellido);
        this.carrera = carrera;
    }

    public Estudiante() {}

}
