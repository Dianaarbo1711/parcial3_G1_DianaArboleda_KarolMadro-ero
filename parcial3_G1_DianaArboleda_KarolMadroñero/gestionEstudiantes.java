
package claseprincipal1;

import java.util.Scanner;


public class gestionEstudiantes {
    
    private Estudiantes [] Estudiantes;
    private int cantidadActual;
    private int capacidad_Max =100;

    public gestionEstudiantes() {
        Estudiantes = new Estudiantes[capacidad_Max];
        cantidadActual = 0;
    }

    gestionEstudiantes(int i) {
      
    }

    public void agregarEstudiante() {
        if (cantidadActual == capacidad_Max) {
            System.out.println("La lista de estudiantes está llena.");
            return;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del estudiante: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese la edad del estudiante: ");
        int edad = scanner.nextInt();
        System.out.print("Ingrese el promedio del estudiante: ");
        double promedio = scanner.nextDouble();

        Estudiantes nuevoEstudiante = new Estudiantes(nombre, edad, promedio);
        Estudiantes[cantidadActual] = nuevoEstudiante;
        cantidadActual++;
    }

    public void mostrarEstudiantes() {
        if (cantidadActual == 0) {
            System.out.println("No se encuentran estudiantes registrados.");
            return;
        }

        System.out.println("Lista de estudiantes:");
        for (int i = 0; i < cantidadActual; i++) {
            System.out.println(Estudiantes[i]);
        }
    }

    public void buscarPorNombre(String nombre) {
        for (int i = 0; i < cantidadActual; i++) {
            if (Estudiantes[i].getNombre().equalsIgnoreCase(nombre)) {
                System.out.println(Estudiantes[i]);
                return;
            }
        }
        System.out.println("El estudiante no fue encontrado.");
    }

    public void calcularPromedioGeneral() {
        if (cantidadActual == 0) {
            System.out.println("No existen estudiantes registrados.");
            return;
        }

        double sumaPromedios = 0;
        for (int i = 0; i < cantidadActual; i++) {
            sumaPromedios += Estudiantes[i].getPromedio();
        }
        double promedioGeneral = sumaPromedios / cantidadActual;
        System.out.println("El promedio general de los estudiantes es: " + promedioGeneral);
    }

    void agregarEstudiante(String nombre, int edad, double promedio) {
        
    }

 
}

