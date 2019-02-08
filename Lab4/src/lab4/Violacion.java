package lab4;

import java.util.Date;

public class Violacion extends Delito_Grave {

    private int edadVictima;

    public Violacion() {
        super();
    }

    public Violacion(int edadVictima, int gravedad, String descripcion, String nombreVictima, String culpable, String sentencia, String pais, Date fecha, int nDelito) {
        super(gravedad, descripcion, nombreVictima, culpable, sentencia, pais, fecha, nDelito);
        this.edadVictima = edadVictima;
    }

    public int getEdadVictima() {
        return edadVictima;
    }

    public void setEdadVictima(int edadVictima) {
        this.edadVictima = edadVictima;
    }

    @Override
    public String toString() {
        return super.toString() + "edadVictima=" + edadVictima + '}';
    }

}
