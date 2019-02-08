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
public class Prostitucion extends Delito_Menor{
    private String nombreSolicitante;

    public Prostitucion() {
        super();
    }

    public Prostitucion(String nombreSolicitante) {
        this.nombreSolicitante = nombreSolicitante;
    }

    public Prostitucion(String nombreSolicitante, String policia, String Idpolicia, int nCelda, String descripcion, String nombreVictima, String culpable, String sentencia, String pais, Date fecha, int nDelito) {
        super(policia, Idpolicia, nCelda, descripcion, nombreVictima, culpable, sentencia, pais, fecha, nDelito);
        this.nombreSolicitante = nombreSolicitante;
    }

    public String getNombreSolicitante() {
        return nombreSolicitante;
    }

    public void setNombreSolicitante(String nombreSolicitante) {
        this.nombreSolicitante = nombreSolicitante;
    }

    @Override
    public String toString() {
        return super.toString() + "Prostitucion{" + "nombreSolicitante=" + nombreSolicitante + '}';
    }   
}
