package Ejercicio1;

public class Profesor extends Empleado {
    private String cargo;
    private boolean esProfesorOAyudante;

    // Constructor vacío
    public Profesor() {
        super(); // Llama al constructor vacío de la clase Empleado
        this.cargo = "";
        this.esProfesorOAyudante = false;
    }

    // Constructor con parámetros
    public Profesor(int dni, String nombre, int edad, int cantidadMesesTrabajados, String cargo, boolean esProfesorOAyudante) {
        super(dni, nombre, edad, cantidadMesesTrabajados); // Llama al constructor de Empleado con parámetros
        this.cargo = cargo;
        this.esProfesorOAyudante = esProfesorOAyudante;
    }

    // Getters y Setters
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public boolean isEsProfesorOAyudante() {
        return esProfesorOAyudante;
    }

    public void setEsProfesorOAyudante(boolean esProfesorOAyudante) {
        this.esProfesorOAyudante = esProfesorOAyudante;
    }

    // Implementación del método abstracto
    @Override
    public void ObtenerInformacionParticularDelTrabajo() {
        System.out.println("Los profesores suelen trabajar dando clases en secundarios, terciarios o universitarios");
    }
}

