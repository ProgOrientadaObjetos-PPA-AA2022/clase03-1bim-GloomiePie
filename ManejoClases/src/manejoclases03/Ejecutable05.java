/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoclases03;

/**
 *
 * @author reroes
 */
import java.util.Locale;
import java.util.Scanner;

public class Ejecutable05 {

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
sc.useLocale(Locale.US);

Hospital h1 = new Hospital();
Hospital h2 = new Hospital();
Hospital h3 = new Hospital();

System.out.print("Ingrese el nombre del Hospital: ");
String nombre = sc.nextLine();
h1.establecerNombre(nombre);
System.out.print("Ingrese el numero de camas del Hospital: ");
int camas = sc.nextInt();
h1.establecerNumeroCamas(camas);
System.out.print("Ingrese el valor del presupuesto del Hospital: ");
double valor1 = sc.nextDouble();
h1.establecerPresupuesto(valor1);

System.out.print("\nIngrese el nombre del Hospital: ");
sc.nextLine();
nombre = sc.nextLine();
h2.establecerNombre(nombre);
System.out.print("Ingrese el numero de camas del Hospital: ");
camas = sc.nextInt();
h2.establecerNumeroCamas(camas);
System.out.print("Ingrese el valor del presupuesto del Hospital: ");
valor1 = sc.nextDouble();
h2.establecerPresupuesto(valor1);

System.out.print("\nIngrese el nombre del Hospital: ");
sc.nextLine();
nombre = sc.nextLine();
h3.establecerNombre(nombre);
System.out.print("Ingrese el numero de camas del Hospital: ");
camas = sc.nextInt();
h3.establecerNumeroCamas(camas);
System.out.print("Ingrese el valor del presupuesto del Hospital: ");
valor1 = sc.nextDouble();
h3.establecerPresupuesto(valor1);

double suma = h1.obtenerPresupuesto() + h2.obtenerPresupuesto() +
h3.obtenerPresupuesto();

int sumaCamas = h1.obtenerNumeroCamas() + h2.obtenerNumeroCamas() +
h3.obtenerNumeroCamas();

System.out.printf("%n%s - %d - %.2f\n", h1.obtenerNombre(),
h1.obtenerNumeroCamas(), h1.obtenerPresupuesto());
System.out.printf("%s - %d - %.2f\n", h2.obtenerNombre(),
h2.obtenerNumeroCamas(), h2.obtenerPresupuesto());
System.out.printf("%s - %d - %.2f\n", h3.obtenerNombre(),
h3.obtenerNumeroCamas(), h3.obtenerPresupuesto());

System.out.printf("\nLa suma de presupuestos es %.2f\n", suma);
System.out.printf("La suma de las camas de los diferentes Hospitales es %d\n", sumaCamas);

}
}
