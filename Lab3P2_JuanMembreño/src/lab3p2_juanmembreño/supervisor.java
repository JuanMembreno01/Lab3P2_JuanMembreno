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
public class supervisor extends empleados {
     private String nombre;
    private String apellido;
    private int salario;
    private String nacionalida;
    private int cajerossuper;
    private double metapromdecajero;

    public supervisor() {
    }

 

    public supervisor(String nombre, String apellido, int salario, String nacionalida, int cajerossuper, double metapromdecajero, String rango, String usuario, String contraseña) {
        super(rango, usuario, contraseña);
        setNombre(nombre);
        setApellido(apellido);
        setSalario(salario);
        setNacionalida(nacionalida);
        setCajerossuper(cajerossuper);
        setMetapromdecajero(metapromdecajero);
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

    public int getCajerossuper() {
        return cajerossuper;
    }

    public void setCajerossuper(int cajerossuper) {
        this.cajerossuper = cajerossuper;
    }

    public double getMetapromdecajero() {
        return metapromdecajero;
    }

    public void setMetapromdecajero(double metapromdecajero) {
        this.metapromdecajero = metapromdecajero;
    }

    @Override
    public String toString() {
        return "supervisor{" + "nombre=" + nombre + ", apellido=" + apellido + ", salario=" + salario + ", nacionalida=" + nacionalida + ", cajeros que supervisa=" + cajerossuper + ", meta promedio de cajero=" + metapromdecajero + '}';
    }
    
}
