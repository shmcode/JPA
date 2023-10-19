package seguridad;

import jakarta.persistence.*;

@Entity
@Table(name="Usuario")
@NamedQueries({
        @NamedQuery(name="Usuario.all",query="select e from Usuario e ")
})
public class Usuario {
    @Id
   // @GeneratedValue(strategy = GenerationType.AUTO)
    private String ID_User;
    private String Primer_NombreP;
    private String Primer_ApellidoP;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_Rol", referencedColumnName = "ID_Rol")
    private Rol ID_Rol;

    private Character Estado;

    public Usuario() {}

    public Usuario(String ID_User, String primer_NombreP, String primer_ApellidoP, Rol ID_Rol, Character estado) {
        this.ID_User = ID_User;
        Primer_NombreP = primer_NombreP;
        Primer_ApellidoP = primer_ApellidoP;
        this.ID_Rol = ID_Rol;
        Estado = estado;
    }

    public String getID_User() {
        return ID_User;
    }

    public void setID_User(String ID_Usuario) {
        this.ID_User = ID_Usuario;
    }

    public String getPrimer_NombreP() {
        return Primer_NombreP;
    }

    public void setPrimer_NombreP(String primer_NombreP) throws Exception {
        if (primer_NombreP.length() == 0 ) {
            throw new Exception("not allowed the firstName to be empty");
        }
        this.Primer_NombreP = primer_NombreP;    }

    public String getPrimer_ApellidoP() {
        return Primer_ApellidoP;
    }

    public void setPrimer_ApellidoP(String primer_ApellidoP) {
        Primer_ApellidoP = primer_ApellidoP;
    }

    public Rol getID_Rol() {
        return ID_Rol;
    }

    public void setID_Rol(Rol ID_Rol) {
        this.ID_Rol = ID_Rol;
    }

    public Character getEstado() {
        return Estado;
    }

    public void setEstado(Character estado) {
        Estado = estado;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "ID_User='" + ID_User + '\'' +
                ", Primer_NombreP='" + Primer_NombreP + '\'' +
                ", Primer_ApellidoP='" + Primer_ApellidoP + '\'' +
                ", ID_Rol=" + ID_Rol +
                ", Estado=" + Estado +
                '}';
    }
}
