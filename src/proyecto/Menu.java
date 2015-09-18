package Proyecto;
import java.io.*;
import java.math.BigDecimal;
/*
Es el metodo que va a imprimir todos los menu
*/
public class Menu { 
public static void main(String args[] )throws IOException{ 
BufferedReader in =new BufferedReader(new InputStreamReader(System.in)); 

/*
Se llamo el metodo presentacion para que se imprima desde aqui
*/
int op;
ImpresionMenus.Presentacion();
System.out.println("");
/* 
Se llamo el metodo Menu principal para que se imprima desde aqui
*/
ImpresionMenus.MenuPrincipal();
op=Integer.parseInt(in.readLine());


switch(op){ // VARIABLE QUE VA A GUARDAR LA OPCION ELEGIDA POR EL USUARIO 
case 1: /*
 SE LLAMO MENU CALCULADORA AHORRO
 */
 System.out.println("");
 System.out.println("Bienvenido a la Calculadora Ahorro");
 ImpresionMenus.MenuCalculadoraAhorro();
while(op!=1)
 
 
break; 
case 2:
 /*
 SE LLAMO MENU CALCULADORA CREDITO 
 */
System.out.println("");
System.out.println("Bienvenido a la calculadora crédito");
CalculadoraCredito.main(args);
while(op!=1)
break; 
 
}} 
}