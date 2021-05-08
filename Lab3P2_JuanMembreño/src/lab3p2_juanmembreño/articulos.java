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
public class articulos {
     private int numserie;
     private int precio;
     private  Color color;
     private String grantia;

    public articulos() {
    }

    public articulos(int numserie, int precio, Color color, String grantia) {
        this.numserie = numserie;
        this.precio = precio;
        this.color = color;
        this.grantia = grantia;
    }

    public int getNumserie() {
        return numserie;
    }

    public void setNumserie(int numserie) {
        this.numserie = numserie;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getGrantia() {
        return grantia;
    }

    public void setGrantia(String grantia) {
        this.grantia = grantia;
    }

    @Override
    public String toString() {
        return "articulos{" + "numserie=" + numserie + ", precio=" + precio + ", color=" + color + ", grantia=" + grantia + '}';
    }
     
}
