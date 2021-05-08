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
public class cajero extends empleados{
    private String nombre;
    private String apellido;
    private int salario;
    private String nacionalida;
    private int cantaños;
    private String horario;
    private int horaalmuerzo;
    private int meta;
    private int cantempelos;
    public cajero() {
    }


    public cajero(String nombre, String apellido, int salario, String nacionalida, int cantaños, String horario, int horaalmuerzo, int meta, int cantempelos, String rango, String usuario, String contraseña) {
        super(rango, usuario, contraseña);
        setNombre(nombre);;
        setApellido(apellido);
        setNacionalida(nacionalida);
        setSalario(salario);
        setCantaños(cantaños);
        setHorario(horario);
        setHoraalmuerzo(horaalmuerzo);
        setMeta(meta);
        setCantempelos(cantempelos);
        setRango(rango);
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

    public int getCantaños() {
        return cantaños;
    }

    public void setCantaños(int cantaños) {
        this.cantaños = cantaños;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getHoraalmuerzo() {
        return horaalmuerzo;
    }

    public void setHoraalmuerzo(int horaalmuerzo) {
        this.horaalmuerzo = horaalmuerzo;
    }

    public int getMeta() {
        return meta;
    }

    public void setMeta(int meta) {
        this.meta = meta;
    }

    public int getCantempelos() {
        return cantempelos;
    }

    public void setCantempelos(int cantempelos) {
        this.cantempelos = cantempelos;
    }

    @Override
    public String toString() {
        return "cajero{" + "nombre=" + nombre + ", apellido=" + apellido + ", salario=" + salario + ", nacionalida=" + nacionalida + ", canta\u00f1os=" + cantaños + ", horario=" + horario + ", horaalmuerzo=" + horaalmuerzo + ", meta=" + meta + ", cantempelos=" + cantempelos + '}';
    }
    
}
