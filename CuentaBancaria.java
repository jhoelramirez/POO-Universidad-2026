public class CuentaBancaria {
	private String numeroCuenta;
	private double saldo;

	public CuentaBancaria(String numeroCuenta, double saldoInicial) {
		this.numeroCuenta = numeroCuenta;
		this.saldo = saldoInicial;
	}

	public void retirar(double monto) throws SaldoInsuficienteException {
		System.out.println("Procesando solicitud de retiro por: $" + monto);

		if (monto <= 0) {
			throw new IllegalArgumentException("Error: El monto del retiro debe ser una cantidad positiva.");
		}

		if (monto > this.saldo) {
			throw new SaldoInsuficienteException(this.saldo, monto);
		}


		this.saldo -= monto;
		System.out.println("-> Retiro exitoso. Por favor tome su dinero.");
	}

	public double getSaldo() {
		return saldo;
	}
	public String getNumeroCuenta() {
		return numeroCuenta;
	}
}

