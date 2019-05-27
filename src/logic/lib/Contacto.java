package logic.lib;

public class Contacto {
    private Integer id;
    private static int idContador = 0;
    private String nombre;
    private Long telefono;

    public Contacto(String nombre, Long telefono) {
        this.id = idContador++;
        this.nombre = nombre;
        this.telefono = telefono;
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

    public Long getTelefono() {
        return telefono;
    }

    public void setTelefono(Long telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return String.format("ID: %d [%s - %d]", id, nombre, telefono);
    }
}
