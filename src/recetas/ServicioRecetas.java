package recetas;

import java.util.List;

public class ServicioRecetas {
    private final FabricaRecetas fabricaRecetas;

    public ServicioRecetas(FabricaRecetas fabricaRecetas) {
        this.fabricaRecetas = fabricaRecetas;
    }

    public Receta registrarReceta(String titulo, List<Ingrediente> ingredientes, List<Instruccion> pasos) {
        return fabricaRecetas.crear(titulo, ingredientes, pasos);
    }
}
