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
public class Delito_Menor extends Kill{
    private String policia, Idpolicia;
    private int nCelda;

    public Delito_Menor() {
        super();
    }

    public Delito_Menor(String policia, String Idpolicia, int nCelda, String descripcion, String nombreVictima, String culpable, String sentencia, String pais, Date fecha, int nDelito) {
        super(descripcion, nombreVictima, culpable, sentencia, pais, fecha, nDelito);
        this.policia = policia;
        this.Idpolicia = Idpolicia;
        this.nCelda = nCelda;
    }

    public String getPolicia() {
        return policia;
    }

    public void setPolicia(String policia) {
        this.policia = policia;
    }

    public String getIdpolicia() {
        return Idpolicia;
    }

    public void setIdpolicia(String Idpolicia) {
        this.Idpolicia = Idpolicia;
    }

    public int getnCelda() {
        return nCelda;
    }

    public void setnCelda(int nCelda) {
        this.nCelda = nCelda;
    }

    @Override
    public String toString() {
        return super.toString() + "Delito_Menor{" + "policia=" + policia + ", Idpolicia=" + Idpolicia + ", nCelda=" + nCelda + '}';
    }
    
}
