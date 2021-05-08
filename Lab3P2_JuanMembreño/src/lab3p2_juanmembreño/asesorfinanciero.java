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
public class asesorfinanciero extends empleados {
    private String nombre;
    private String apellido;
    private int salario;
    private String nacionalida;
    private int clientesatendidos;
    private int cantdeproductoscomprados;
    private int numerototaldecreditos;

    public asesorfinanciero() {
    }

 

    public asesorfinanciero(String nombre, String apellido, int salario, String nacionalida, int clientesatendidos, int cantdeproductoscomprados, int numerototaldecreditos, String rango, String usuario, String contraseña) {
        super(rango, usuario, contraseña);
        setNombre(nombre);
        setApellido(apellido);
        setSalario(salario);
        setNacionalida(nacionalida);
        setClientesatendidos(clientesatendidos);
        setCantdeproductoscomprados(cantdeproductoscomprados);
        setNumerototaldecreditos(numerototaldecreditos);
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

    public int getClientesatendidos() {
        return clientesatendidos;
    }

    public void setClientesatendidos(int clientesatendidos) {
        this.clientesatendidos = clientesatendidos;
    }

    public int getCantdeproductoscomprados() {
        return cantdeproductoscomprados;
    }

    public void setCantdeproductoscomprados(int cantdeproductoscomprados) {
        this.cantdeproductoscomprados = cantdeproductoscomprados;
    }

    public int getNumerototaldecreditos() {
        return numerototaldecreditos;
    }

    public void setNumerototaldecreditos(int numerototaldecreditos) {
        this.numerototaldecreditos = numerototaldecreditos;
    }

    @Override
    public String toString() {
        return "asesorfinanciero{" + "nombre=" + nombre + ", apellido=" + apellido + ", salario=" + salario + ", nacionalida=" + nacionalida + ", clientes atendidos=" + clientesatendidos + ", cantidad de productos comprados=" + cantdeproductoscomprados + ", numero total de creditos=" + numerototaldecreditos + '}';
    }
    
}
