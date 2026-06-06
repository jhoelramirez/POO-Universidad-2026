
public class Main {

    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE GESTIÓN DE TALENTO HUMANO V1.0 ===\n");

        // 1. Instanciamos un Empleado regular (Línea de dos niveles)
        Empleado desarrollador = new Empleado("Ana Mendoza", 24, "EMP-2026-004", 25000.0);
        System.out.println(">> EJECUTANDO FICHA DE EMPLEADO STANDARD:");
        desarrollador.mostrarInformacion();
        System.out.println("Depósito de Nómina Estimado: $" + desarrollador.calcularsalarioneto());
        System.out.println("\n---------------------------------------------\n");

        // 2. Instanciamos un Gerente (Línea completa de herencia multinivel)
        Gerente directorTI = new Gerente(
                "Marco Mendoza", 54, "GER-1996-001", 55000.0, "Sistemas Computacionales", 15000.0
        );
        System.out.println(">> EJECUTANDO FICHA DE ALTA DIRECCIÓN (MULTINIVEL):");
        // Este método ejecuta en cascada: Persona -> Empleado -> Gerente automáticamente
        directorTI.mostrarInformacion();
    }
}
