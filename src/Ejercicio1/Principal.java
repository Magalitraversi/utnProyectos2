package Ejercicio1;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Instanciar un objeto de tipo Profesor con constructor con parámetros
        Profesor profesor1 = new Profesor(12345678, "Giuliana Alaska", 36, 11, "Profesora de Historia", true);

        // Mostrar la información del profesor1 usando toString()
        System.out.println("Información del profesor1:");
        System.out.println(profesor1.toString());

        // Llamar al método EvaluarCantidadMesesTrabajados() para profesor1
        profesor1.EvaluarCantidadMesesTrabajados();

        // Instanciar un objeto de tipo Profesor con constructor vacío
        Profesor profesor2 = new Profesor();

        // Mostrar la información del profesor2 usando toString()
        System.out.println("\nInformación del profesor2:");
        System.out.println(profesor2.toString());

        // Llamar al método ObtenerInformacionParticularDelTrabajo() para profesor2
        profesor2.ObtenerInformacionParticularDelTrabajo();
    
	}

}
