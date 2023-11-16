package Ejercicio1;

public abstract class Empleado {
	private int dni;
	private String nombre;
	private int edad;
	private int cantidadMesesTrabajados;
	 // Constructor vacío
    public Empleado() {
        this.dni = 12345678;
        this.nombre = "Sin nombre";
    }   
 // Constructor con parámetros
    public Empleado(int dni, String nombre, int edad, int cantidadMesesTrabajados) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.cantidadMesesTrabajados = cantidadMesesTrabajados;
    }
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getCantidadMesesTrabajados() {
		return cantidadMesesTrabajados;
	}
	public void setCantidadMesesTrabajados(int cantidadMesesTrabajados) {
		this.cantidadMesesTrabajados = cantidadMesesTrabajados;
	}
	 // Método toString
    @Override
    public String toString() {
        return "DNI: " + dni + ", Nombre: " + nombre + ", Edad: " + edad + ", Meses Trabajados: " + cantidadMesesTrabajados;
    }

    // Método para evaluar la cantidad de meses trabajados
    public void EvaluarCantidadMesesTrabajados() {
        if (cantidadMesesTrabajados < 3) {
            System.out.println("Se encuentra en etapa de prueba");
        } else {
            System.out.println("Se encuentra fijo en la empresa");
        }
    }

    // Método abstracto para obtener información particular del trabajo
    public abstract void ObtenerInformacionParticularDelTrabajo();
}
