package Visita;

import Seguridad.Carrera;
import Seguridad.Personal;
import jakarta.persistence.*;

@Entity
@Table(name = "Visita")
@NamedQueries({
        @NamedQuery(name="Visita.all",query="select e from Visita e ")
})

public class Visita {
    @Id
    private String ID_Visita;

    //como usar many to many
/*
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="idPersonal",referencedColumnName = "ID_Personal")
    private Personal personal;

    //como seria la relacion para visita - diagnostico - receta
   @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="idDiagnostico",referencedColumnName = "ID_Diagnostico")
    private Diagnostico diagnostico;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="idReceta",referencedColumnName = "ID_Receta")
    private Receta receta;*/

    public Visita() {}

    public Visita(String ID_Visita, Personal personal, Diagnostico diagnostico, Receta receta) {
        this.ID_Visita = ID_Visita;
       // this.personal = personal;
        //this.diagnostico = diagnostico;
        //this.receta = receta;
    }

}
