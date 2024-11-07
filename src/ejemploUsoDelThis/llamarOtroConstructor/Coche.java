package ejemploUsoDelThis.llamarOtroConstructor;

public class Coche {
    private String marca;
    private int velocidadMaxima;

    public Coche() {
        this("Desconocida", 0);   //llama al constructor de dos parametros
    }

    public Coche(String marca, int velocidadMaxima) {
        this.marca = marca;
        this.velocidadMaxima = velocidadMaxima;
    }

    public void mostrarInformacion() {
        System.out.println("Marca: " + marca + ", Velocidad máxima: " + velocidadMaxima);
    }
}
