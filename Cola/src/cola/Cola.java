/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cola;

import java.util.NoSuchElementException;

/**
 *
 * @author matychp
 * @param <P>
 */
public class Cola<P extends Comparable> {

    private Node<P> frente, fondo;

    public Cola() {
        frente = null;
        fondo = null;
    }

    /**
     * Inserta un objeto al fondo de la Cola.
     * @param unInfo El dato a almacenar
     */
    public void push(P unInfo) {
        if (fondo == null) {
            Node<P> unNuevoNodo = new Node<>(unInfo, null);
            fondo = unNuevoNodo;
            frente = unNuevoNodo;
        } else {
            Node<P> unNuevoNodo = new Node<>(unInfo, fondo);
            frente.setNext(unNuevoNodo);
            fondo = unNuevoNodo;
        }
    }
    /**
     * Remueve el primer elemento de la pila sin retornarlo.
     */
    public void remove(){//No existe en Stack de Java
        if(frente != null){
            frente = frente.getNext();
        }
    }
    /**
     * Remueve el objeto del frente de la cola retornandolo.
     * @return el objeto del frente de la cola.
     */
    public P pop(){
        if(frente == null){
            throw new NoSuchElementException();
        }
        else{
            P infoARetornar = frente.getInfo();
            frente = frente.getNext();
            return infoARetornar;
        }
    }
    /**
     * Devuelve si la pila esta vacia o no.
     * @return true si la pila esta vacia, else si no lo está.
     */
    public boolean empty(){
        return frente == null;
    }
    /**
     * Utiliza el metodo advance() para recorrer la pila recursivamente
     * Este devuelve un String con todos los info's de los nodos.
     * @return el contenido de todos los info's de la pila, desde el primer elemento hasta el ultimo.
     */
    @Override
    public String toString(){
        return advance(frente);
    }
    /*
    //Este advance muestra desde el fondo de la pila hasta el elemento del frente.
    public String advance(Node<P> unNodo){
        if(unNodo.getNext() != null){//Pregunto si el siguiente tiene un nodo más.
            System.out.println(advance(unNodo.getNext()));
            //return unNodo.getInfo().toString() + "\n" + r;
        }
        return unNodo.getInfo().toString();
    }
    //*/
    
    /**
     * Avanza desde el primer elemento de la pila hasta el ultimo, 
     * y luego empieza a acumular en el String r los info de esos Nodos.
     * @param unNodo
     * @return String r con todos los info's de los nodos de la Pila.
     */
    public String advance(Node<P> unNodo){
        if(unNodo.getNext() != null){//Pregunto si el siguiente tiene un nodo más.
            String r = advance(unNodo.getNext());
            return unNodo.getInfo().toString() + "\n" + r;
        }
        return unNodo.getInfo().toString();
    }
}

