package Entornos;

/**
 * Programa que analiza un array de notas.
 * 
 * @author Nuria
 * @version 1.0
 */
public class AnalizadorNotas {
    
    /**
     * Método principal del programa.
     */
    public static void main(String[] args) {
        // Array con las notas a analizar
        int[] notas = {5, 7, 3, 7, 2, 9, 7};
        
        int vecesQueAparece = 0;
        int notaMasAlta = notas[0];
        
        // Buscar la nota más alta
        for (int i = 1; i < notas.length; i++) {
            if (notas[i] > notaMasAlta) {
                notaMasAlta = notas[i];
            }
        }
        
        // Contar cuántas veces aparece la nota más alta
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] == notaMasAlta) {
                vecesQueAparece++;
            }
        }
        
        // Mostrar si la nota más alta está repetida
        if (vecesQueAparece > 1) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }
        
        // Calcular la suma de todas las notas
        int suma = 0;
        for (int i = 0; i < notas.length; i++) {
            suma += notas[i];
        }
        
        // Calcular el promedio
        double promedio = (double) suma / notas.length;
        System.out.println(promedio);
        
        // Evaluar si el promedio es aprobatorio
        if (promedio >= 5) {
            System.out.println("BIEN");
        } else {
            System.out.println("MAL");
        }
    }
}