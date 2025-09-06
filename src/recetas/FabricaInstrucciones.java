package recetas;

import java.time.Duration;

public interface FabricaInstrucciones {
    Instruccion crear(String descripcion);
    Instruccion crear(String descripcion, Duration tiempoEstimado);
}
