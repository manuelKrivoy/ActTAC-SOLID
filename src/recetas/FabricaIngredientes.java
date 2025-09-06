package recetas;

import java.math.BigDecimal;

public interface FabricaIngredientes {
    Ingrediente crear(String nombre, BigDecimal cantidad, Unidad unidad);
}
