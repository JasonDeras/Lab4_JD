package lab4;

public class Agentes extends Criminales {

    private String clasificacion;

    public Agentes() {
        super();
    }

    public Agentes(String clasificacion, String nombre, String gener, String pais, String encarcelado, String descripcionFisica) {
        super(nombre, gener, pais, encarcelado, descripcionFisica);
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
        return super.toString() + "clasificacion=" + clasificacion + '}';
    }

}
