import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Registro de estudiantes y materias
        System.out.print("Ingrese la cantidad de estudiantes: ");
        int numEstudiantes = scanner.nextInt();

        System.out.print("Ingrese la cantidad de materias: ");
        int numMaterias = scanner.nextInt();

        String[] estudiantes = new String[numEstudiantes];         // Vector de nombres
        String[] materias = new String[numMaterias];               // Vector de materias
        double[][] calificaciones = new double[numEstudiantes][numMaterias]; // Matriz de calificaciones

        // Registro de materias
        System.out.println("\n--- Ingrese los nombres de las materias ---");
        for (int j = 0; j < numMaterias; j++) {
            System.out.print("Materia " + (j + 1) + ": ");
            materias[j] = scanner.next();
        }

        // Registro de nombres y calificaciones
        for (int i = 0; i < numEstudiantes; i++) {
            System.out.print("\nNombre del estudiante #" + (i + 1) + ": ");
            estudiantes[i] = scanner.next();

            for (int j = 0; j < numMaterias; j++) {
                System.out.print("Calificación en " + materias[j] + ": ");
                calificaciones[i][j] = scanner.nextDouble();
            }
        }
        // Mostrar reporte
        System.out.println("\n=== Reporte de Calificaciones ===");
        for (int i = 0; i < numEstudiantes; i++) {
            System.out.println("\nEstudiante: " + estudiantes[i]);
            double promedio = 0;

            for (int j = 0; j < numMaterias; j++) {
                double nota = calificaciones[i][j];
                System.out.println(" - " + materias[j] + ": " + nota);

                promedio += nota;
            }
            promedio /= numMaterias;
            System.out.printf("Promedio: %.2f\n", promedio);

            // Condicional para aprobar/reprobar
            if (promedio >= 3.0) {
                System.out.println("Estado: APROBADO ✅");
            } else {
                System.out.println("Estado: REPROBADO ❌");
            }
        }
        scanner.close();
    }
}

