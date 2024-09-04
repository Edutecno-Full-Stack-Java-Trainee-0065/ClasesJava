package sesion11.evaliacion;

public class CobroTarjeta implements Cobro {
    @Override
    public String pago() {
        return "Realizaste el pago con Tarjeta de Credito.";
    }
}
