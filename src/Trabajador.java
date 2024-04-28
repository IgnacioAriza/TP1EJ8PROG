class Trabajador extends Empleado {
    private String area;

    public Trabajador(String nombre, int edad, double salario, String area) {
        super(nombre, edad, salario);
        this.area = area;
    }

    public void producir() {
        System.out.println(nombre + " esta produciendo en el area de " + area);
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Area: " + area);
    }
}
