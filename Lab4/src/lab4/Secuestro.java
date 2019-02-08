package lab4;

import java.util.Date;

public class Secuestro extends Delito_Grave {

    private int tiempo_ret;
    private String devuelto;

    public Secuestro() {
        super();
    }

    public Secuestro(int tiempo_ret, String devuelto, int gravedad, String descripcion, String nombreVictima, String culpable, String sentencia, String pais, Date fecha, int nDelito) {
        super(gravedad, descripcion, nombreVictima, culpable, sentencia, pais, fecha, nDelito);
        this.tiempo_ret = tiempo_ret;
        this.devuelto = devuelto;
    }

    public int getTiempo_ret() {
        return tiempo_ret;
    }

    public void setTiempo_ret(int tiempo_ret) {
        this.tiempo_ret = tiempo_ret;
    }

    public String getDevuelto() {
        return devuelto;
    }

    public void setDevuelto(String devuelto) {
        this.devuelto = devuelto;
    }

    @Override
    public String toString() {
        return super.toString() + "tiempo_ret=" + tiempo_ret + ", devuelto=" + devuelto + '}';
    }

}
