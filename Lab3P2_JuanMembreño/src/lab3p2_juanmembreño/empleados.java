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
public class empleados {

    private String rango;
    private String usuario;
    private String contraseña;

    public empleados() {
    }

    public empleados(String rango, String usuario, String contraseña) {
        this.rango = rango;
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

   

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public String toString() {
        return "empleados{" + "rango=" + rango + ", usuario=" + usuario + ", contraseña=" + contraseña + '}';
    }
    

    

}
