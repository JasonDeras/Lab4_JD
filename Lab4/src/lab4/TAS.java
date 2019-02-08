package lab4;

public class TAS {

    private String clasificacion;

    public TAS() {
    }

    public TAS(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    @Override
    public String toString() {
        return "TAS{" + "clasificacion=" + clasificacion + '}';
    }

}
