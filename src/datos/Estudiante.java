package datos;

public class Estudiante extends Persona {
    private String codigo;

    public Estudiante(String nombre, String identificacion, String codigo) {
        super(nombre, identificacion);
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    @Override
    public void presentarse() {
        System.out.println("Estudiante: " + nombre + " | Código: " + codigo);
    }
}