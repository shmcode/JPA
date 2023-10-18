package Inventario;

import jakarta.persistence.*;

@Entity
@Table(name="Inventario")
@NamedQueries({
        @NamedQuery(name="Inventario.all",query="select e from Inventario e ")
})

public class Inventario {
    @Id
    private String ID_Inventario;
    //cual seria su PK?

    //one to many

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="idMedicamento",referencedColumnName = "ID_Medicamento")
    private Medicamento medicamento;


}
