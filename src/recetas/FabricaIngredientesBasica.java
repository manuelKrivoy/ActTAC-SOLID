package recetas;

import java.math.BigDecimal;

public class FabricaIngredientesBasica implements FabricaIngredientes {
    @Override
    public Ingrediente crear(String nombre, BigDecimal cantidad, Unidad unidad) {
        return new Ingrediente(nombre, new Cantidad(cantidad, unidad));
    }
}
