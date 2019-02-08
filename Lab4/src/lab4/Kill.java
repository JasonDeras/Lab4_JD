package lab4;

import java.util.Date;

public class Kill {
    private String descripcion, nombreVictima, culpable, sentencia, pais;
    private Date fecha;
    private int nDelito;

    public Kill() {
    }

    public Kill(String descripcion, String nombreVictima, String culpable, String sentencia, String pais, Date fecha, int nDelito) {
        this.descripcion = descripcion;
        this.nombreVictima = nombreVictima;
        this.culpable = culpable;
        this.sentencia = sentencia;
        this.pais = pais;
        this.fecha = fecha;
        this.nDelito = nDelito;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombreVictima() {
        return nombreVictima;
    }

    public void setNombreVictima(String nombreVictima) {
        this.nombreVictima = nombreVictima;
    }

    public String getCulpable() {
        return culpable;
    }

    public void setCulpable(String culpable) {
        this.culpable = culpable;
    }

    public String getSentencia() {
        return sentencia;
    }

    public void setSentencia(String sentencia) {
        this.sentencia = sentencia;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getnDelito() {
        return nDelito;
    }

    public void setnDelito(int nDelito) {
        this.nDelito = nDelito;
    }

    @Override
    public String toString() {
        return "Kill{" + "descripcion=" + descripcion + ", nombreVictima=" + nombreVictima + ", culpable=" + culpable + ", sentencia=" + sentencia + ", pais=" + pais + ", fecha=" + fecha + ", nDelito=" + nDelito + '}';
    }
    
}
