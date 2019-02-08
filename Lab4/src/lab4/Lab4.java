package lab4;

import java.util.*;

public class Lab4 {

    static Scanner l = new Scanner(System.in);
    static int pos;
    private ArrayList Criminales = new ArrayList();
    private ArrayList Agentes = new ArrayList();
    private ArrayList Crimines = new ArrayList();
    static int contC = 0;
    static int contA = 0;
    static int contCr = 0;

    public static void main(String[] args) {
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
                    break;
                case 4:
                    System.out.println("1. Listar criminales");
                    System.out.println("2. Listar Agentes");
                    System.out.println("3. Listar Crimines");
                    System.out.print("Ingrese una opcion: ");
                    int op2 = l.nextInt();
                    switch (op2) {
                        case 1:
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        default :
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
        return op;
    }//Fin del metodo del menu
}//Fin del main
