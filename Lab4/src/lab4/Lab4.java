package lab4;

import java.awt.Color;
import java.text.ParseException;
import java.util.*;

public class Lab4 {

    static Scanner l = new Scanner(System.in);
    static int pos;
    static ArrayList<Criminales> Criminales = new ArrayList();
    static ArrayList<Agentes> Agentes = new ArrayList();
    static ArrayList Crimines = new ArrayList();
    static int contC = 0;
    static int contA = 0;
    static int contCr = 0;

    public static void main(String[] args) throws ParseException {
        int r = 1;
        while (r == 1) {
            switch (menu()) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    System.out.print("Ingrese una posicion a elimnar: ");
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
        if (!op.equalsIgnoreCase("1") || !op.equalsIgnoreCase("2") || !op.equalsIgnoreCase("3") || !op.equalsIgnoreCase("3")) {
            throw new Nuestra_Exception(Color.red, "No se aceptan negativos");
        }
    }//Fin de la validacion de letra como numero en el menu

}//Fin del main
