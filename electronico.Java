// Subclase que representa un producto electrónico
public class Electronico extends Producto {
    private int garantiaMeses;

    public Electronico(String nombre, double precio, int stock, int garantiaMeses) {
        super(nombre, precio, stock);
        this.garantiaMeses = garantiaMeses;
    }

    // Implementación específica del método abstracto
    @Override
    public double calcularDescuento() {
        return precio * 0.10; // 10% de descuento
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Garantía: " + garantiaMeses + " meses");
    }
}
