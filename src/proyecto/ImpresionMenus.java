/*
Es donde se guarda el codigo
*/
package Proyecto;

/*
sirve para las entradas y salidas de datos
*/
import java.io.*;
/* Clase Principal

*/
public class ImpresionMenus{ 
 
/*
 Metodo presentacion es el que va a mostrar en pantalla la introduccion del proyecto
 */
public static void Presentacion(){
System.out.println("Este programa va a definir una clase Calculadora que tiene dos métodos uno que se llama \n" +
"\n" +"Calculadora de Ahorro y Calculadora de Crédito; ambos métodos reciben un par de operando, \n" +
"\n" +"realizan la operación que corresponda y en el return del método regresa o finaliza el resultado de \n" +
"\n" +"la operación, que desplegara número de años que se tiene para ahorrar, métodos de ahorro, \n" +
"\n" +"cantidad ahorrada actual, ahorros mensuales, tasa de rendimiento esperada (anual en sus \n" +
"\n" +"ahorros), tasa de inflación esperada (promedio a largo plazo). ");
System.out.println("");
System.out.println("INTEGRANTES");
System.out.println("Norma Julieta Casasola Archila 0909-11-2619\n" +
"Salvador David Acevedo Cardona 0909-13-10068\n" +
"Selvin Adelqui Castañeda 0909-08-5295\n" +
"Byron Estuardo Villeda Monroy 0909-06-10478");
System.out.println("");
System.out.println("Curso: Programación II");
System.out.println("");
System.out.println("Ciclo: 4 Ciclo");
System.out.println("");
System.out.println("Año: 2,015");
System.out.println("");
}
/*
Metodo que va a mostrar el menu principal en pantalla
*/
 public static void MenuPrincipal(){
 
System.out.println("Bienvenido al Menú calculadora; por favor eliga una opción" ); 
System.out.println("1.- Calculadora de Ahorro" ); 
System.out.println("2.- Calculadora de Crédito" ); 
System.out.println("3.- Salir" ) ; 
System.out.println("");
System.out.print("Ingrese opción: ");

}
/*
 Metodo que presentara una calculadora de Ahorro
 */
 public static void MenuCalculadoraAhorro() throws IOException{
 BufferedReader in =new BufferedReader(new InputStreamReader(System.in));
double n2,n3,n4,interes,totalmonto,inte1, inte2; 
int n1; 

System.out.print("Ingrese el plazo meses: " );
n1=Integer.parseInt(in.readLine()); 
System.out.print("Ingrese el interes: " ); 
n2=Integer.parseInt(in.readLine());
n4=(n2/100);
System.out.print("Ingrese el monto : " ); 
n3=Integer.parseInt(in.readLine()); 
 System.out.println("");
 System.out.println("El plazo en meses es de: "+n1);
 System.out.println("El interes es de: "+n4+"%");
 System.out.println("El monto es de: "+n3);
 inte1=((1+n4));
 inte2 = Math.pow(inte1,n1);
 interes=(n3*inte2)-n3;
 System.out.println("El interes es de: "+interes);
 totalmonto= (interes+n3);
 System.out.println("El monto sería: "+totalmonto);
 }
 }