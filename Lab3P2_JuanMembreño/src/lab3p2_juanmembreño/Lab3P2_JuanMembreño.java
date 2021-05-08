/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3p2_juanmembreño;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Lab3P2_JuanMembreño {
    // static Scanner leer=new Scanner(System.in);

    static Scanner leer = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int op = 0;
        ArrayList<cajero> listacajeros = new ArrayList();
        ArrayList<supervisor> listasupervisores = new ArrayList();
        ArrayList<asesorfinanciero> listaasesores = new ArrayList();
        ArrayList<empleados> empleados = new ArrayList();
        ArrayList<tienda> tiendas = new ArrayList();
        ArrayList<articulos> listaarticulos = new ArrayList();
        ArrayList<clientes> clientes = new ArrayList();
        // ArrayList todo = new ArrayList();
        while (op != 3) {
            System.out.println("1)Ingresar nuevo usuario");
            System.out.println("2)Login");
            System.out.println("3)salir");
            op = leer.nextInt();
            switch (op) {
                case 1: {
                    System.out.println("Ingrese su pocision en la tienda(cajero,supervisor,asesor)");
                    String pos = leer.nextLine();
                    pos = leer.nextLine();
                    pos = pos.toLowerCase();
                    System.out.println("Ingrese su usuario");
                    String usuario = leer.nextLine();
                    System.out.println("Ingrese su contraseña");
                    String contraseña = leer.nextLine();
                    empleados.add(new empleados(pos, usuario, contraseña));

                    if (pos.equals("cajero")) {
                        //cajero a=new cajero();
                        System.out.println("Ingrese su nombre");
                        String nombre = leer.nextLine();
                        System.out.println("Ingrese su apellido");
                        String apellido = leer.nextLine();
                        System.out.println("Ingrse su salario");
                        int salario = leer.nextInt();
                        System.out.println("Ingrese su nacionalidad");
                        String nacionalidad = leer.nextLine();
                        nacionalidad = leer.nextLine();
                        System.out.println("Ingrese cantidad de años trabajando");
                        int cantaños = leer.nextInt();
                        System.out.println("Ingrese horario");
                        String horario = leer.nextLine();
                        horario = leer.nextLine();
                        System.out.println("Ingrese hora de almuerzo");
                        int horaalmuerzo = leer.nextInt();
                        System.out.println("Ingrese meta a vender cada mes");
                        int meta = leer.nextInt();
                        System.out.println("Ingrese cantidad de empleados atendidos");
                        int cantem = leer.nextInt();
                        listacajeros.add(new cajero(nombre, apellido, salario, nacionalidad, cantaños, horario, horaalmuerzo, meta, cantem, pos, usuario, contraseña));
                        String salida2 = "";
                        for (Object t : listacajeros) {
                            if (t instanceof cajero) {
                                salida2 += listacajeros.indexOf(t) + "- " + t + "\n";
                            }
                        }
                        System.out.println("cajero prueba");
                        System.out.println(salida2);

                    } else if (pos.equals("supervisor")) {
                        System.out.println("Ingrese su nombre");
                        String nombre = leer.nextLine();
                        System.out.println("Ingrese su apellido");
                        String apellido = leer.nextLine();
                        System.out.println("Ingrse  salario");
                        int salario = leer.nextInt();
                        System.out.println("Ingrese su nacionalidad");
                        String nacionalidad = leer.nextLine();
                        nacionalidad = leer.nextLine();
                        System.out.println("Ingrese cantidad de cajeros que supervisa");
                        int cantsupervisa = leer.nextInt();
                        System.out.println("Ingrse  salario promedio de los cajeros que supervisa");
                        double promsalario = leer.nextInt();
                        System.out.println("Ingrese  meta promedio del cajero que supervisa");
                        int meta = leer.nextInt();
                        listasupervisores.add(new supervisor(nombre, apellido, salario, nacionalidad, cantsupervisa, promsalario, pos, usuario, contraseña));
                        String salida2 = "";
                        for (Object t : listasupervisores) {
                            if (t instanceof supervisor) {
                                salida2 += listasupervisores.indexOf(t) + "- " + t + "\n";
                            }
                        }
                        System.out.println("supervisor prueba");
                        System.out.println(salida2);

                    } else if (pos.equals("asesor")) {
                        System.out.println("Ingrese su nombre");
                        String nombre = leer.nextLine();
                        System.out.println("Ingrese su apellido");
                        String apellido = leer.nextLine();
                        System.out.println("Ingrse  salario");
                        int salario = leer.nextInt();
                        System.out.println("Ingrese su nacionalidad");
                        String nacionalidad = leer.nextLine();
                        nacionalidad = leer.nextLine();
                        System.out.println("Ingrese cantidad de clientes a los que ah atendido");
                        int cantaten = leer.nextInt();
                        System.out.println("Ingrse cantidad de productos comprados por susu clientes");
                        int cantcompras = leer.nextInt();
                        System.out.println("Ingrese numero de creditos concedidos");
                        int creditos = leer.nextInt();
                        listaasesores.add(new asesorfinanciero(nombre, apellido, salario, nacionalidad, cantaten, cantcompras, creditos, pos, usuario, contraseña));
                        String salida2 = "";
                        for (Object t : listaasesores) {
                            if (t instanceof asesorfinanciero) {
                                salida2 += listaasesores.indexOf(t) + "- " + t + "\n";
                            }
                        }
                        System.out.println("asesorfinanciero");
                        System.out.println(salida2);
                    }

                }
                break;
                case 2: {
                    int esta = 0;
                    String pos = "";
                    System.out.println("Ingrese su usuario");
                    String usuario = leer.nextLine();
                    usuario = leer.nextLine();
                    System.out.println("Ingrese su contraseña");
                    String contraseña = leer.nextLine();
                    cajero a = new cajero();

                    for (int i = 0; i < empleados.size(); i++) {
                        if (empleados.get(i).getUsuario().equals(usuario) & empleados.get(i).getContraseña().equals(contraseña)) {
                            esta = 1;
                            pos = empleados.get(i).getRango();
                        }
                    }
                    //pos=empleados.get(op).getRango();
                    if (esta == 1 & pos.equals("cajero")) {
                        System.out.println("1)Listar informacion");
                        System.out.println("2)Ver productos en la tienda");
                        int op2 = leer.nextInt();
                        switch (op2) {
                            case 1: {
                                for (int i = 0; i < listacajeros.size(); i++) {
                                    if (listacajeros.get(i).getUsuario().equals(usuario) & listacajeros.get(i).getContraseña().equals(contraseña)) {
                                        System.out.println("Su informacion es:");
                                        System.out.println(listacajeros.get(i));

                                    }
                                }
                            }
                            break;
                            case 2: {
                                System.out.println(listaarticulos);
                            }
                            break;
                        }
                    } else if (esta == 1 & pos.equals("supervisor")) {
                        System.out.println("1)crear cajero");
                        System.out.println("2)eliminar cajero");
                        System.out.println("3)modificar cajero");
                        System.out.println("4)listar cajeros");
                        System.out.println("5)crear asesor");
                        System.out.println("6)eliminar asesor");
                        System.out.println("7)modificar asesor");
                        System.out.println("8)listar asesor");
                        int op4 = leer.nextInt();
                        switch (op4) {
                            case 1: {
                                pos = "cajero";
                                System.out.println("Ingrese su usuario");
                                usuario = leer.nextLine();
                                System.out.println("Ingrese su contraseña");
                                contraseña = leer.nextLine();
                                empleados.add(new empleados(pos, usuario, contraseña));
                                System.out.println("Ingrese  nombre del cajero");
                                String nombre = leer.nextLine();
                                System.out.println("Ingrese apellido");
                                String apellido = leer.nextLine();
                                System.out.println("Ingrse el salario");
                                int salario = leer.nextInt();
                                System.out.println("Ingrese la nacionalidad");
                                String nacionalidad = leer.nextLine();
                                nacionalidad = leer.nextLine();
                                System.out.println("Ingrese cantidad de años trabajando");
                                int cantaños = leer.nextInt();
                                System.out.println("Ingrese horario");
                                String horario = leer.nextLine();
                                horario = leer.nextLine();
                                System.out.println("Ingrese hora de almuerzo");
                                int horaalmuerzo = leer.nextInt();
                                System.out.println("Ingrese meta a vender cada mes");
                                int meta = leer.nextInt();
                                System.out.println("Ingrese cantidad de empleados atendidos");
                                int cantem = leer.nextInt();
                                listacajeros.add(new cajero(nombre, apellido, salario, nacionalidad, cantaños, horario, horaalmuerzo, meta, cantem, pos, usuario, contraseña));
                            }
                            break;
                            case 2: {
                                while (listacajeros.size() <= 0) {
                                    System.out.println("no hay elementos");
                                }
                                String salida2 = "";
                                for (Object t : listacajeros) {
                                    if (t instanceof cajero) {
                                        salida2 += listacajeros.indexOf(t) + "- " + t + "\n";
                                    }
                                }
                                System.out.println(salida2);
                                salida2 = "";
                                System.out.println("Ingrese indice a eliminar");
                                int indice = leer.nextInt();
                                listacajeros.remove(indice);
                                System.out.println("eliminado");
                                for (Object t : listacajeros) {
                                    if (t instanceof cajero) {
                                        salida2 += listacajeros.indexOf(t) + "- " + t + "\n";
                                    }
                                }
                                System.out.println(salida2);
                            }
                            break;
                            case 3: {
                                while (listacajeros.size() <= 0) {
                                    System.out.println("no hay elementos");
                                }
                                String salida2 = "";
                                for (Object t : listacajeros) {
                                    if (t instanceof cajero) {
                                        salida2 += listacajeros.indexOf(t) + "- " + t + "\n";
                                    }
                                }
                                System.out.println(salida2);
                                salida2 = "";
                                System.out.println("Ingrese indice a modificar");
                                int indice = leer.nextInt();
                                System.out.println("pra modificar ingrese el ");
                                System.out.println("Ingrese  usuario");
                                usuario = leer.nextLine();
                                System.out.println("Ingrese contraseña");
                                contraseña = leer.nextLine();
                                empleados.add(new empleados(pos, usuario, contraseña));
                                System.out.println("Ingrese  nombre del cajero");
                                String nombre = leer.nextLine();
                                System.out.println("Ingrese apellido");
                                String apellido = leer.nextLine();
                                System.out.println("Ingrse el salario");
                                int salario = leer.nextInt();
                                System.out.println("Ingrese la nacionalidad");
                                String nacionalidad = leer.nextLine();
                                nacionalidad = leer.nextLine();
                                System.out.println("Ingrese cantidad de años trabajando");
                                int cantaños = leer.nextInt();
                                System.out.println("Ingrese horario");
                                String horario = leer.nextLine();
                                horario = leer.nextLine();
                                System.out.println("Ingrese hora de almuerzo");
                                int horaalmuerzo = leer.nextInt();
                                System.out.println("Ingrese meta a vender cada mes");
                                int meta = leer.nextInt();
                                System.out.println("Ingrese cantidad de empleados atendidos");
                                int cantem = leer.nextInt();
                                listacajeros.add(indice, new cajero(nombre, apellido, salario, nacionalidad, cantaños, horario, horaalmuerzo, meta, cantem, pos, usuario, contraseña));
                                listacajeros.remove(indice + 1);
                                System.out.println("modificado");
                                for (Object t : listacajeros) {
                                    if (t instanceof cajero) {
                                        salida2 += listacajeros.indexOf(t) + "- " + t + "\n";
                                    }
                                }
                                System.out.println(salida2);
                            }
                            break;
                            case 4: {
                                String salida2 = "";
                                for (Object t : listacajeros) {
                                    if (t instanceof cajero) {
                                        salida2 += listacajeros.indexOf(t) + "- " + t + "\n";
                                    }
                                }
                                System.out.println("Cajeros");
                                System.out.println(salida2);
                            }
                            break;
                            case 5: {
                                System.out.println("Ingrese el usuario");
                                usuario = leer.nextLine();
                                System.out.println("Ingrese la contraseña");
                                contraseña = leer.nextLine();
                                empleados.add(new empleados(pos, usuario, contraseña));
                                System.out.println("Ingrese el nombre");
                                String nombre = leer.nextLine();
                                System.out.println("Ingrese el apellido");
                                String apellido = leer.nextLine();
                                System.out.println("Ingrse el  salario");
                                int salario = leer.nextInt();
                                System.out.println("Ingrese la nacionalidad");
                                String nacionalidad = leer.nextLine();
                                nacionalidad = leer.nextLine();
                                System.out.println("Ingrese cantidad de clientes a los que ah atendido");
                                int cantaten = leer.nextInt();
                                System.out.println("Ingrse cantidad de productos comprados por susu clientes");
                                int cantcompras = leer.nextInt();
                                System.out.println("Ingrese numero de creditos concedidos");
                                int creditos = leer.nextInt();
                                listaasesores.add(new asesorfinanciero(nombre, apellido, salario, nacionalidad, cantaten, cantcompras, creditos, pos, usuario, contraseña));
                                String salida2 = "";
                                for (Object t : listaasesores) {
                                    if (t instanceof asesorfinanciero) {
                                        salida2 += listaasesores.indexOf(t) + "- " + t + "\n";
                                    }
                                }
                                System.out.println(salida2);
                            }
                            break;
                            case 6: {
                                while (listaasesores.size() <= 0) {
                                    System.out.println("no hay elementos");
                                }
                                String salida2 = "";
                                for (Object t : listaasesores) {
                                    if (t instanceof asesorfinanciero) {
                                        salida2 += listaasesores.indexOf(t) + "- " + t + "\n";
                                    }
                                }
                                System.out.println(salida2);
                                salida2 = "";
                                System.out.println("Ingrese indice a eliminar");
                                int indice = leer.nextInt();
                                listaasesores.remove(indice);
                                System.out.println("eliminado");
                                for (Object t : listaasesores) {
                                    if (t instanceof asesorfinanciero) {
                                        salida2 += listaasesores.indexOf(t) + "- " + t + "\n";
                                    }
                                }
                                System.out.println(salida2);

                            }
                            break;
                            case 7: {
                                while (listaasesores.size() <= 0) {
                                    System.out.println("no hay elementos");
                                }
                                String salida2 = "";
                                for (Object t : listaasesores) {
                                    if (t instanceof asesorfinanciero) {
                                        salida2 += listaasesores.indexOf(t) + "- " + t + "\n";
                                    }
                                }
                                System.out.println(salida2);
                                salida2 = "";
                                System.out.println("Ingrese indice a modificar");
                                int indice = leer.nextInt();
                                System.out.println("pra modificar ingrese el ");
                                System.out.println("Ingrese el usuario");
                                usuario = leer.nextLine();
                                System.out.println("Ingrese la contraseña");
                                contraseña = leer.nextLine();
                                empleados.add(new empleados(pos, usuario, contraseña));
                                System.out.println("Ingrese el nombre");
                                String nombre = leer.nextLine();
                                System.out.println("Ingrese el apellido");
                                String apellido = leer.nextLine();
                                System.out.println("Ingrse el  salario");
                                int salario = leer.nextInt();
                                System.out.println("Ingrese la nacionalidad");
                                String nacionalidad = leer.nextLine();
                                nacionalidad = leer.nextLine();
                                System.out.println("Ingrese cantidad de clientes a los que ah atendido");
                                int cantaten = leer.nextInt();
                                System.out.println("Ingrse cantidad de productos comprados por susu clientes");
                                int cantcompras = leer.nextInt();
                                System.out.println("Ingrese numero de creditos concedidos");
                                int creditos = leer.nextInt();
                                listaasesores.add(indice, new asesorfinanciero(nombre, apellido, salario, nacionalidad, cantaten, cantcompras, creditos, pos, usuario, contraseña));
                                listaasesores.remove(indice + 1);
                                System.out.println("modificado");
                                for (Object t : listaasesores) {
                                    if (t instanceof asesorfinanciero) {
                                        salida2 += listaasesores.indexOf(t) + "- " + t + "\n";
                                    }
                                }
                                System.out.println(salida2);
                            }
                            break;
                            case 8: {
                                String salida2 = "";
                                for (Object t : listaasesores) {
                                    if (t instanceof asesorfinanciero) {
                                        salida2 += listaasesores.indexOf(t) + "- " + t + "\n";
                                    }
                                }
                                System.out.println(salida2);
                            }
                            break;
                        }
                    } else if (usuario.equals("admin") & contraseña.equals("1234")) {
                        System.out.println("1)Ingresar tienda");
                        System.out.println("2)Agregar producto");
                        System.out.println("3)Modificar producto");
                        System.out.println("4)Eliminar producto");
                        System.out.println("5)Agregar cajero");
                        System.out.println("6)Agregar supervisor");
                        System.out.println("7)Agregar asesor");
                        System.out.println("8)clientes");
                        int op3 = leer.nextInt();
                        switch (op3) {
                            case 1: {
                                System.out.println("ingrese el identificador");
                                int inden = leer.nextInt();
                                System.out.println("ingrese ubicacion");
                                String ubicacion = leer.nextLine();
                                ubicacion = leer.nextLine();
                                System.out.println("ingrese cantidad maxima de empelados");
                                int cantmax = leer.nextInt();
                                System.out.println("ingrese cantidad de cajas");
                                int cantcajas = leer.nextInt();
                                System.out.println("Ingrese el producto mas vendido");
                                String produmv = leer.nextLine();
                                produmv = leer.nextLine();
                                System.out.println("Ingrese cantidad de articulos en la tienda");
                                int canttienda = leer.nextInt();
                                tiendas.add(new tienda(inden, ubicacion, canttienda, cantcajas, produmv, cantmax));
                            }
                            break;
                            case 2: {
                                boolean sm;
                                System.out.println("ingrese numero de serie");
                                int numeroserie = leer.nextInt();
                                System.out.println("Ingrese precio ");
                                int precio = leer.nextInt();
                                System.out.println("Ingrese informacion");
                                String info = leer.nextLine();
                                info = leer.nextLine();
                                System.out.println("Ingrese como clasifica el producto(televisores,consolas,equipos de sonido,teatro en casa)");
                                String clas = leer.nextLine();
                                clas = clas.toLowerCase();
                                if (clas.equals("televisores")) {
                                    System.out.println("Ingrese tamaño");
                                    int tam = leer.nextInt();
                                    System.out.println("Es smart{s/n)");
                                    String s = leer.nextLine();
                                    s = leer.nextLine();
                                    s = s.toLowerCase();
                                    if (s.equals("s")) {
                                        sm = true;
                                    } else {
                                        sm = false;
                                    }
                                    System.out.println("Marca");
                                    String marca = leer.nextLine();
                                    System.out.println("ingrese cant de conexiones");
                                    int cantcont = leer.nextInt();
                                    System.out.println("Ingrese grosor");
                                    int grosor = leer.nextInt();
                                    listaarticulos.add(new televisores(tam, sm, cantcont, grosor, numeroserie, precio, Color.yellow, info));
                                } else if (clas.equals("consolas")) {
                                    System.out.println("Ingrese marca");
                                    String marca = leer.nextLine();
                                    System.out.println("Ingrese cantidad de alamcenamiento en Gb");
                                    int almacenamiento = leer.nextInt();
                                    System.out.println("Cantidad de controles");
                                    int cantcont = leer.nextInt();
                                    System.out.println("Numero de accesorios");
                                    int nacc = leer.nextInt();
                                    System.out.println("informacion de la tarjeta");
                                    String infot = leer.nextLine();
                                    listaarticulos.add(new consolas(marca, almacenamiento, cantcont, nacc, infot, numeroserie, precio, Color.BLACK, marca));
                                } else if (clas.equals("equipos de sonido")) {
                                    System.out.println("Cant altavoces");
                                    int alt = leer.nextInt();
                                    System.out.println("potencia maxima");
                                    int potencia = leer.nextInt();
                                    System.out.println("cantidad de puertos auxiliares");
                                    int cantpa = leer.nextInt();
                                    System.out.println("cantidad maxima de discos");
                                    int cantdmax = leer.nextInt();
                                    System.out.println("cantidad de puertos USB");
                                    int pusb = leer.nextInt();
                                    System.out.println("ingo grantia");
                                    String garantia = leer.nextLine();
                                    listaarticulos.add(new equiposonido(alt, potencia, cantpa, cantdmax, pusb, numeroserie, precio, Color.yellow, garantia));
                                } else if (clas.equals("teatros en casa")) {
                                    System.out.println("Cant altavoces");
                                    int alt = leer.nextInt();
                                    System.out.println("cantidad maxima de discos blue ray");
                                    int cantdmax = leer.nextInt();
                                    System.out.println("Informacion de limpieza");
                                    String infolim = leer.nextLine();
                                    System.out.println("Informacion lector");
                                    String infolec = leer.nextLine();
                                    System.out.println("ingo grantia");
                                    String garantia = leer.nextLine();
                                    listaarticulos.add(new teatrosencasa(alt, cantdmax, infolim, infolec, numeroserie, precio, Color.yellow, garantia));
                                } else {
                                    System.out.println("clasificacion incorrecta");
                                }

                            }
                            break;
                            case 3: {
                                while (listaarticulos.size() <= 0) {
                                    System.out.println("no hay nada para modificar");
                                }
                                String salida2 = "";
                                for (Object t : listaarticulos) {
                                    if (t instanceof articulos) {
                                        salida2 += listaarticulos.indexOf(t) + "- " + t + "\n";
                                    }
                                }
                                System.out.println("Articulos");
                                System.out.println(salida2);
                                System.out.println("Ingrese el indice del articulo a modificar");
                                int indice = leer.nextInt();
                                System.out.println("Para modifcicar ingrese...");
                                boolean sm;
                                System.out.println("ingrese numero de serie");
                                int numeroserie = leer.nextInt();
                                System.out.println("Ingrese precio ");
                                int precio = leer.nextInt();
                                System.out.println("Ingrese informacion");
                                String info = leer.nextLine();
                                info = leer.nextLine();
                                System.out.println("Ingrese como clasifica el producto(televisores,consolas,equipos de sonido,teatro en casa)");
                                String clas = leer.nextLine();
                                clas = clas.toLowerCase();
                                if (clas.equals("televisores")) {
                                    System.out.println("Ingrese tamaño");
                                    int tam = leer.nextInt();
                                    System.out.println("Es smart{s/n)");
                                    String s = leer.nextLine();
                                    s = leer.nextLine();
                                    s = s.toLowerCase();
                                    if (s.equals("s")) {
                                        sm = true;
                                    } else {
                                        sm = false;
                                    }
                                    System.out.println("Marca");
                                    String marca = leer.nextLine();
                                    System.out.println("ingrese cant de conexiones");
                                    int cantcont = leer.nextInt();
                                    System.out.println("Ingrese grosor");
                                    int grosor = leer.nextInt();
                                    listaarticulos.add(new televisores(tam, sm, cantcont, grosor, numeroserie, precio, Color.yellow, info));
                                } else if (clas.equals("consolas")) {
                                    System.out.println("Ingrese marca");
                                    String marca = leer.nextLine();
                                    System.out.println("Ingrese cantidad de alamcenamiento en Gb");
                                    int almacenamiento = leer.nextInt();
                                    System.out.println("Cantidad de controles");
                                    int cantcont = leer.nextInt();
                                    System.out.println("Numero de accesorios");
                                    int nacc = leer.nextInt();
                                    System.out.println("informacion de la tarjeta");
                                    String infot = leer.nextLine();
                                    listaarticulos.add(new consolas(marca, almacenamiento, cantcont, nacc, infot, numeroserie, precio, Color.BLACK, marca));
                                } else if (clas.equals("equipos de sonido")) {
                                    System.out.println("Cant altavoces");
                                    int alt = leer.nextInt();
                                    System.out.println("potencia maxima");
                                    int potencia = leer.nextInt();
                                    System.out.println("cantidad de puertos auxiliares");
                                    int cantpa = leer.nextInt();
                                    System.out.println("cantidad maxima de discos");
                                    int cantdmax = leer.nextInt();
                                    System.out.println("cantidad de puertos USB");
                                    int pusb = leer.nextInt();
                                    System.out.println("ingo grantia");
                                    String garantia = leer.nextLine();
                                    listaarticulos.add(new equiposonido(alt, potencia, cantpa, cantdmax, pusb, numeroserie, precio, Color.yellow, garantia));
                                } else if (clas.equals("teatros en casa")) {
                                    System.out.println("Cant altavoces");
                                    int alt = leer.nextInt();
                                    System.out.println("cantidad maxima de discos blue ray");
                                    int cantdmax = leer.nextInt();
                                    System.out.println("Informacion de limpieza");
                                    String infolim = leer.nextLine();
                                    System.out.println("Informacion lector");
                                    String infolec = leer.nextLine();
                                    System.out.println("ingo grantia");
                                    String garantia = leer.nextLine();
                                    listaarticulos.add(indice, new teatrosencasa(alt, cantdmax, infolim, infolec, numeroserie, precio, Color.yellow, garantia));
                                    listaarticulos.remove(indice + 1);
                                } else {
                                    System.out.println("clasificacion incorrecta");
                                }

                            }

                            break;
                            case 4: {
                                while (listaarticulos.size() <= 0) {
                                    System.out.println("no hay nada para eliminar");
                                }
                                String salida2 = "";
                                for (Object t : listaarticulos) {
                                    if (t instanceof articulos) {
                                        salida2 += listaarticulos.indexOf(t) + "- " + t + "\n";
                                    }
                                }
                                System.out.println(salida2);
                                System.out.println("Ingrese el indice del elemento a eliminar");
                                int indice = leer.nextInt();
                                listaarticulos.remove(indice);
                            }
                            break;
                            case 5: {
                                pos = "cajero";
                                System.out.println("Ingrese su usuario");
                                usuario = leer.nextLine();
                                System.out.println("Ingrese su contraseña");
                                contraseña = leer.nextLine();
                                empleados.add(new empleados(pos, usuario, contraseña));
                                System.out.println("Ingrese  nombre del cajero");
                                String nombre = leer.nextLine();
                                System.out.println("Ingrese apellido");
                                String apellido = leer.nextLine();
                                System.out.println("Ingrse el salario");
                                int salario = leer.nextInt();
                                System.out.println("Ingrese la nacionalidad");
                                String nacionalidad = leer.nextLine();
                                nacionalidad = leer.nextLine();
                                System.out.println("Ingrese cantidad de años trabajando");
                                int cantaños = leer.nextInt();
                                System.out.println("Ingrese horario");
                                String horario = leer.nextLine();
                                horario = leer.nextLine();
                                System.out.println("Ingrese hora de almuerzo");
                                int horaalmuerzo = leer.nextInt();
                                System.out.println("Ingrese meta a vender cada mes");
                                int meta = leer.nextInt();
                                System.out.println("Ingrese cantidad de empleados atendidos");
                                int cantem = leer.nextInt();
                                listacajeros.add(new cajero(nombre, apellido, salario, nacionalidad, cantaños, horario, horaalmuerzo, meta, cantem, pos, usuario, contraseña));
                            }
                            break;
                            case 6: {

                                pos = "supervisor";
                                System.out.println("Ingrese su usuario");
                                usuario = leer.nextLine();
                                System.out.println("Ingrese su contraseña");
                                contraseña = leer.nextLine();
                                empleados.add(new empleados(pos, usuario, contraseña));
                                System.out.println("Ingrese el nombre");
                                String nombre = leer.nextLine();
                                System.out.println("Ingrese el apellido");
                                String apellido = leer.nextLine();
                                System.out.println("Ingrse el  salario");
                                int salario = leer.nextInt();
                                System.out.println("Ingrese la nacionalidad");
                                String nacionalidad = leer.nextLine();
                                nacionalidad = leer.nextLine();
                                System.out.println("Ingrese cantidad de cajeros que supervisa");
                                int cantsupervisa = leer.nextInt();
                                System.out.println("Ingrse  salario promedio de los cajeros que supervisa");
                                double promsalario = leer.nextInt();
                                System.out.println("Ingrese  meta promedio del cajero que supervisa");
                                int meta = leer.nextInt();
                                listasupervisores.add(new supervisor(nombre, apellido, salario, nacionalidad, cantsupervisa, promsalario, pos, usuario, contraseña));

                            }
                            break;
                            case 7: {
                                pos = "asesor";
                                System.out.println("Ingrese su usuario");
                                usuario = leer.nextLine();
                                System.out.println("Ingrese su contraseña");
                                contraseña = leer.nextLine();
                                empleados.add(new empleados(pos, usuario, contraseña));
                                System.out.println("Ingrese el nombre");
                                String nombre = leer.nextLine();
                                System.out.println("Ingrese el apellido");
                                String apellido = leer.nextLine();
                                System.out.println("Ingrse el  salario");
                                int salario = leer.nextInt();
                                System.out.println("Ingrese la nacionalidad");
                                String nacionalidad = leer.nextLine();
                                nacionalidad = leer.nextLine();
                                System.out.println("Ingrese cantidad de clientes a los que ah atendido");
                                int cantaten = leer.nextInt();
                                System.out.println("Ingrse cantidad de productos comprados por susu clientes");
                                int cantcompras = leer.nextInt();
                                System.out.println("Ingrese numero de creditos concedidos");
                                int creditos = leer.nextInt();
                                listaasesores.add(new asesorfinanciero(nombre, apellido, salario, nacionalidad, cantaten, cantcompras, creditos, pos, usuario, contraseña));
                            }
                            break;
                            case 8: {
                                System.out.println("1)Agregar cliente");
                                System.out.println("2)eliminar cliente");
                                System.out.println("3)moficar");
                                System.out.println("4)listar");
                                int op5 = leer.nextInt();
                                switch (op5) {
                                    case 1: {
                                        System.out.println("Ingrese el nombre");
                                        String nombre = leer.nextLine();
                                        System.out.println("Ingrese el apellido");
                                        String apellido = leer.nextLine();
                                        System.out.println("Ingrse el  salario");
                                        int salario = leer.nextInt();
                                        System.out.println("Ingrese la nacionalidad");
                                        String nacionalidad = leer.nextLine();
                                        nacionalidad = leer.nextLine();
                                        System.out.println("Ingrese cantidad de credito a acceder");
                                        int cre = leer.nextInt();
                                        System.out.println("Articulos comprados previmente");
                                        String art = leer.nextLine();
                                        System.out.println("dirrecion");
                                        String dri = leer.nextLine();
                                        System.out.println("cantidad de compras realizadas");
                                        int cantcom = leer.nextInt();
                                        clientes.add(new clientes(nombre, apellido, salario, nacionalidad, cre, art, cantcom, dri));
                                    }
                                    break;
                                    case 2: {
                                        while (clientes.size() <= 0) {
                                            System.out.println("no hay elementos");
                                            break;
                                        }
                                        String salida2 = "";
                                        for (Object t : clientes) {
                                            if (t instanceof clientes) {
                                                salida2 += clientes.indexOf(t) + "- " + t + "\n";
                                            }
                                        }
                                        System.out.println("Clientes");
                                        System.out.println(salida2);
                                        System.out.println(" ingrese indice a eliminar ");
                                        int ind = leer.nextInt();
                                        clientes.remove(ind);

                                    }
                                    break;
                                    case 3: {
                                        while (clientes.size() <= 0) {
                                            System.out.println("no hay elementos");
                                            break;
                                        }
                                        String salida2 = "";
                                        for (Object t : clientes) {
                                            if (t instanceof clientes) {
                                                salida2 += clientes.indexOf(t) + "- " + t + "\n";
                                            }
                                        }
                                        System.out.println("Clientes");
                                        System.out.println(salida2);
                                        salida2 = "";
                                        System.out.println(" ingrese indice a modificar ");
                                        int ind = leer.nextInt();
                                        System.out.println("ingrese denuevo");
                                        System.out.println("Ingrese el nombre");
                                        String nombre = leer.nextLine();
                                        System.out.println("Ingrese el apellido");
                                        String apellido = leer.nextLine();
                                        System.out.println("Ingrse el  salario");
                                        int salario = leer.nextInt();
                                        System.out.println("Ingrese la nacionalidad");
                                        String nacionalidad = leer.nextLine();
                                        nacionalidad = leer.nextLine();
                                        System.out.println("Ingrese cantidad de credito a acceder");
                                        int cre = leer.nextInt();
                                        System.out.println("Articulos comprados previmente");
                                        String art = leer.nextLine();
                                        System.out.println("dirrecion");
                                        String dri = leer.nextLine();
                                        System.out.println("cantidad de compras realizadas");
                                        int cantcom = leer.nextInt();
                                        clientes.add(ind, new clientes(nombre, apellido, salario, nacionalidad, cre, art, cantcom, dri));
                                        clientes.remove(ind + 1);
                                        System.out.println("listo");
                                        for (Object t : clientes) {
                                            if (t instanceof clientes) {
                                                salida2 += clientes.indexOf(t) + "- " + t + "\n";
                                            }
                                        }
                                        System.out.println("Clientes");
                                        System.out.println(salida2);
                                    }
                                    break;
                                    case 4: {
                                        String salida2 = "";
                                        for (Object t : clientes) {
                                            if (t instanceof clientes) {
                                                salida2 += clientes.indexOf(t) + "- " + t + "\n";
                                            }
                                        }
                                        System.out.println("Clientes");
                                        System.out.println(salida2);
                                    }
                                    break;

                                }
                            }
                            break;
                        }

                        break;

                    }else{
                        System.out.println("error");
                    }
                }
                break;
                case 3:{
                    System.out.println("se salio del menu");
                }
                default:
                    System.out.println("opcion no valida");
            }
        }
    }
}
