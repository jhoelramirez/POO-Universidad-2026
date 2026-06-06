public class SaldoInsuficienteException{
    private double saldoActual;
    private double montoSolicitado;

    public SaldoInsuficienteException(double saldoActual, double montoSolicitado) {
        super("Transacción Rechazada: Fondos insuficientes para completar el retiro.");
        this.saldoActual = saldoActual;
        this.montoSolicitado = montoSolicitado;
    }

    public double getSaldoActual() { return saldoActual; }
    public double getMontoSolicitado() { return montoSolicitado; }
}
