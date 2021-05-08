/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3p2_juanmembreño;

/**
 *
 * @author usuario
 */
public class tienda {

    private int identificador;
    private String ubicacion;
    private int cantempledos;
    private int cantcajas;
    private String produmasv;
    private int cantmaxprodu;

    public tienda() {
    }

    public tienda(int identificador, String ubicacion, int cantempledos, int cantcajas, String produmasv, int cantmaxprodu) {
        this.identificador = identificador;
        this.ubicacion = ubicacion;
        this.cantempledos = cantempledos;
        this.cantcajas = cantcajas;
        this.produmasv = produmasv;
        this.cantmaxprodu = cantmaxprodu;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getCantempledos() {
        return cantempledos;
    }

    public void setCantempledos(int cantempledos) {
        this.cantempledos = cantempledos;
    }

    public int getCantcajas() {
        return cantcajas;
    }

    public void setCantcajas(int cantcajas) {
        this.cantcajas = cantcajas;
    }

    public String getProdumasv() {
        return produmasv;
    }

    public void setProdumasv(String produmasv) {
        this.produmasv = produmasv;
    }

    public int getCantmaxprodu() {
        return cantmaxprodu;
    }

    public void setCantmaxprodu(int cantmaxprodu) {
        this.cantmaxprodu = cantmaxprodu;
    }

    @Override
    public String toString() {
        return "tienda{" + "identificador=" + identificador + ", ubicacion=" + ubicacion + ", cantidad de empledos=" + cantempledos + ", cantidad de cajas=" + cantcajas + ", producto mas vendido=" + produmasv + ", cantidad maxima productos=" + cantmaxprodu + '}';
    }
    
}
