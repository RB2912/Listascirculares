package org.example;

public class Main {
    public static void main(String[] args) {
        ListaEnlazada lista = new ListaEnlazada();
        lista.añadirNodo(3);
        lista.añadirNodo(2);
        lista.añadirNodo(0);
        lista.añadirNodo(-4);

        // Crear un ciclo para pruebas
        lista.crearCiclo(1);
        System.out.println("¿La lista tiene un ciclo? " + lista.tieneCiclo());

        // Lista sin ciclo
        ListaEnlazada listaSinCiclo = new ListaEnlazada();
        listaSinCiclo.añadirNodo(1);
        System.out.println("¿La lista sin ciclo tiene un ciclo? " + listaSinCiclo.tieneCiclo());
    }
}

