import java.util.ArrayList;

public class HistorialNavegacion {
    private final ArrayList<String> historial;
    private static final int LIMITE = 10;

    public HistorialNavegacion() {
        historial = new ArrayList<>();
    }

    public void visitarPagina(String url) {
        historial.add(url);
        if (historial.size() > LIMITE) {
            historial.remove(0); // elimina la más antigua
        }
    }

    public void mostrarHistorial() {
        for (String url : historial) {
            System.out.println(url);
        }
    }

    public static void main(String[] args) {
        HistorialNavegacion h = new HistorialNavegacion();
        for (int i = 0; i < 15; i++) {
            h.visitarPagina("https://sitio.com/pagina" + i);
        }
        h.mostrarHistorial(); // solo mostrará las últimas 10
    }
}

