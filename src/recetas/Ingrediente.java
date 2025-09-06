package recetas;

import java.util.Objects;

public class Ingrediente {
    private final String nombre;
    private final Cantidad cantidad;

    public Ingrediente(String nombre, Cantidad cantidad) {
        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("El nombre del ingrediente es obligatorio");
        }
        this.nombre = nombre.trim();
        this.cantidad = Objects.requireNonNull(cantidad, "La cantidad es obligatoria");
    }

    public String getNombre() { return nombre; }
    public Cantidad getCantidad() { return cantidad; }
}
