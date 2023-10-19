package visita;

import inventario.Medicamento;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "DetalleRecetas")

public class DetalleRecetas {
    @Id
    private String ID_Rec;

    @ManyToMany
    @JoinTable(name = "DetalleReceta_Medicamento",
            joinColumns = @JoinColumn(name = "ID_DetalleReceta"),
            inverseJoinColumns = @JoinColumn(name = "ID_Medicamento"))
    private List<Medicamento> listaMedicamento;

    private Integer CantidadDispensada;

    public DetalleRecetas(){}

    public DetalleRecetas(String ID_Rec, List<Medicamento> listaMedicamento, Integer cantidadDispensada) {
        this.ID_Rec = ID_Rec;
        this.listaMedicamento = listaMedicamento;
        CantidadDispensada = cantidadDispensada;
    }

    public String getID_Rec() {
        return ID_Rec;
    }

    public void setID_Rec(String ID_Rec) {
        this.ID_Rec = ID_Rec;
    }

    public List<Medicamento> getListaMedicamento() {
        return listaMedicamento;
    }

    public void setListaMedicamento(List<Medicamento> listaMedicamento) {
        this.listaMedicamento = listaMedicamento;
    }

    public Integer getCantidadDispensada() {
        return CantidadDispensada;
    }

    public void setCantidadDispensada(Integer cantidadDispensada) {
        CantidadDispensada = cantidadDispensada;
    }
}
