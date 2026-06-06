
public class Gerente extends Empleado {

    private String Departamento;
    private double bonoEstrategico;

    public Gerente(String nombre, int edad, String idEmpleado, double salarioBase, String Departamento, double bonoEstrategico) {
        super(nombre, edad, idEmpleado, salarioBase);
        this.Departamento = Departamento;
        this.bonoEstrategico = bonoEstrategico;
    }

    public String getDepartamento() {
        return Departamento;

    }

    public void setDepartamento(String Departamento) {
        this.Departamento = Departamento;
    }

    public double getBonoEstrategico() {
        return bonoEstrategico;
    }

    public void setBonoEstrategico(double bonoEstrategico) {
        this.bonoEstrategico = bonoEstrategico;
    }

    @Override
    public double calcularsalarioneto() {
        double salarioNeto = super.calcularsalarioneto() + bonoEstrategico;
        return salarioNeto;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Departamento:" + Departamento);
        System.out.println("Bono Estrategico: $" + bonoEstrategico);
        System.out.println("Salario Neto con Bono: $" + calcularsalarioneto());

    }

}
