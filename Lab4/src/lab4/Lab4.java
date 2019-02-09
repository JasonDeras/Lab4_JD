package lab4;

import java.awt.Color;
import java.text.ParseException;
import java.util.*;
import jdk.nashorn.internal.parser.TokenType;

public class Lab4 {

    static Scanner l = new Scanner(System.in);
    static int pos;

    static String descripcion, nombreVictima, culpable, sentencia, pais;
    static Date fecha;
    static int nDelito;
    static String policia, Idpolicia;
    static int nCelda, estado;
    static int gravedad;
    static String edificacion;
    static int n_pisos;
    static String nombreD;
    static String objetoHurtado;
    static int valor;
    static String nombreSolicitante;
    static String arma;
    static int nCuerpos;
    static String artefacto;
    static int victimas;
    static int edadVictima;
    static int tiempo_ret;
    static String devuelto;
    static String drogas;
    static int cantidad;

    static ArrayList Criminales = new ArrayList();
    static ArrayList Agentes = new ArrayList();
    static ArrayList Crimines = new ArrayList();

    public static void main(String[] args) throws ParseException {
        int r = 1;
        while (r == 1) {
            int opcion;
            switch (menu()) {
                case 1:
                    try {
                        System.out.println("Ingrese \n"
                                + "[1] para agregar delitos\n"
                                + "[2] agregar criminales\n"
                                + "[3] agragr agentes\n");
                        opcion = l.nextInt();
                        valida(Integer.toString(opcion));
                    } catch (Nuestra_Exception e) {
                        System.out.println(e.getMessage());
                    }//Fin de la exception creada
                    opcion = l.nextInt();
                    switch (opcion) {
                        case 1:
                            try {
                                System.out.println("Ingrese delito\n"
                                        + "[1] delito menor\n"
                                        + "[2] delito grave: ");
                                opcion = l.nextInt();
                                valida(Integer.toString(opcion));
                            } catch (Nuestra_Exception e) {
                                System.out.println(e.getMessage());
                            }//Fin de la exception creada
                            opcion = l.nextInt();
                            System.out.println("Ingrese descripcion:");
                            descripcion = l.next();
                            System.out.println("Ingrese nombre de la victima: ");
                            nombreVictima = l.next();
                            try {
                                System.out.println("Ingrese\n"
                                        + "[1] si es culpable\n"
                                        + "[2] caso contrario: ");
                                estado = l.nextInt();
                                valida(Integer.toString(estado));
                            } catch (Nuestra_Exception e) {
                                System.out.println(e.getMessage());
                            }//Fin de la exception creada
                            estado = l.nextInt();
                            if (estado == 1) {
                                System.out.println("Si es culpable");
                                culpable = "si";
                            } else if (estado == 2) {
                                System.out.println("no es culpable");
                                culpable = "no";
                            }
                            try {
                                System.out.println("Ingrese sentencia\n"
                                        + "[1] años \n"
                                        + "[2] pena de muerte: ");
                                estado = l.nextInt();
                                valida(Integer.toString(estado));
                            } catch (Nuestra_Exception e) {
                                System.out.println(e.getMessage());
                            }//Fin de la exception creada
                            estado = l.nextInt();
                            if (estado == 1) {
                                System.out.println("Sentencia: años");
                                sentencia = "años";
                            } else if (estado == 2) {
                                System.out.println("Sentencia: pena de muerte");
                                sentencia = "pena de muerte";
                            }
                            fecha = new Date();
                            System.out.println("Ingrese pais: ");
                            pais = l.next();
                            System.out.println("Ingrese numero de delito: ");
                            nDelito = l.nextInt();

                            switch (opcion) {//opciones de kill
                                case 1://delito menor
                                    System.out.println("Ingrese nombre de policia: ");
                                    policia = l.next();
                                    System.out.println("Ingrese id policia: ");
                                    Idpolicia = l.next();
                                    System.out.println("Ingrese numero de celda: ");
                                    nCelda = l.nextInt();
                                    try {
                                        System.out.println("Ingrese \n"
                                                + "[1] para vandalismo\n"
                                                + "[2] hurto\n"
                                                + "[3] prostitucion: ");
                                        opcion = l.nextInt();
                                        valida(Integer.toString(opcion));
                                    } catch (Nuestra_Exception e) {
                                        System.out.println(e.getMessage());
                                    }//Fin de la exception creada
                                    switch (opcion) {
                                        case 1://vandalismo
                                            System.out.println("Ingrese edificacion: ");
                                            edificacion = l.next();
                                            System.out.println("Ingrese numero de pisos:");
                                            n_pisos = l.nextInt();
                                            break;//fin vandalismo

                                        case 2://hurto
                                            System.out.println("Ingrese objeto hurtado: ");
                                            objetoHurtado = l.next();
                                            try {
                                                System.out.println("Ingrese valor: ");
                                                valor = l.nextInt();
                                                valida(Integer.toString(valor));
                                            } catch (Nuestra_Exception e) {
                                                System.out.println(e.getMessage());
                                            }//Fin de la exception creada
                                            valor = l.nextInt();
                                            break;//fin hurto

                                        case 3://prostitucion
                                            System.out.println("Ingrese nombre solicitante:");
                                            nombreSolicitante = l.next();
                                            break;//fin prostitucion

                                    }//Fin de las opciones del delito menor
                                    Crimines.add(new Delito_Menor(policia, Idpolicia, nCelda, descripcion, nombreVictima, culpable, sentencia, pais, fecha, nDelito));
                                    break;//fin delito menor

                                case 2: //delito grave:
                                    System.out.println("Ingrese nivel de gravedad(1-5): ");
                                    gravedad = l.nextInt();
                                    try {
                                        System.out.println("Ingrese \n"
                                                + "[1] para terrorismo\n"
                                                + "[2] asesinato\n"
                                                + "[3] violacion\n"
                                                + "[4] secuestro\n"
                                                + "[5] trafico de drogas");
                                        opcion = l.nextInt();
                                        valida(Integer.toString(opcion));
                                    } catch (Nuestra_Exception e) {
                                        System.out.println(e.getMessage());
                                    }//Fin de la exception creada
                                    opcion = l.nextInt();
                                    switch (opcion) {
                                        case 1://terrorismo
                                            System.out.println("Ingrese artefacto:");
                                            artefacto = l.next();
                                            System.out.println("Ingrese numero de victimas: ");
                                            victimas = l.nextInt();
                                            break;

                                        case 2: //asesinato
                                            System.out.println("Ingrese arma: ");
                                            arma = l.next();
                                            System.out.println("Ingrese numero de cuerpos: ");
                                            nCuerpos = l.nextInt();
                                            break;

                                        case 3://violacion
                                            System.out.println("Ingrese edad victima: ");
                                            edadVictima = l.nextInt();
                                            break;

                                        case 4://secuestro
                                            System.out.println("Ingrese tiempo retenido: ");
                                            tiempo_ret = l.nextInt();
                                            try {
                                                System.out.println("Ingrese como fue devuelto \n"
                                                        + "[1] vivo\n"
                                                        + "[2] muerto");
                                                estado = l.nextInt();
                                                valida(Integer.toString(estado));
                                            } catch (Nuestra_Exception e) {
                                                System.out.println(e.getMessage());
                                            }//Fin de la exception creada
                                            estado = l.nextInt();
                                            if (estado == 1) {
                                                System.out.println("devuelto vivo");
                                                devuelto = "vivo";
                                            } else if (estado == 2) {
                                                System.out.println("devuelto muerto");
                                                devuelto = "muerto";
                                            }
                                            break;
                                        case 5://trafico de drogas
                                            System.out.println("Ingrese nombre de droga: ");
                                            drogas = l.next();
                                            System.out.println("Ingrese catidad: ");
                                            cantidad = l.nextInt();
                                            break;//fin trafico de drogas
                                    }
                                    Crimines.add(new Delito_Menor(policia, Idpolicia, nCelda, descripcion, nombreVictima, culpable, sentencia, pais, fecha, nDelito));
                                    break;//fin delito grave
                            }//opciones de kill
                        case 2:
                            System.out.println("Ingrese nombre");
                            String nombre = l.next();
                            try {
                                System.out.println("Ingrese Edad");
                                int edad = l.nextInt();
                                valida(Integer.toString(edad));
                            } catch (Nuestra_Exception e) {
                                System.out.println(e.getMessage());
                            }//Fin de la exception creada
                            int edad = l.nextInt();
                            System.out.println("Ingrese Genero");
                            String genero = l.next();
                            System.out.println("Ingrese pais");
                            pais = l.next();
                            System.out.println("Encarscelado 1-.Si,2.-No: ");
                            int enca = l.nextInt();
                            String care = "";
                            if (enca == 1) {
                                care = "Encarcelado";
                            } else if (enca == 2) {
                                care = "Libre";
                            } else {
                                System.out.println("Opcion no valida\n");
                            }
                            System.out.println("Ingrese descripcion fisica");
                            String descrip = l.next();
                            Criminales.add(new Criminales(nombre, genero, pais, care, descripcion));
                            break;
                        case 3:
                            try {
                                System.out.println("Ingrese como fue Clasificacion \n"
                                        + "[1] Terrorsita\n"
                                        + "[2] Asesino\n"
                                        + "[3] Secuestrador");
                                opcion = l.nextInt();
                                valida(Integer.toString(opcion));
                            } catch (Nuestra_Exception e) {
                                System.out.println(e.getMessage());
                            }//Fin de la exception creada
                            opcion = l.nextInt();
                            switch (opcion) {
                                case 1://terrorista
                                    System.out.println("Ingrese pais");
                                    pais = l.next();
                                    System.out.println("Ingrese ciudad de ataque: ");
                                    String ciudad = l.next();
                                    System.out.println("Ingrese metodo");
                                    String metodo = l.next();
                                    Agentes.add(new Terrorista(ciudad, metodo, pais));
                                    break;
                                case 2://Asesino
                                    System.out.println("Ingrese nombre de la victima");
                                    nombreVictima = l.next();
                                    System.out.println("Ingrese el arma");
                                    String arma = l.next();
                                    Agentes.add(new Asesino(nombreVictima, arma));
                                    break;
                                case 3://Secuestrador
                                    System.out.println("Ingrese nombre de la victima");
                                    nombreVictima = l.next();
                                    System.out.println("Ingrese cantiad por el rescate");
                                    int pago = l.nextInt();
                                    Agentes.add(new Secuestrador(nombreD, pago));
                                    break;
                                default:
                                    System.out.println("Agente no valido\n");
                            }//Fin del switch de los agentes
                            System.out.println("");
                            System.out.println("");
                            break;
                        default:
                            System.out.println("Opcion no valida");
                    }//Fin del swtich de agregar
                    break;
                case 2:
                    break;
                case 3:
                    System.out.print("Ingrese una posicion a eliminar: ");
                    pos = l.nextInt();
                    System.out.println("1. Eliminar Criminales");
                    System.out.println("2. Eliminar Agentes");
                    System.out.println("3. Eliminar Crimines\n");
                    System.out.print("Ingrese una opcion: ");
                    int op2 = l.nextInt();
                    switch (op2) {
                        case 1:
                            Agentes.remove(pos);
                            break;
                        case 2:
                            Criminales.remove(pos);
                            break;
                        case 3:
                            Crimines.remove(pos);
                            break;
                        default:
                            System.out.println("Opcion no valida");
                    }//Fin del swtich de la eliminacion
                    System.out.println("");
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("1. Listar criminales");
                    System.out.println("2. Listar Agentes");
                    System.out.println("3. Listar Crimines\n");
                    System.out.print("Ingrese una opcion: ");
                    int op3 = l.nextInt();
                    switch (op3) {
                        case 1:
                            System.out.println("Lista Crimnales");
                            for (int i = 0; i < Criminales.size(); i++) {
                                System.out.println(i + "= " + Criminales.get(i));
                            }//Fin del for que lista los criminales
                            System.out.println("");
                            System.out.println("");
                            break;
                        case 2:
                            System.out.println("Lista Agentes");
                            for (int i = 0; i < Agentes.size(); i++) {
                                System.out.println(i + "= " + Agentes.get(i));
                            }//Fin del for que lista los criminales
                            System.out.println("");
                            System.out.println("");
                            break;
                        case 3:
                            System.out.println("Lista Crimines");
                            for (int i = 0; i < Crimines.size(); i++) {
                                System.out.println(i + "= " + Crimines.get(i));
                            }//Fin del for que lista los criminales
                            System.out.println("");
                            System.out.println("");
                            break;
                        default:
                            System.out.println("Opcion de listado no valida\n");
                    }//Fin del switch de las listas
                    break;
                default:
                    System.out.println("Opcion no valida\n");
            }//Fin del switch del menu
            System.out.print("¿Volver al menu?1.-Si,2.-No: ");
            r = l.nextInt();
            System.out.println("");
        }//Fin del while del menu
    }//Fin del main

    static int menu() {

        System.out.println("1. Crear");
        System.out.println("2. Modificar");
        System.out.println("3. Eliminar");
        System.out.println("4. Listar\n");
        System.out.print("Ingrese una opcion: ");
        int op = l.nextInt();
        System.out.println("");
        try {
            valida(Integer.toString(op));
        } catch (Nuestra_Exception e) {
            System.out.println(e.getMessage());
        }
        return op;
    }//Fin del metodo del menu

    static void valida(String op) throws Nuestra_Exception {
        if (!op.equalsIgnoreCase("1") || !op.equalsIgnoreCase("2") || !op.equalsIgnoreCase("3") || !op.equalsIgnoreCase("4") || !op.equalsIgnoreCase("5")) {
            throw new Nuestra_Exception(Color.red, "No se aceptan negativos");
        }
    }//Fin de la validacion de letra como numero en el menu

}//Fin del main
