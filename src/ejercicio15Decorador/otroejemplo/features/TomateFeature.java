package ejercicio15Decorador.otroejemplo.features;

import ejercicio15Decorador.otroejemplo.decorador.HamburguesaDecorador;
import ejercicio15Decorador.otroejemplo.models.Hamburguesa;

public class TomateFeature extends HamburguesaDecorador {

    private Hamburguesa hamburguesa;

    public TomateFeature(Hamburguesa hamburguesa) {
        this.hamburguesa = hamburguesa;
    }

    @Override
    public String getDescripcion() {
        return hamburguesa.getDescripcion()+" + Tomate";
    }
}
