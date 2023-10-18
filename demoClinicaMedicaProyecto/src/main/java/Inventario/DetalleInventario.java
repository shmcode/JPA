package Inventario;

import Seguridad.Carrera;
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
}
