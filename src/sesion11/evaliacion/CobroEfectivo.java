package sesion11.evaliacion;

public class CobroEfectivo implements Cobro {
    @Override
    public String pago() {
        return "Realizaste el pago en efectivo";
    }
}
