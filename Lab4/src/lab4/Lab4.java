package lab4;

import java.util.*;

public class Lab4 {

    static Scanner l = new Scanner(System.in);
    static int pos;
    static String descripcion, nombreVictima, culpable, sentencia, pais;
    static Date fecha;
    static int nDelito;
    static String policia, Idpolicia;
    static int nCelda, estado;
    static int gravedad;

    public static void main(String[] args) {
        int r = 1;
        while (r == 1) {
            int opcion;
            switch (menu()) {
                case 1:
                    System.out.println("Ingrese \n"
                            + "[1] para agregar delitos\n"
                            + "[2] agregar criminales\n"
                            + "[3] agregar agentes:");
                    opcion=l.nextInt();
                    switch(opcion){
                        case 1:
                            System.out.println("Ingrese delito\n"
                                    + "[1] delito menor\n"
                                    + "[2] delito grave: ");
                            opcion=l.nextInt();
                            System.out.println("Ingrese descripcion:");
                                    descripcion=l.next();
                                    System.out.println("Ingrese nombre de la victima: ");
                                    nombreVictima=l.next();
                                    System.out.println("Ingrese\n"
                                            + "[1] si es culpable\n"
                                            + "[2] caso contrario: ");
                                    estado=l.nextInt();
                                    if (estado==1){
                                        System.out.println("Si es culpable");
                                        culpable="si";
                                    }
                                    else if (estado==2){
                                        System.out.println("no es culpable");
                                        culpable="no";
                                    }
                                    System.out.println("Ingrese sentencia\n"
                                            + "[1] años \n"
                                            + "[2] pena de muerte: ");
                                    estado=l.nextInt();
                                    if (estado==1){
                                        System.out.println("Sentencia: años");
                                        sentencia="años";
                                    }
                                    else if (estado==2){
                                        System.out.println("Sentencia: pena de muerte");
                                        sentencia="pena de muerte";
                                    }
                                    fecha=new Date();
                                    System.out.println("Ingrese pais: ");
                                    pais=l.next();
                                    System.out.println("Ingrese numero de delito: ");
                                    nDelito=l.nextInt();
                            switch(opcion){
                                case 1:
                                    System.out.println("Ingrese nombre de policia: ");
                                    policia=l.next();
                                    System.out.println("Ingrese id policia: ");
                                    Idpolicia=l.next();
                                    System.out.println("Ingrese numero de celda: ");
                                    nCelda=l.nextInt();
                                    System.out.println("Ingrese \n"
                                            + "[1] para vandalismo\n"
                                            + "[2] hurto\n"
                                            + "[3] prostitucion: ");
                                    opcion=l.nextInt();
                                case 1:
                                    System.out.println("Ingrese edificacion: ");
                                    edificacion=l.next();
                                    System.out.println("Ingrese numero de pisos:");
                                    nPisos=l.nextInt();
                                case 2:
                                    System.out.println("");
                            }
                            
                    }
                    
                    break;
                case 2:
                    break;
                case 3:
                    System.out.print("Ingrese una posicion a elimnar: ");
                    pos=l.nextInt();
                    break;
                case 4:
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
