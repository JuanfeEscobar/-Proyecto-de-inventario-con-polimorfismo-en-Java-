// Subclase que representa una prenda de ropa
public class Ropa extends Producto {
    private String talla;

    public Ropa(String nombre, double precio, int stock, String talla) {
        super(nombre, precio, stock);
        this.talla = talla;
    }

    @Override
    public double calcularDescuento() {
        return precio * 0.15; // 15% de descuento
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Talla: " + talla);
    }
}
