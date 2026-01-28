import datos.Asignatura;
import datos.Estudiante;
import datos.Profesor;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Profesor profesor = new Profesor(
            "Sebastian Zapata",
            "1112",
            "Programación"
    );

    Estudiante e1 = new Estudiante("Ana", "222", "202401");
    Estudiante e2 = new Estudiante("Luis", "333", "202402");
    Estudiante e3 = new Estudiante("María", "444", "202403");

    Asignatura poo = new Asignatura(
            "Estructuras de Datos",
            profesor,
            30
    );

    poo.agregarEstudiante(e1);
    poo.agregarEstudiante(e2);
    poo.agregarEstudiante(e3);

    poo.mostrarInformacion();
}

