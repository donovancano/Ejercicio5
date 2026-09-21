import java.util.ArrayList;

public class FusionListas {
    // Fusión en un solo recorrido lineal, O(n + m)
    public static ArrayList<Integer> fusionar(ArrayList<Integer> a, ArrayList<Integer> b) {
        ArrayList<Integer> resultado = new ArrayList<>();
        int i = 0, j = 0;

        while (i < a.size() && j < b.size()) {
            if (a.get(i) <= b.get(j)) {
                resultado.add(a.get(i));
                i++;
            } else {
                resultado.add(b.get(j));
                j++;
            }
        }

        // Agregar los restantes de la lista que no se terminó
        while (i < a.size()) {
            resultado.add(a.get(i));
            i++;
        }
        while (j < b.size()) {
            resultado.add(b.get(j));
            j++;
        }

        return resultado;
    }

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1); a.add(3); a.add(5); a.add(7);

        ArrayList<Integer> b = new ArrayList<>();
        b.add(2); b.add(4); b.add(6); b.add(8);

        System.out.println(fusionar(a, b)); // [1, 2, 3, 4, 5, 6, 7, 8]
    }
}

