package lab4;

public class Secuestrador extends Agentes {

    private String nombre_v;
    private int rescate;

    public Secuestrador() {
        super();
    }

    public Secuestrador(String nombre_v, int rescate) {
        this.nombre_v = nombre_v;
        this.rescate = rescate;
    }

    public String getNombre_v() {
        return nombre_v;
    }

    public void setNombre_v(String nombre_v) {
        this.nombre_v = nombre_v;
    }

    public int getRescate() {
        return rescate;
    }

    public void setRescate(int rescate) {
        this.rescate = rescate;
    }

    @Override
    public String toString() {
        return super.toString() + "nombre_v=" + nombre_v + ", rescate=" + rescate + '}';
    }

}
