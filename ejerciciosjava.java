import java.util.Scanner;

/**
 * ejerciciosjava
 */
public class ejerciciosjava {
    public static void main(String[] args) {
        //2.15
        //Definir variables
double p, r=4, i;
//Datos de entrada
Scanner lt= new Scanner(System.in);
System.out.println ("Ingerse el valor de la Intensidad:");
i=lt.nextDouble();
        //Proceso
p=r*Math.pow(i,  2);
        //Datos de salida
        System.out.println("La potencia es:"+p);
    }
}