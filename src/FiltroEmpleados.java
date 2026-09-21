import java.util.ArrayList;

class Empleado {
    String departamento;
    double salario;

    public Empleado(String nombre, String departamento, double salario) {
        this.departamento = departamento;
        this.salario = salario;
    }
}

public class FiltroEmpleados {
    public static ArrayList<Empleado> filtrarPorDepartamento(ArrayList<Empleado> lista, String departamento) {
        ArrayList<Empleado> resultado = new ArrayList<>();
        for (Empleado e : lista) {
            if (e.departamento.equals(departamento) && e.salario > 5000.0) {
                resultado.add(e);
            }
        }
        return resultado;
    }
}

