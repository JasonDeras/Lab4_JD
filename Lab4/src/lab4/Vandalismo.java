package lab4;

import java.util.Date;

public class Vandalismo extends Delito_Menor {

    private String edificacion;
    private int n_pisos;
    private String nombreD;

    public Vandalismo() {
        super();
    }

    public Vandalismo(String edificacion, int n_pisos, String nombreD, String policia, String Idpolicia, int nCelda, String descripcion, String nombreVictima, String culpable, String sentencia, String pais, Date fecha, int nDelito) {
        super(policia, Idpolicia, nCelda, descripcion, nombreVictima, culpable, sentencia, pais, fecha, nDelito);
        this.edificacion = edificacion;
        this.n_pisos = n_pisos;
        this.nombreD = nombreD;
    }

    public String getEdificacion() {
        return edificacion;
    }

    public void setEdificacion(String edificacion) {
        this.edificacion = edificacion;
    }

    public int getN_pisos() {
        return n_pisos;
    }

    public void setN_pisos(int n_pisos) {
        this.n_pisos = n_pisos;
    }

    public String getNombreD() {
        return nombreD;
    }

    public void setNombreD(String nombreD) {
        this.nombreD = nombreD;
    }

    @Override
    public String toString() {
        return super.toString() + "edificacion=" + edificacion + ", n_pisos=" + n_pisos + ", nombreD=" + nombreD + '}';
    }

}
