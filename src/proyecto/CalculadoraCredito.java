package Proyecto;

import java.util.Scanner; 

public class CalculadoraCredito { // clase que calcula el credito
 
public static void main(String[] args){ 
 
double p,iy;
int n;
Scanner sc=new Scanner(System.in); 
System.out.print("Monto de prestamo a solitar: "); 
p=sc.nextFloat();
System.out.print("Ingrese el Interes %: "); 
iy=sc.nextFloat();
System.out.print("Ingrese el plazo meses: "); 
n=sc.nextInt(); 
calAmort(p,iy,n); //GUARDA LAS VARIABLES INGRESADAS POR EL USUARIO
 }

public static void calAmort(double p,double iy, int ny){ 
double newbal; 
double im=(iy/12)/100; // FORMULA QUE CALCULA EL INTERES
int nm=ny; // FORMULA QUE CALCULA LOS MESES
double mp,ip,pp; 
int i;
 
mp=p*im*Math.pow(1+im,(double)nm)/(Math.pow(1+im,(double)nm)-1);
printHeader(); 
//imprimir la tabla de amortización de todos los meses , excepto el último mes
for(i=1;i<nm;i++){ 
ip=p*im; //fórmula para el pago del interes
pp=mp-ip; // pago principal
newbal=p-pp; // nuevo balance de la cuenta 
printSch(i,p,mp,ip,pp,newbal);
p=newbal; // actualizar el pago
}
 // calculos de mes anterior 
pp=p;
ip=p*im;
mp=pp+ip;
newbal=0.0;
printSch(i,p,mp,ip,pp,newbal); 
 }
 
public static void printSch(int i,double p,double mp,double ip,double pp,double newbal){
 
System.out.format("%-8d%-12.3f%-10.3f%-10.3f%-10.3f%-12.3f\n",i,p,mp,ip,pp,newbal);
} 
// METODO PARA QUE IMPRIMA LA GRAFICA

public static void printHeader(){ // IMPRIME LOS ENCABEZADOS DE LA GRAFICA
int i;
System.out.println("\nPlan de amortización para el Préstamo");
for(i=0;i<62;i++) System.out.print("-");
System.out.format("\n%-8s%-12s%-10s%-10s%-10s%-12s"," ","Saldo","Mensual","Interés","Principio","Nuevo","Balance");
System.out.format("\n%-8s%-12s%-10s%-10s%-10s%-12s\n\n","Mes","Actual","Pago","Pagado","Pagado","Balance");
} 

}