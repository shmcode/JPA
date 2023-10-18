package Inventario;

import Visita.Receta;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="Medicamento")
@NamedQueries({
        @NamedQuery(name="Medicamento.all",query="select e from Medicamento e ")
})

public class Medicamento {
    @Id
    private String ID_Medicamento;
    private String nombreGenerico;
    private String nombreComercial;
    private String indicaciones;
    private Date lote;
    private Date vencimiento;

    //se debe agregar tanto para medicamento como para detalle o solo uno
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="idDetalleInventario",referencedColumnName = "ID_DetalleInventario")
    private DetalleInventario detalleInventario;

    //(fetch = FetchType.LAZY)
    @ManyToOne
    @JoinColumn(name = "idReceta", referencedColumnName = "ID_Receta")
    private Receta receta;

    public Medicamento(){}

    public Medicamento(String ID_Medicamento, String nombreGenerico, String nombreComercial, String indicaciones, Date lote, Date vencimiento, DetalleInventario detalleInventario, Receta receta) {
        this.ID_Medicamento = ID_Medicamento;
        this.nombreGenerico = nombreGenerico;
        this.nombreComercial = nombreComercial;
        this.indicaciones = indicaciones;
        this.lote = lote;
        this.vencimiento = vencimiento;
        this.detalleInventario = detalleInventario;
        this.receta = receta;
    }
}
