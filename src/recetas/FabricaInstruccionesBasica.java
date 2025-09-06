package recetas;

import java.time.Duration;

public class FabricaInstruccionesBasica implements FabricaInstrucciones {
    @Override
    public Instruccion crear(String descripcion) {
        return new Instruccion(descripcion);
    }

    @Override
    public Instruccion crear(String descripcion, Duration tiempoEstimado) {
        return new Instruccion(descripcion, tiempoEstimado);
    }
}
