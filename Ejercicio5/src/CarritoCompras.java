import java.util.ArrayList;

class ItemCarrito {
    String producto;
    int cantidad;
    double precioUnitario;

    public ItemCarrito(String producto, int cantidad, double precioUnitario) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }
}

public class CarritoCompras {
    private final ArrayList<ItemCarrito> items;

    public CarritoCompras() {
        items = new ArrayList<>();
    }

    public void agregarItem(String producto, int cantidad, double precioUnitario) {
        for (ItemCarrito item : items) {
            if (item.producto.equals(producto)) {
                item.cantidad += cantidad; // ya existe, incrementa cantidad
                return;
            }
        }
        items.add(new ItemCarrito(producto, cantidad, precioUnitario));
    }

    public void eliminarItem(String producto) {
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).producto.equals(producto)) {
                items.remove(i);
                return;
            }
        }
    }

    public void vaciarCarrito() {
        items.clear();
    }

    public double calcularTotal() {
        double total = 0;
        for (ItemCarrito item : items) {
            total += item.cantidad * item.precioUnitario;
        }
        return total;
    }

    public void mostrar() {
        for (ItemCarrito item : items) {
            System.out.println(item.producto + " x" + item.cantidad + " = Q" + (item.cantidad * item.precioUnitario));
        }
    }
}
