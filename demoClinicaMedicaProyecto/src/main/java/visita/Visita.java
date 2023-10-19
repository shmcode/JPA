package visita;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "Visita")
@NamedQueries({
        @NamedQuery(name="Visita.all",query="select e from Visita e ")
})

public class Visita {
    @Id
    private String ID_Visita;
    private Date HoraEntrada;
    private Date HoraSalida;
    private Date FechaVisita;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_Receta", referencedColumnName = "ID_Receta")
    private Receta receta;

    public Visita() {}

    public Visita(String ID_Visita, Date horaEntrada, Date horaSalida, Date fechaVisita, Receta receta) {
        this.ID_Visita = ID_Visita;
        HoraEntrada = horaEntrada;
        HoraSalida = horaSalida;
        FechaVisita = fechaVisita;
        this.receta = receta;
    }

    public String getID_Visita() {
        return ID_Visita;
    }

    public void setID_Visita(String ID_Visita) {
        this.ID_Visita = ID_Visita;
    }

    public Date getHoraEntrada() {
        return HoraEntrada;
    }

    public void setHoraEntrada(Date horaEntrada) {
        HoraEntrada = horaEntrada;
    }

    public Date getHoraSalida() {
        return HoraSalida;
    }

    public void setHoraSalida(Date horaSalida) {
        HoraSalida = horaSalida;
    }

    public Date getFechaVisita() {
        return FechaVisita;
    }

    public void setFechaVisita(Date fechaVisita) {
        FechaVisita = fechaVisita;
    }

    public Receta getReceta() {
        return receta;
    }

    public void setReceta(Receta receta) {
        this.receta = receta;
    }
}
