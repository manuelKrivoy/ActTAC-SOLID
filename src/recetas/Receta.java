package recetas;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Receta {
    private final String titulo;
    private final List<Ingrediente> ingredientes;
    private final List<Instruccion> pasos;

    public Receta(String titulo, List<Ingrediente> ingredientes, List<Instruccion> pasos) {
        if (titulo == null || titulo.isBlank()) {
            throw new IllegalArgumentException("El título de la receta es obligatorio");
        }
        this.titulo = titulo.trim();
        this.ingredientes = List.copyOf(Objects.requireNonNull(ingredientes, "Lista de ingredientes obligatoria"));
        this.pasos = List.copyOf(Objects.requireNonNull(pasos, "Lista de pasos obligatoria"));
        if (this.ingredientes.isEmpty()) throw new IllegalArgumentException("La receta debe tener al menos 1 ingrediente");
        if (this.pasos.isEmpty()) throw new IllegalArgumentException("La receta debe tener al menos 1 paso");
    }

    public String getTitulo() { return titulo; }
    public List<Ingrediente> getIngredientes() { return Collections.unmodifiableList(ingredientes); }
    public List<Instruccion> getPasos() { return Collections.unmodifiableList(pasos); }
}
