package seguridad;

import jakarta.persistence.*;

@Entity
@Table(name="Carrera")

public class Carrera {
    @Id
    private Integer ID_Carrera;
    private String nombreCarrera;

    public Carrera(){}

    public Carrera(Integer ID_Carrera, String nombreCarrera) {
        this.ID_Carrera = ID_Carrera;
        this.nombreCarrera = nombreCarrera;
    }

    @Override
    public String toString() {
        return "Carrera{" +
                "ID_Carrera=" + ID_Carrera +
                ", nombreCarrera='" + nombreCarrera + '\'' +
                '}';
    }
}
