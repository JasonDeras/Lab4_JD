package lab4;

import java.util.Date;

public class Terrorismo extends Delito_Menor {

    private String artefacto;
    private int victimas;

    public Terrorismo() {
    }

    public Terrorismo(String artefacto, int victimas, String policia, String Idpolicia, int nCelda, String descripcion, String nombreVictima, String culpable, String sentencia, String pais, Date fecha, int nDelito) {
        super(policia, Idpolicia, nCelda, descripcion, nombreVictima, culpable, sentencia, pais, fecha, nDelito);
        this.artefacto = artefacto;
        this.victimas = victimas;
    }

    public String getArtefacto() {
        return artefacto;
    }

    public void setArtefacto(String artefacto) {
        this.artefacto = artefacto;
    }

    public int getVictimas() {
        return victimas;
    }

    public void setVictimas(int victimas) {
        this.victimas = victimas;
    }

    @Override
    public String toString() {
        return super.toString() + "artefacto=" + artefacto + ", victimas=" + victimas + '}';
    }

}
