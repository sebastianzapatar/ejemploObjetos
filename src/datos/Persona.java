package datos;

public class Persona {
    protected String nombre;
    protected String identificacion;

    public Persona(String nombre, String identificacion) {
        this.nombre = nombre;
        this.identificacion = identificacion;
    }

    public void presentarse() {
        System.out.println("Hola, soy " + nombre);
    }
}