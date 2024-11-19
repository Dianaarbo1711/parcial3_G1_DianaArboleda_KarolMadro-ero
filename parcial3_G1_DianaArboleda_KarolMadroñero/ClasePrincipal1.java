
package claseprincipal1;

import java.util.Scanner;


public class ClasePrincipal1 {

    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
  gestionEstudiantes gestion = new gestionEstudiantes(100);
   int opcion;

   do {
  System.out.println(" EduPilo S.A.");
  System.out.println("MENÚ GESTIÓN ESTUDIANTES");
  System.out.println("1. Agregar estudiante");
  System.out.println("2. Mostrar todos los estudiantes");
  System.out.println("3. Buscar Estudiante por Nombre");
  System.out.println("4. Calcular el promedio general");
  System.out.println("5. Salir");
  System.out.print("Ingrese una opción: ");
        opcion = sc.nextInt();
         sc.nextLine(); 

    switch (opcion) {
        case 1:
    System.out.print("Ingrese el nombre del estudiante: ");
        String nombre = sc.nextLine();
    System.out.print("Ingrese la edad del estudiante: ");
        int edad = sc.nextInt();
    System.out.print("Ingrese el promedio del estudiante: ");
        double promedio = sc.nextDouble();
        gestion.agregarEstudiante(nombre, edad, promedio);
            break;
        case 2:
        gestion.mostrarEstudiantes();
        sc.nextLine();
            break;
        case 3:
    System.out.print("Ingrese el nombre del estudiante a buscar: ");
        String nombreBusqueda = sc.nextLine();
        gestion.buscarPorNombre(nombreBusqueda);
            break;
        case 4:
        gestion.calcularPromedioGeneral();
        sc.nextLine();
            break;
        case 5:
    System.out.println("Saliendo...");
            break;
        default:
    System.out.println("Opción no válida.");
    sc.nextLine();
            break;
            }
        } while (opcion != 5);

        sc.close();
    }
}
   
