package datos;

public class Asignatura {
    private String nombre;
    private Profesor profesor;
    private Estudiante[] estudiantes;
    private int cantidadEstudiantes;

    public Asignatura(String nombre, Profesor profesor, int maxEstudiantes) {
        this.nombre = nombre;
        this.profesor = profesor;
        estudiantes = new Estudiante[maxEstudiantes];
        cantidadEstudiantes = 0;
    }

    public void agregarEstudiante(Estudiante estudiante) {
        if (cantidadEstudiantes < estudiantes.length) {
            estudiantes[cantidadEstudiantes] = estudiante;
            cantidadEstudiantes++;
        } else {
            System.out.println("No se pueden agregar más estudiantes");
        }
    }

    public void mostrarInformacion() {
        System.out.println("Asignatura: " + nombre);
        System.out.print("Profesor: ");
        profesor.presentarse();

        System.out.println("Estudiantes inscritos:");
        for (int i = 0; i < cantidadEstudiantes; i++) {
            estudiantes[i].presentarse();
        }
    }
}
