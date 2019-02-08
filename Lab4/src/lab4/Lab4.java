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
    static int contC = 0;
    static int contA = 0;
    static int contCr = 0;


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
                            switch(opcion){//opciones de kill
                                case 1://delito menor
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
                                    switch(opcion){
                                        case 1://vandalismo
                                            System.out.println("Ingrese edificacion: ");
                                            edificacion=l.next();
                                            System.out.println("Ingrese numero de pisos:");
                                            n_pisos=l.nextInt();
                                            break;//fin vandalismo

                                        case 2://hurto
                                            System.out.println("Ingrese objeto hurtado: ");
                                            objetoHurtado=l.next();
                                            System.out.println("Ingrese valor: ");
                                            valor=l.nextInt();
                                            break;//fin hurto

                                        case 3://prostitucion
                                            System.out.println("Ingrese nombre solicitante:");
                                            nombreSolicitante=l.next();
                                            break;//fin prostitucion
                                    }
                                    break;//fin delito menor
                                    
                                case 2: //delito grave:
                                    System.out.println("Ingrese nivel de gravedad(1-5): ");
                                    gravedad=l.nextInt();
                                    System.out.println("Ingrese \n"
                                            + "[1] para terrorismo\n"
                                            + "[2] asesinato\n"
                                            + "[3] violacion\n"
                                            + "[4] secuestro\n"
                                            + "[5] trafico de drogas");
                                    opcion=l.nextInt();
                                    switch (opcion){
                                        case 1://terrorismo
                                            System.out.println("Ingrese artefacto:");
                                            artefacto=l.next();
                                            System.out.println("Ingrese numero de victimas: ");
                                            victimas=l.nextInt();
                                            break;
                                            
                                        case 2: //asesinato
                                            System.out.println("Ingrese arma: ");
                                            arma=l.next();
                                            System.out.println("Ingrese numero de cuerpos: ");
                                            nCuerpos=l.nextInt();
                                            break;
                                            
                                        case 3://violacion
                                            System.out.println("Ingrese edad victima: ");
                                            edadVictima =l.nextInt();
                                            break;
                                            
                                        case 4://secuestro
                                            System.out.println("Ingrese tiempo retenido: ");
                                            tiempo_ret=l.nextInt();
                                            System.out.println("Ingrese como fue devuelto \n"
                                                    + "[1] vivo\n"
                                                    + "[2] muerto");
                                            estado=l.nextInt();
                                            if (estado==1){
                                                System.out.println("devuelto vivo");
                                                devuelto="vivo";
                                            }
                                            else if (estado==2){
                                                System.out.println("devuelto muerto");
                                                devuelto="muerto";
                                            }
                                            break;
                                        case 5://trafico de drogas
                                            System.out.println("Ingrese nombre de droga: ");
                                            drogas=l.next();
                                            System.out.println("Ingrese catidad: ");
                                            cantidad=l.nextInt();
                                            break;//fin trafico de drogas
                                    }
                                    break;//fin delito grave
                            }
                            
                    }
                    
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
