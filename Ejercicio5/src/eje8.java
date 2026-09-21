/import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

import java.util.Map;

import java.util.Map;

class Factura {
    int idFactura;
    String cliente;
    double monto;

    public Factura(int idFactura, String cliente, double monto) {
        this.idFactura = idFactura;
        this.cliente = cliente;
        this.monto = monto;
    }
}

public class ResumenFacturas {
    public static Map<String, Double> totalPorCliente(ArrayList<Factura> facturas) {
        Map<String, Double> resumen = new LinkedHashMap<>();
        for (Factura f : facturas) {
            resumen.put(f.cliente, resumen.getOrDefault(f.cliente, 0.0) + f.monto);
        }
        return resumen;
    }

    public static void main(String[] args) {
        ArrayList<Factura> facturas = new ArrayList<>();
        facturas.add(new Factura(1, "Ana", 1000.0));
        facturas.add(new Factura(2, "Luis", 500.0));
        facturas.add(new Factura(3, "Ana", 2000.0));
        facturas.add(new Factura(4, "Luis", 300.0));

        Map<String, Double> resumen = totalPorCliente(facturas);
        for (Map.Entry<String, Double> e : resumen.entrySet()) {
            System.out.println(e.getKey() + ": Q" + e.getValue());
        }
    }
}

