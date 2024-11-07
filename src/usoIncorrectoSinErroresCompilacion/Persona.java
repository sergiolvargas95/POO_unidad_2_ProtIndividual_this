package usoIncorrectoSinErroresCompilacion;

public class Persona {
    private String nombre;

    public void setNombre(String nombre) {
        this.nombre = nombre;

        // Uso innecesario de `this` dentro de un método sin ambigüedad
        this.mostrarNombre();
    }

    private void mostrarNombre() {
        System.out.println("Nombre: " + nombre);
    }
}
