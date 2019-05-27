package logic.lib;

import java.util.ArrayList;
import java.util.List;

public class Grupo<T> {
    private Integer id;
    private static int idContador = 0;
    private String nombre;
    private List<T> elementos;

    // Constructor para elementos sin grupo
    public Grupo() {
        this.id = idContador++;
        this.nombre = "Sin Grupo";
        elementos = new ArrayList<>();
    }

    // Constructor para elementos con grupo
    public Grupo(String nombre) {
        this.id = idContador++;
        this.nombre = nombre;
        elementos = new ArrayList<>();
    }

    public void agregarContacto(T elemento) {
        elementos.add(elemento);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<T> getElementos() {
        return elementos;
    }

    public void setElementos(List<T> elementos) {
        this.elementos = elementos;
    }

    @Override
    public String toString() {
        return String.format("ID de Grupo: %d [%s]", id, nombre);
    }
}
