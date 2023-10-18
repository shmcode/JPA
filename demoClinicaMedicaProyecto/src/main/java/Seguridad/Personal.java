package Seguridad;

import jakarta.persistence.*;

@Entity
@Table(name="Personal")
@NamedQueries({
        @NamedQuery(name="Personal.all",query="select e from Personal e ")
})

public class Personal extends Usuario{

    @Id
    private String ID_Personal;
    private String primerNombre;
    private String primerApellido;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="idRol"
            ,referencedColumnName = "ID_Rol")
    private Rol rol;

    public Personal() {}

    public Personal(String ID_Usuario, String primerNombre, String primerApellido, Rol rol) {
        super(ID_Usuario, primerNombre, primerApellido);
        this.rol = rol;
    }


}
