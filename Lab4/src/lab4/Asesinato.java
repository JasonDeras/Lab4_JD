/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.util.Date;

/**
 *
 * @author jason
 */

public class Asesinato extends Delito_Grave {
    private String arma;
    private int nCuerpos;

    public Asesinato() {
        super();
    }

    public Asesinato(String arma, int nCuerpos, int gravedad, String descripcion, String nombreVictima, String culpable, String sentencia, String pais, Date fecha, int nDelito) {
        super(gravedad, descripcion, nombreVictima, culpable, sentencia, pais, fecha, nDelito);
        this.arma = arma;
        this.nCuerpos = nCuerpos;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    public int getnCuerpos() {
        return nCuerpos;
    }

    public void setnCuerpos(int nCuerpos) {
        this.nCuerpos = nCuerpos;
    }

    @Override
    public String toString() {
        return "Asesinato{" + "arma=" + arma + ", nCuerpos=" + nCuerpos + '}';
    }
    
}
