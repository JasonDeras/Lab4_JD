package lab4;

public class Agentes extends Criminal{

    private String clasificacion;

    public Agentes() {
    }

    public Agentes(String clasificacion) {
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
