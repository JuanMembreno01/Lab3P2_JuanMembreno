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
public class teatrosencasa extends articulos{
    private int cantaltavoces;
    private int cantbluray;
    private String infolimpieza;
    private String infolector;

    public teatrosencasa() {
    }

    public teatrosencasa(int cantaltavoces, int cantbluray, String infolimpieza, String infolector, int numserie, int precio, Color color, String grantia) {
        super(numserie, precio, color, grantia);
        this.cantaltavoces = cantaltavoces;
        this.cantbluray = cantbluray;
        this.infolimpieza = infolimpieza;
        this.infolector = infolector;
    }

    public int getCantaltavoces() {
        return cantaltavoces;
    }

    public void setCantaltavoces(int cantaltavoces) {
        this.cantaltavoces = cantaltavoces;
    }

    public int getCantbluray() {
        return cantbluray;
    }

    public void setCantbluray(int cantbluray) {
        this.cantbluray = cantbluray;
    }

    public String getInfolimpieza() {
        return infolimpieza;
    }

    public void setInfolimpieza(String infolimpieza) {
        this.infolimpieza = infolimpieza;
    }

    public String getInfolector() {
        return infolector;
    }

    public void setInfolector(String infolector) {
        this.infolector = infolector;
    }

    @Override
    public String toString() {
        return "teatrosencasa{" + "cantaltavoces=" + cantaltavoces + ", cantbluray=" + cantbluray + ", infolimpieza=" + infolimpieza + ", infolector=" + infolector + '}';
    }
    
}
