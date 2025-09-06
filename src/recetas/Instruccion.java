package recetas;

import java.time.Duration;
import java.util.Optional;

public class Instruccion {
    private final String descripcion;
    private final Duration tiempoEstimado; // opcional

    public Instruccion(String descripcion) {
        this(descripcion, null);
    }

    public Instruccion(String descripcion, Duration tiempoEstimado) {
        if (descripcion == null || descripcion.isBlank()) {
            throw new IllegalArgumentException("La descripción de la instrucción es obligatoria");
        }
        this.descripcion = descripcion.trim();
        this.tiempoEstimado = tiempoEstimado;
    }

    public String getDescripcion() { return descripcion; }
    public Optional<Duration> getTiempoEstimado() { return Optional.ofNullable(tiempoEstimado); }
}
