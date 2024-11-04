import java.util.Scanner;
public class Tarea01 {
    public static void main(String[] args) {
        Scanner lectura=new Scanner (System.in);
        //Solicitaremos al usuario el sueldo
        System.out.print("Ingrese el sueldo 1: ");
        double sueldo1 = lectura.nextDouble();
        System.out.print("Ingrese el sueldo 2: ");
        double sueldo2 = lectura.nextDouble();
        System.out.print("Ingrese el sueldo 3: ");
        double sueldo3 = lectura.nextDouble();
        System.out.print("Ingrese el sueldo 4: ");
        double sueldo4 = lectura.nextDouble();
        //Crearemos el objeto de la clase Empleado
        Empleado empleado = new Empleado(sueldo1, sueldo2, sueldo3, sueldo4);
        //Verificamos y mostramos los resultados
        System.out.println("Total de sueldos: " + empleado.calcularTotal());
        System.out.println("Promedio de sueldos: " + empleado.calcularPromedio());
        System.out.println("Sueldo mayor: " + empleado.obtenerSueldoMayor());
        System.out.println("Sueldo menor: " + empleado.obtenerSueldoMenor());
        lectura.close();
        }
}