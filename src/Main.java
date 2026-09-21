import java.util.ArrayList;

class Producto {
    int id;
    String nombre;
    double precio;
    int stock;

    public Producto(int id, String nombre, double precio, int stock) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Producto{id=" + id + ", nombre='" + nombre + "', precio=" + precio + ", stock=" + stock + "}";
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Producto> productos = new ArrayList<>();
        productos.add(new Producto(1, "Laptop", 5000.0, 5));
        productos.add(new Producto(2, "Mouse", 150.0, 20));
        productos.add(new Producto(3, "Teclado", 300.0, 8));

        aplicarAumento(productos, 10.0);

        for (Producto p : productos) {
            System.out.println(p);
        }
    }

    // Método que actualiza el precio según el porcentaje de aumento
    public static void aplicarAumento(ArrayList<Producto> lista, double porcentaje) {
        for (Producto p : lista) {
            if (p.stock < 10) {
                p.precio += p.precio * (porcentaje / 100.0);
            }
        }
    }
}
