package ejercicioDos;

public class Estudiante {
    private String nombre;
    private int edad;

    public Estudiante() {
        this("Sin nombre", 0);
    }

    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String mostrarEstudiante() {
        return "Estudiante { " + "\n" +
                "   nombre = " + nombre + ",\n" +
                "   edad = " + edad + ",\n" +
                "}";
    }
}
