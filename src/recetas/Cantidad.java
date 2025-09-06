package recetas;

import java.math.BigDecimal;
import java.util.Objects;

public class Cantidad {
    private final BigDecimal valor;
    private final Unidad unidad;

    public Cantidad(BigDecimal valor, Unidad unidad) {
        if (valor == null || valor.signum() <= 0) {
            throw new IllegalArgumentException("El valor debe ser > 0");
        }
        this.valor = valor;
        this.unidad = Objects.requireNonNull(unidad);
    }

    public BigDecimal getValor() { return valor; }
    public Unidad getUnidad() { return unidad; }
}
