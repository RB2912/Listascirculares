package org.example;

public class ListaEnlazada {
    Nodo cabeza;

    public ListaEnlazada() {
        this.cabeza = null;
    }

    public boolean tieneCiclo() {
        Nodo tortuga = cabeza;
        Nodo liebre = cabeza;

        while (liebre != null && liebre.siguiente != null) {
            tortuga = tortuga.siguiente;
            liebre = liebre.siguiente.siguiente;
            if (tortuga == liebre) {
                return true;
            }
        }
        return false;
    }

    public void añadirNodo(int valor) {
        Nodo nuevoNodo = new Nodo(valor);
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            Nodo actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevoNodo;
        }
    }

    public void crearCiclo(int pos) {
        Nodo finalNodo = cabeza;
        Nodo inicioCiclo = cabeza;
        int contador = 0;

        while (finalNodo.siguiente != null) {
            finalNodo = finalNodo.siguiente;
            if (contador < pos) {
                inicioCiclo = inicioCiclo.siguiente;
                contador++;
            }
        }

        if (pos != -1) {
            finalNodo.siguiente = inicioCiclo;
        }
    }
}
