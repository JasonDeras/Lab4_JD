package lab4;

import java.util.ArrayList;

public class Criminales {

    private ArrayList delitos = new ArrayList();
    private String nombre, gener, pais, encarcelado, descripcionFisica;

    public Criminales() {
    }

    public Criminales(String nombre, String gener, String pais, String encarcelado, String descripcionFisica) {
        this.nombre = nombre;
        this.gener = gener;
        this.pais = pais;
        this.encarcelado = encarcelado;
        this.descripcionFisica = descripcionFisica;
    }

    public ArrayList getDelitos() {
        return delitos;
    }

    public void setDelitos(ArrayList delitos) {
        this.delitos = delitos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGener() {
        return gener;
    }

    public void setGener(String gener) {
        this.gener = gener;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getEncarcelado() {
        return encarcelado;
    }

    public void setEncarcelado(String encarcelado) {
        this.encarcelado = encarcelado;
    }

    public String getDescripcionFisica() {
        return descripcionFisica;
    }

    public void setDescripcionFisica(String descripcionFisica) {
        this.descripcionFisica = descripcionFisica;
    }

    @Override
    public String toString() {
        return "Criminales{" + "delitos=" + delitos + ", nombre=" + nombre + ", gener=" + gener + ", pais=" + pais + ", encarcelado=" + encarcelado + ", descripcionFisica=" + descripcionFisica + '}';
    }
}
