class EmpleadoPorHoras extends Empleado {
    private String genero;

    public EmpleadoPorHoras(String nombre, int horasTrabajadas, double tarifaHora, String departamento, String genero) {
        super(nombre, 0, horasTrabajadas, tarifaHora, departamento);
        this.genero = genero;
        setSalarioBase(calcularSalario());
    }

    @Override
    public double calcularSalario() {
        return getHorasTrabajadas() * getTarifaHora();
    }

    @Override
    public void imprimirDetalles() {
        super.imprimirDetalles();
        System.out.println("Género: " + genero);
    }
}