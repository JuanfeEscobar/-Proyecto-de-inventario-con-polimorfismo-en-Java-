// Clase principal que demuestra el polimorfismo
public class Main {
    public static void main(String[] args) {
        // Creación de objetos de distintas subclases
        Producto p1 = new Electronico("Laptop HP", 15000, 5, 24);
        Producto p2 = new Alimento("Leche deslactosada", 25, 50, "2025-12-31");
        Producto p3 = new Ropa("Camisa deportiva", 350, 20, "M");

        // Arreglo polimórfico de productos
        Producto[] inventario = {p1, p2, p3};

        // Recorremos el inventario usando polimorfismo
        for (Producto p : inventario) {
            p.mostrarInfo();
            System.out.println("Descuento aplicado: $" + p.calcularDescuento());
            System.out.println("---------------------------");
        }
    }
}
