package ejercicioDos;

public class Main {
    public static void main(String[] args) {
        Estudiante primerEstudiante = new Estudiante();

        Estudiante segundoEstudiante = new Estudiante("Rafael", 23);

        System.out.println(primerEstudiante.mostrarEstudiante());
        System.out.println(segundoEstudiante.mostrarEstudiante());
    }
}
