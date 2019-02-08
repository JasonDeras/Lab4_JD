package lab4;

public class Terrorista extends Agentes {

    private String ciudad;
    private String metodo;

    public Terrorista() {
        super();
    }

    public Terrorista(String ciudad, String metodo, String clasificacion, String nombre, String gener, String pais, String encarcelado, String descripcionFisica) {
        super(clasificacion, nombre, gener, pais, encarcelado, descripcionFisica);
        this.ciudad = ciudad;
        this.metodo = metodo;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getMetodo() {
        return metodo;
    }

    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }

    @Override
    public String toString() {
        return super.toString() + "ciudad=" + ciudad + ", metodo=" + metodo + '}';
    }

}
