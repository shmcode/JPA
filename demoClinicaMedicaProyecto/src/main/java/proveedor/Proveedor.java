package proveedor;

import jakarta.persistence.*;

@Entity
@Table(name = "Proveedor")
@NamedQueries({
        @NamedQuery(name="Proveedor.all",query="select e from Proveedor e ")
})

public class Proveedor {

    @Id
    private Integer ID_Proveedor;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idDetalleProveedor", referencedColumnName = "ID_DetalleProveedor")
    private DetalleProveedor detalleProveedor;


}
