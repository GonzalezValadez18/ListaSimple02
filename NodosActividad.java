/*
 * GONZALEZ VALADEZ JOSE LEONARDO
 * 3S11
 * 
 */
package nodosactividad;

import java.util.Scanner;

public class NodosActividad {

    public static void main(String[] args) {
   Scanner sc = new Scanner (System.in);
           Lista lista = new Lista();
        int opcion;
        String ele = null;
       do{
           System.out.println("***************LISTA ENLAZADA SIMPLE***************");           
               System.out.println("------1. [ Agregar ]--------------\n"
                                + "------2. [ Mostrar ]--------------\n"
                                + "------3. [ Eliminar Primero ]-----\n"
                                + "------4. [ Eliminar Ultimo] ------\n"
                                + "------5. [ Salir ]----------------");
               System.out.println("Selecciona un numero de la accion a realizar :");
               switch (opcion=sc.nextInt()){
                   case 1:
                           System.out.println("Ingresa un dato");
                           lista.agregarInicio(ele);
                       break;
                       case 2:
                           if(lista.inicio!=null){
                           System.out.println("La lista contiene estos datos");
                           lista.mostrarLista();
                           }else{
                               System.out.println("La lista no contiene datos");
                           }
                       break;
                       case 3:
                           if(lista.inicio!=null){
                           System.out.println("Se elimino el dato del principio: ["+lista.inicio.dato+"]");
                           lista.eliminarPrimero();
                           }else{
                               System.out.println("La lista esta vacia");
                           }
                       break;
                       case 4:
                           if(lista.inicio!=null){
                           System.out.println("Se elimino el dato del final: ["+lista.fin.dato+"]");
                           lista.eliminarUltimo();
                           }else{
                               System.out.println("La lista esta vacia");
                           }
                           break;
                        
               }
           
       }while(opcion!=5);
    }}