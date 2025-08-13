class EmpleadoFijo extends Empleado {
    private double bonoAnual;
    private String genero;

    public EmpleadoFijo(String nombre, double salarioBase, int horasTrabajadas, String departamento, double bonoAnual, String genero) {
        super(nombre, salarioBase, horasTrabajadas, 0, departamento);
        this.bonoAnual = bonoAnual;
        this.genero = genero;
    }

    @Override
    public double calcularSalario() {
        validarDatos();
        double salarioTotal = getSalarioBase();
        if (getHorasTrabajadas() > 40) {
            salarioTotal += (getHorasTrabajadas() - 40) * 50;
        }
        salarioTotal += obtenerBonoPorDepartamento();
        return salarioTotal + bonoAnual;
    }

    @Override
    public void imprimirDetalles() {
        super.imprimirDetalles();
        System.out.println("Género: " + genero);
        System.out.println("Bono anual: " + bonoAnual);
    }

    private void validarDatos() {
        if (getSalarioBase() < 0) throw new IllegalArgumentException("El salario debe ser >= 0");
        if (getHorasTrabajadas() < 0) throw new IllegalArgumentException("Las horas trabajadas deben ser >= 0");
    }

    private double obtenerBonoPorDepartamento() {
        return switch (getDepartamento()) {
            case "Sistemas" -> 20;
            case "Contabilidad" -> 10;
            default -> 0;
        };
    }
}
