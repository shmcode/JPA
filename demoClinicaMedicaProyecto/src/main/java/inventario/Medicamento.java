package inventario;

import visita.DetalleRecetas;
import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

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
    private String Indicaciones;
    private String Presentacion;
    private Date Lote;
    private Date Vencimiento;


    //se debe agregar tanto para medicamento como para detalle o solo uno
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idDetalleInventario",
            referencedColumnName = "ID_DetalleInventario")
    private DetalleInventario detalleInventario;

    //(fetch = FetchType.LAZY)
    @ManyToMany(mappedBy = "listaMedicamento")
    private List<DetalleRecetas> listaReceta;

    public Medicamento() {
    }

    public Medicamento(String ID_Medicamento, String nombreGenerico, String nombreComercial, String indicaciones, String presentacion, Date lote, Date vencimiento, DetalleInventario detalleInventario, List<DetalleRecetas> listaReceta) {
        this.ID_Medicamento = ID_Medicamento;
        this.nombreGenerico = nombreGenerico;
        this.nombreComercial = nombreComercial;
        Indicaciones = indicaciones;
        Presentacion = presentacion;
        Lote = lote;
        Vencimiento = vencimiento;
        this.detalleInventario = detalleInventario;
        this.listaReceta = listaReceta;
    }

    public String getID_Medicamento() {
        return ID_Medicamento;
    }

    public void setID_Medicamento(String ID_Medicamento) {
        this.ID_Medicamento = ID_Medicamento;
    }

    public String getNombreGenerico() {
        return nombreGenerico;
    }

    public void setNombreGenerico(String nombreGenerico) {
        this.nombreGenerico = nombreGenerico;
    }

    public String getNombreComercial() {
        return nombreComercial;
    }

    public void setNombreComercial(String nombreComercial) {
        this.nombreComercial = nombreComercial;
    }

    public String getIndicaciones() {
        return Indicaciones;
    }

    public void setIndicaciones(String indicaciones) {
        Indicaciones = indicaciones;
    }

    public String getPresentacion() {
        return Presentacion;
    }

    public void setPresentacion(String presentacion) {
        Presentacion = presentacion;
    }

    public Date getLote() {
        return Lote;
    }

    public void setLote(Date lote) {
        Lote = lote;
    }

    public Date getVencimiento() {
        return Vencimiento;
    }

    public void setVencimiento(Date vencimiento) {
        Vencimiento = vencimiento;
    }

    public DetalleInventario getDetalleInventario() {
        return detalleInventario;
    }

    public void setDetalleInventario(DetalleInventario detalleInventario) {
        this.detalleInventario = detalleInventario;
    }

    public List<DetalleRecetas> getListaReceta() {
        return listaReceta;
    }

    public void setListaReceta(List<DetalleRecetas> listaReceta) {
        this.listaReceta = listaReceta;
    }
}
