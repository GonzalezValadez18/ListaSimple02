/*
 * GONZALEZ VALADEZ JOSE LEONARDO
 * 3S11
 * 
 */
package nodosactividad;


import java.util.Scanner;

public class Lista {
    protected Nodo inicio,fin;
    public Lista(){
        inicio = null;
        fin = null;
    }
public void agregarInicio(String elemento){
    Scanner sc= new Scanner (System.in);    
    elemento=sc.nextLine();
    inicio=new Nodo(elemento, inicio);
        if(fin==null){
            fin=inicio;
        }
    }
    public void mostrarLista(){
        Nodo aux=inicio;
        while(aux!=null){
            System.out.print("-["+aux.dato+"]");
            aux=aux.siguiente;
        }
        System.out.print("-\n");
    }
    public String eliminarPrimero(){
        String elemento=inicio.dato;
        if(inicio==fin){
            inicio=null;
            fin=null;
        }else{
           inicio=inicio.siguiente;
        }
        return elemento;
    }
    public String eliminarUltimo(){
        String elemento=fin.dato;
        if (inicio==fin) {
            inicio=fin=null;
        }else{
            Nodo temporal=inicio;
            while(temporal.siguiente!=fin){
                temporal=temporal.siguiente;
            }
            fin=temporal;
            fin.siguiente=null;
        }
        return elemento;
    }
}
