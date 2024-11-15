package ejercicioTres;

public class Usuario {
    private String name;

    public Usuario(String name) {
        this.name = name;
    }

    public static void printName() {
        System.out.println(this.name);     //Error de compilación: this no puede ser usado en metodos estaticos.
    }
}
