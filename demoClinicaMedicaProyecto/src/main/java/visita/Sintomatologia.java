package visita;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Sintomatologia")

public class Sintomatologia {

    @Id
    private String ID_Sintoma;
    private String NombreSintoma;

}
