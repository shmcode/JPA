package inventario;

import jakarta.persistence.*;

@Entity
@Table(name="DetalleInventario")
@NamedQueries({
        @NamedQuery(name="Detalle.all",query="select e from DetalleInventario e ")
})

public class DetalleInventario {
    @Id
    private String ID_DetalleInventario;
    private Integer existencia;
    private Integer numCompra;
    private Integer minimoExistencia;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="idMedicamento",referencedColumnName = "ID_Medicamento")
    private Medicamento medicamento;

    public DetalleInventario() {
    }

    public DetalleInventario(String ID_DetalleInventario, Integer existencia, Integer numCompra, Integer minimoExistencia, Medicamento medicamento) {
        this.ID_DetalleInventario = ID_DetalleInventario;
        this.existencia = existencia;
        this.numCompra = numCompra;
        this.minimoExistencia = minimoExistencia;
        this.medicamento = medicamento;
    }

    public String getID_DetalleInventario() {
        return ID_DetalleInventario;
    }

    public void setID_DetalleInventario(String ID_DetalleInventario) {
        this.ID_DetalleInventario = ID_DetalleInventario;
    }

    public Integer getExistencia() {
        return existencia;
    }

    public void setExistencia(Integer existencia) {
        this.existencia = existencia;
    }

    public Integer getNumCompra() {
        return numCompra;
    }

    public void setNumCompra(Integer numCompra) {
        this.numCompra = numCompra;
    }

    public Integer getMinimoExistencia() {
        return minimoExistencia;
    }

    public void setMinimoExistencia(Integer minimoExistencia) {
        this.minimoExistencia = minimoExistencia;
    }

    public Medicamento getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(Medicamento medicamento) {
        this.medicamento = medicamento;
    }
}
