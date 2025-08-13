public abstract class Empleado {
    private String nombre;
    private double salarioBase;
    private int horasTrabajadas;
    private String departamento;
    private double tarifaHora;

    public Empleado(String nombre, double salarioBase, int horasTrabajadas, double tarifaHora, String departamento) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaHora = tarifaHora;
        this.departamento = departamento;
    }

    public abstract double calcularSalario();

    // Método común para imprimir detalles básicos
    public void imprimirDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario base: " + salarioBase);
        System.out.println("Horas trabajadas: " + horasTrabajadas);
        System.out.println("Departamento: " + departamento);
    }

    // Getters y Setters
    public String getNombre() { return nombre; }
    public double getSalarioBase() { return salarioBase; }
    public void setSalarioBase(double salarioBase) { this.salarioBase = salarioBase; }
    public int getHorasTrabajadas() { return horasTrabajadas; }
    public double getTarifaHora() { return tarifaHora; }
    public String getDepartamento() { return departamento; }
}
