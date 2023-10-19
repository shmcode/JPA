package visita;

import jakarta.persistence.*;

@Entity
@Table(name = "Receta")
@NamedQueries({
        @NamedQuery(name="Receta.all",query="select e from Receta e ")
})

public class Receta {

    @Id
    private Integer ID_Receta;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idDetalleReceta", referencedColumnName = "ID_Rec")
    private DetalleRecetas detalleRecetas;

    public Receta(){}

    public Receta(Integer ID_Receta, DetalleRecetas detalleRecetas) {
        this.ID_Receta = ID_Receta;
        this.detalleRecetas = detalleRecetas;
    }

    public Integer getID_Receta() {
        return ID_Receta;
    }

    public void setID_Receta(Integer ID_Receta) {
        this.ID_Receta = ID_Receta;
    }

    public DetalleRecetas getDetalleRecetas() {
        return detalleRecetas;
    }

    public void setDetalleRecetas(DetalleRecetas detalleRecetas) {
        this.detalleRecetas = detalleRecetas;
    }

}
