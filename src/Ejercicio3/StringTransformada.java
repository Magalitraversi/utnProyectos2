package Ejercicio3;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class StringTransformada {

    
    // Método que recibe la lista de strings y una interfaz funcional para transformar a mayúsculas
    public static List<String> transformStrings(List<String> strings, Function<String, String> transformer) {
        List<String> transformedList = new ArrayList<>();
        
        // Itera sobre cada string en la lista y aplica la transformación
        for (String str : strings) {
            String transformedString = transformer.apply(str); 
            transformedList.add(transformedString); 
        }
        
        return transformedList; 
    }

    public static void main(String[] args) {
        List<String> strings = List.of("galletitas", "azúcar", "yerba");
        
        // Expresión lambda para transformar a mayúsculas
        Function<String, String> toUpperCase = s -> s.toUpperCase();
        
        List<String> transformedStrings = transformStrings(strings, toUpperCase);
        
        // Imprime el nuevo listado de strings transformados
        System.out.println("Lista de strings transformados:");
        for (String str : transformedStrings) {
            System.out.println(str);
        }
    }
}
