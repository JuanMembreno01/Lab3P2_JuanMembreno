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
public class equiposonido extends articulos {
    private int cantaltavoces;
    private int potenciamax;
    private int cantdepuertos;
    private int cantdediscos;
    private int cantpuertosusb;

    public equiposonido() {
    }

    public equiposonido(int cantaltavoces, int potenciamax, int cantdepuertos, int cantdediscos, int cantpuertosusb, int numserie, int precio, Color color, String grantia) {
        super(numserie, precio, color, grantia);
        this.cantaltavoces = cantaltavoces;
        this.potenciamax = potenciamax;
        this.cantdepuertos = cantdepuertos;
        this.cantdediscos = cantdediscos;
        this.cantpuertosusb = cantpuertosusb;
    }

    public int getCantaltavoces() {
        return cantaltavoces;
    }

    public void setCantaltavoces(int cantaltavoces) {
        this.cantaltavoces = cantaltavoces;
    }

    public int getPotenciamax() {
        return potenciamax;
    }

    public void setPotenciamax(int potenciamax) {
        this.potenciamax = potenciamax;
    }

    public int getCantdepuertos() {
        return cantdepuertos;
    }

    public void setCantdepuertos(int cantdepuertos) {
        this.cantdepuertos = cantdepuertos;
    }

    public int getCantdediscos() {
        return cantdediscos;
    }

    public void setCantdediscos(int cantdediscos) {
        this.cantdediscos = cantdediscos;
    }

    public int getCantpuertosusb() {
        return cantpuertosusb;
    }

    public void setCantpuertosusb(int cantpuertosusb) {
        this.cantpuertosusb = cantpuertosusb;
    }

    @Override
    public String toString() {
        return "equiposonido{" + "cantaltavoces=" + cantaltavoces + ", potenciamax=" + potenciamax + ", cantdepuertos=" + cantdepuertos + ", cantdediscos=" + cantdediscos + ", cantpuertosusb=" + cantpuertosusb + '}';
    }
    
}
