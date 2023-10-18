package Visita;

import Seguridad.Personal;
import jakarta.persistence.*;

@Entity
@Table(name = "Diagnostico")
@NamedQueries({
        @NamedQuery(name="Diagnostico.all",query="select e from Diagnostico e ")
})

public class Diagnostico {

    @Id
    private String ID_Diagnostico;

    //se hara una clase aparte para la sinotmatologia? con id y nombre
    private String sintomatologia;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="idVisita",referencedColumnName = "ID_Visita")
    private Personal personal;

    public Diagnostico() {}

    public Diagnostico(String ID_Diagnostico, String sintomatologia, Personal personal) {
        this.ID_Diagnostico = ID_Diagnostico;
        this.sintomatologia = sintomatologia;
        this.personal = personal;
    }
}
