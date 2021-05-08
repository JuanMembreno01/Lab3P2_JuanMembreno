/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3p2_juanmembreño;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class clientes {
    private String nombre;
    private String apellido;
    private int salario;
    private String nacionalida;
    private int cantidadcredito;
    private String recientes;
    private int cantcompras;
    private String dirrecion;

    public clientes() {
    }

    public clientes(String nombre, String apellido, int salario, String nacionalida, int cantidadcredito,String recientes, int cantcompras, String dirrecion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
        this.nacionalida = nacionalida;
        this.cantidadcredito = cantidadcredito;
        this.recientes = recientes;
        this.cantcompras = cantcompras;
        this.dirrecion = dirrecion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public String getNacionalida() {
        return nacionalida;
    }

    public void setNacionalida(String nacionalida) {
        this.nacionalida = nacionalida;
    }

    public int getCantidadcredito() {
        return cantidadcredito;
    }

    public void setCantidadcredito(int cantidadcredito) {
        this.cantidadcredito = cantidadcredito;
    }

    public String getRecientes() {
        return recientes;
    }

    public void setRecientes(String recientes) {
        this.recientes = recientes;
    }

    public int getCantcompras() {
        return cantcompras;
    }

    public void setCantcompras(int cantcompras) {
        this.cantcompras = cantcompras;
    }

    public String getDirrecion() {
        return dirrecion;
    }

    public void setDirrecion(String dirrecion) {
        this.dirrecion = dirrecion;
    }

    @Override
    public String toString() {
        return "clientes{" + "nombre=" + nombre + ", apellido=" + apellido + ", salario=" + salario + ", nacionalida=" + nacionalida + ", cantidadcredito=" + cantidadcredito + ", recientes=" + recientes + ", cantcompras=" + cantcompras + ", dirrecion=" + dirrecion + '}';
    }
    
}
