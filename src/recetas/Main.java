package recetas;

import java.math.BigDecimal;
import java.time.Duration;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Inyección manual
        FabricaIngredientes fabricaIng = new FabricaIngredientesBasica();
        FabricaInstrucciones fabricaIns = new FabricaInstruccionesBasica();
        FabricaRecetas fabricaRecetas = new FabricaRecetas(fabricaIng, fabricaIns);
        ServicioRecetas servicio = new ServicioRecetas(fabricaRecetas);

        Ingrediente harina = fabricaIng.crear("Harina 0000", new BigDecimal("250"), Unidad.GRAMO);
        Ingrediente leche = fabricaIng.crear("Leche", new BigDecimal("300"), Unidad.MILILITRO);
        Ingrediente huevo = fabricaIng.crear("Huevo", new BigDecimal("2"), Unidad.UNIDAD);

        Instruccion paso1 = fabricaIns.crear("Mezclar harina y leche hasta integrar.", Duration.ofMinutes(2));
        Instruccion paso2 = fabricaIns.crear("Agregar los huevos y batir.", Duration.ofMinutes(3));
        Instruccion paso3 = fabricaIns.crear("Cocinar en sartén caliente.", Duration.ofMinutes(5));

        Receta panqueques = servicio.registrarReceta(
                "Panqueques clásicos",
                List.of(harina, leche, huevo),
                List.of(paso1, paso2, paso3)
        );

        System.out.println("Receta: " + panqueques.getTitulo());
        panqueques.getIngredientes().forEach(i ->
                System.out.println("- " + i.getNombre() + " " + i.getCantidad().getValor() + " " + i.getCantidad().getUnidad()));
    }
}
