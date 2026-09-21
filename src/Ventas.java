import java.util.ArrayList;

public class Ventas {
    public static double promedio(ArrayList<Double> ventas) {
        double suma = 0;
        for (double v : ventas) {
            suma += v;
        }
        return suma / ventas.size();
    }

    public static double maximo(ArrayList<Double> ventas) {
        double max = ventas.get(0);
        for (double v : ventas) {
            if (v > max) max = v;
        }
        return max;
    }

    public static double minimo(ArrayList<Double> ventas) {
        double min = ventas.get(0);
        for (double v : ventas) {
            if (v < min) min = v;
        }
        return min;
    }

    public static int diasSobrePromedio(ArrayList<Double> ventas) {
        double prom = promedio(ventas);
        int contador = 0;
        for (double v : ventas) {
            if (v > prom) contador++;
        }
        return contador;
    }

    public static void main(String[] args) {
        ArrayList<Double> ventas = new ArrayList<>();
        // Llenar con los montos de cada día del mes (ejemplo)
        for (int i = 0; i < 30; i++) {
            ventas.add(1000.0 + i * 50);
        }

        System.out.println("Promedio: " + promedio(ventas));
        System.out.println("Máximo: " + maximo(ventas));
        System.out.println("Mínimo: " + minimo(ventas));
        System.out.println("Días sobre el promedio: " + diasSobrePromedio(ventas));
    }
}
