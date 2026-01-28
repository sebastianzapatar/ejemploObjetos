# Ejercicio POO – Gestión de Asignaturas con Cupo Dinámico

Este proyecto es un ejercicio práctico de **Programación Orientada a Objetos (POO) en Java**, diseñado para reforzar conceptos fundamentales como **herencia, encapsulamiento, polimorfismo y relaciones entre clases**, así como el manejo de **estructuras de datos usando arreglos**.

---

## Objetivo del ejercicio

Modelar el funcionamiento básico de una **Asignatura universitaria**, teniendo en cuenta que:

- Existen **Personas**, que pueden ser **Estudiantes** o **Profesores**
- Una **Asignatura**:
    - Tiene **un Profesor**
    - Tiene **muchos Estudiantes**
    - Posee un **cupo máximo**
    - Puede operar en **modo dinámico**, permitiendo ampliar el cupo automáticamente cuando se llena

---

## Clases del sistema

### Persona
Clase base del sistema.

**Atributos:**
- `nombre`
- `identificacion`

**Métodos:**
- `presentarse()`

---

### Estudiante (hereda de Persona)

**Atributos:**
- `codigo`

**Métodos:**
- `getCodigo()`
- `presentarse()` (sobrescribe el método de Persona)

---

### Profesor (hereda de Persona)

**Atributos:**
- `especialidad`

**Métodos:**
- `presentarse()` (sobrescribe el método de Persona)

---

### Asignatura

Clase central del ejercicio.

**Atributos:**
- `nombre`
- `profesor`
- `estudiantes[]`
- `inscritos`
- `dinamico`

**Métodos principales:**
- `agregarEstudiante(Estudiante e)`
- `expandirCupo()`
- `existeEstudiante(String codigo)`
- `getCupo()`
- `getInscritos()`
- `mostrarInformacion()`

---

## Relaciones entre clases

- **Herencia**
    - `Estudiante` y `Profesor` heredan de `Persona`
- **Agregación**
    - `Asignatura` tiene un `Profesor`
    - `Asignatura` agrupa múltiples `Estudiantes`

---




---

##  Ejecución del programa

El programa se ejecuta desde la clase `Main`, donde se:

1. Crea un profesor
2. Crea varios estudiantes
3. Se crea una asignatura con cupo inicial
4. Se agregan estudiantes
5. Se imprime la información completa de la asignatura

---

## Conceptos aprendidos

- Programación Orientada a Objetos
- Herencia
- Polimorfismo
- Encapsulamiento
- Asociación y agregación
- Manejo de arreglos
- Redimensionamiento dinámico
- Validación de datos (evitar duplicados)

---

## Posibles extensiones del ejercicio

- Implementar `retirarEstudiante(codigo)`
- Implementar búsqueda de estudiantes
- Agregar una clase `Universidad`
- Cambiar la estrategia de crecimiento del cupo
- Implementar diagramas UML adicionales

---
---

---

## Sebastian Zapata

Ejercicio académico para la asignatura **Estructuras de Datos**.
