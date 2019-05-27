package logic.util;

import logic.lib.Grupo;

public class Lista {
    private class Nodo {
        private Nodo siguiente = null;
        private Grupo grupo;

        public Nodo(Grupo grupo) {
            this.grupo = grupo;
        }
    }

    private Nodo cima = null;
    private int numeroElementos = 0;

    public boolean estaVacia() {
        return cima == null;
    }

    public void agregarNodo(Grupo grupo) {
        Nodo nodo = new Nodo(grupo);
        nodo.siguiente = cima;
        cima = nodo;
        numeroElementos++;
    }

    public void eliminar() {
        if(!estaVacia()){
            cima = cima.siguiente;
            numeroElementos--;
        }
    }

    public String imprimirLista() {
        Nodo auxiliar = cima;
        StringBuilder listaPersonas = new StringBuilder();
        while (auxiliar != null) {
            listaPersonas.append(auxiliar.grupo.toString()).append("\n");
            auxiliar = auxiliar.siguiente;
        }
        return listaPersonas.toString();
    }
}
