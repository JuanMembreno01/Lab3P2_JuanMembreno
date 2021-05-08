/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3p2_juanmembreño;

import java.awt.Color;

/**
 *
 * @author usuario
 */
public class televisores extends articulos{
    private int tamaño;
    private boolean smart;
    private int cantconexiones;
    private int grosor;

    public televisores() {
    }

    public televisores(int tamaño, boolean smart, int cantconexiones, int grosor, int numserie, int precio, Color color, String grantia) {
        super(numserie, precio, color, grantia);
        this.tamaño = tamaño;
        this.smart = smart;
        this.cantconexiones = cantconexiones;
        this.grosor = grosor;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public boolean isSmart() {
        return smart;
    }

    public void setSmart(boolean smart) {
        this.smart = smart;
    }

    public int getCantconexiones() {
        return cantconexiones;
    }

    public void setCantconexiones(int cantconexiones) {
        this.cantconexiones = cantconexiones;
    }

    public int getGrosor() {
        return grosor;
    }

    public void setGrosor(int grosor) {
        this.grosor = grosor;
    }

    @Override
    public String toString() {
        return "televisores{" + "tama\u00f1o=" + tamaño + ", smart=" + smart + ", cantconexiones=" + cantconexiones + ", grosor=" + grosor + '}';
    }
    
}
