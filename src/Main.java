public class Main {
    public static void main(String[] args) {
        // Crear un gerente
        Gerente gerente = new Gerente("Maria", 40, 50000, "Ventas");
        gerente.mostrarInformacion();
        gerente.organizarActividades();

        System.out.println();

        // Crear un trabajador
        Trabajador trabajador = new Trabajador("Carlos", 25, 30000, "Pescaderia");
        trabajador.mostrarInformacion();
        trabajador.producir();
    }
}
