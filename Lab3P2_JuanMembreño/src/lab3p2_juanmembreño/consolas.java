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
public class consolas extends articulos{
    private String marca;
    private int alamcenamiento;
    private int cantcontroles;
    private int numacc;
    private String info;

    public consolas() {
    }

    public consolas(String marca, int alamcenamiento, int cantcontroles, int numacc, String info) {
        this.marca = marca;
        this.alamcenamiento = alamcenamiento;
        this.cantcontroles = cantcontroles;
        this.numacc = numacc;
        this.info = info;
    }

    public consolas(String marca, int alamcenamiento, int cantcontroles, int numacc, String info, int numserie, int precio, Color color, String grantia) {
        super(numserie, precio, color, grantia);
        this.marca = marca;
        this.alamcenamiento = alamcenamiento;
        this.cantcontroles = cantcontroles;
        this.numacc = numacc;
        this.info = info;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAlamcenamiento() {
        return alamcenamiento;
    }

    public void setAlamcenamiento(int alamcenamiento) {
        this.alamcenamiento = alamcenamiento;
    }

    public int getCantcontroles() {
        return cantcontroles;
    }

    public void setCantcontroles(int cantcontroles) {
        this.cantcontroles = cantcontroles;
    }

    public int getNumacc() {
        return numacc;
    }

    public void setNumacc(int numacc) {
        this.numacc = numacc;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "consolas{" + "marca=" + marca + ", alamcenamiento=" + alamcenamiento + ", cantcontroles=" + cantcontroles + ", numacc=" + numacc + ", info=" + info + '}';
    }
    
}
