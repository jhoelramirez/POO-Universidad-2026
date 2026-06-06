
public class Empleado extends Persona {

    protected String idEmpleado;
    protected double salarioBase;

    public Empleado(String nombre, int edad, String idEmpleado, double salarioBase) {
        super(nombre, edad);
        this.idEmpleado = idEmpleado;
        this.salarioBase = salarioBase;
    }

    public double calcularsalarioneto() {
        double retencion = salarioBase * 0.10;
        return salarioBase - retencion;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("ID Empleado: " + idEmpleado);
        System.out.println("Salario Base: $" + salarioBase);
        System.out.println("Salario Neto: $" + calcularsalarioneto());
    }
}
