package lab4;

import java.util.Date;

public class Trafico_de_Drogas extends Delito_Grave {

    private String drogas;
    private int cantidad;

    public Trafico_de_Drogas() {
        super();
    }

    public Trafico_de_Drogas(String drogas, int cantidad, int gravedad, String descripcion, String nombreVictima, String culpable, String sentencia, String pais, Date fecha, int nDelito) {
        super(gravedad, descripcion, nombreVictima, culpable, sentencia, pais, fecha, nDelito);
        this.drogas = drogas;
        this.cantidad = cantidad;
    }

    public String getDrogas() {
        return drogas;
    }

    public void setDrogas(String drogas) {
        this.drogas = drogas;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return super.toString() + "drogas=" + drogas + ", cantidad=" + cantidad + '}';
    }

}
