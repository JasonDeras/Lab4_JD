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
public class Delito_Grave extends Kill{
    private int gravedad;

    public Delito_Grave() {
        super();
        
    }

    public Delito_Grave(int gravedad, String descripcion, String nombreVictima, String culpable, String sentencia, String pais, Date fecha, int nDelito) {
        super(descripcion, nombreVictima, culpable, sentencia, pais, fecha, nDelito);
        this.gravedad = gravedad;
    }

    public int getGravedad() {
        return gravedad;
    }

    public void setGravedad(int gravedad) {
        this.gravedad = gravedad;
    }

    @Override
    public String toString() {
        return super.toString() + "Delito_Grave{" + "gravedad=" + gravedad + '}';
    }
    
}
