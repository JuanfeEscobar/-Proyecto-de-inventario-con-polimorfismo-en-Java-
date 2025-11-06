// Clase abstracta que define las propiedades comunes de los productos
public abstract class Producto {
    protected String nombre;
    protected double precio;
    protected int stock;

    // Constructor
    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    // Método común para mostrar información general del producto
    public void mostrarInfo() {
        System.out.println("Producto: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Stock disponible: " + stock);
    }

    // Método abstracto que será implementado por las subclases
    public abstract double calcularDescuento();
}
