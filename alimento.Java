// Subclase que representa un producto alimenticio
public class Alimento extends Producto {
    private String fechaCaducidad;

    public Alimento(String nombre, double precio, int stock, String fechaCaducidad) {
        super(nombre, precio, stock);
        this.fechaCaducidad = fechaCaducidad;
    }

    @Override
    public double calcularDescuento() {
        return precio * 0.05; // 5% de descuento
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Fecha de caducidad: " + fechaCaducidad);
    }
}
