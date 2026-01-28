package datos;

public class Profesor extends Persona {
    private String especialidad;

    public Profesor(String nombre, String identificacion, String especialidad) {
        super(nombre, identificacion);
        this.especialidad = especialidad;
    }

    @Override
    public void presentarse() {
        System.out.println("Profesor: " + nombre + " | Área: " + especialidad);
    }
}
