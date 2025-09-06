package recetas;

import java.util.List;

public class FabricaRecetas {
    private final FabricaIngredientes fabricaIngredientes;
    private final FabricaInstrucciones fabricaInstrucciones;

    public FabricaRecetas(FabricaIngredientes fabricaIngredientes,
                          FabricaInstrucciones fabricaInstrucciones) {
        this.fabricaIngredientes = fabricaIngredientes;
        this.fabricaInstrucciones = fabricaInstrucciones;
    }

    public Receta crear(String titulo, List<Ingrediente> ingredientes, List<Instruccion> pasos) {
        return new Receta(titulo, ingredientes, pasos);
    }

    public FabricaIngredientes getFabricaIngredientes() { return fabricaIngredientes; }
    public FabricaInstrucciones getFabricaInstrucciones() { return fabricaInstrucciones; }
}
