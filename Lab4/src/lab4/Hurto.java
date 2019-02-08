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
public class Hurto extends Delito_Menor{
    private String objetoHurtado;
    private int valor;

    public Hurto() {
        super();
    }

    public Hurto(String objetoHurtado, int valor, String policia, String Idpolicia, int nCelda, String descripcion, String nombreVictima, String culpable, String sentencia, String pais, Date fecha, int nDelito) {
        super(policia, Idpolicia, nCelda, descripcion, nombreVictima, culpable, sentencia, pais, fecha, nDelito);
        this.objetoHurtado = objetoHurtado;
        this.valor = valor;
    }
    
}
