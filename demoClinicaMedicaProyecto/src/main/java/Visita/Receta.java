package Visita;

import Inventario.Medicamento;
import jakarta.persistence.*;

import java.util.List;
import java.util.Set;

@Entity
@Table(name = "Receta")
@NamedQueries({
        @NamedQuery(name="Receta.all",query="select e from Receta e ")
})

public class Receta {

    @Id
    private String ID_Receta;
//one to many
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idMedicamento", referencedColumnName = "ID_Medicamento")
    private Medicamento medicamento;
    private String dosis;

    private String comentarios;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="idVisita",referencedColumnName = "ID_Visita")
    private Visita visita;

    public Receta(){}

    public Receta(String ID_Receta, Medicamento medicamento, String dosis, String comentarios, Visita visita) {
        this.ID_Receta = ID_Receta;
        this.medicamento = medicamento;
        this.dosis = dosis;
        this.comentarios = comentarios;
        this.visita = visita;
    }
}
