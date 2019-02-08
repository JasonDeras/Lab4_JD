package lab4;

public class Terrorista extends Agentes {

    private String ciudad;
    private String metodo;
    private String pais;

    public Terrorista() {
        super();
    }

    public Terrorista(String ciudad, String metodo, String pais) {
        this.ciudad = ciudad;
        this.metodo = metodo;
        this.pais = pais;
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

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return super.toString() + "ciudad=" + ciudad + ", metodo=" + metodo + '}';
    }

}
