package lab4;

import java.util.*;

public class Lab4 {

    static Scanner l = new Scanner(System.in);

    public static void main(String[] args) {
        int r = 1;
        while (r == 1) {
            switch (menu()) {
                case 1:
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
        System.out.print("Ingrese una opcion: ");
        int op = l.nextInt();
        System.out.println("");
        return op;
    }//Fin del metodo del menu
}//Fin del main
