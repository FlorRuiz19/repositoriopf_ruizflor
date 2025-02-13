
import java.util.Scanner;
public class Programapf {
     public static void main(String[] args){
        // declarar variable
        String vendedor;
        Double v1,v2,v3,v4,sm,cm,sn;
        Scanner lectura=new Scanner(System.in);
        //entrada de datos
        System.out.println("Nombre de vendedor");
        vendedor=lectura.next();
        System.out.println("Ventas 1");
        v1=lectura.nextDouble();
        System.out.println("Ventas 2");
        v2=lectura.nextDouble();
        System.out.println("Ventas 3");
        v3=lectura.nextDouble();
         System.out.println("Ventas 4");
        v4=lectura.nextDouble();
        System.out.println("Sueldo mensual");
        sm=lectura.nextDouble();
        //proceso de datos
        cm=(v1+v2+v3+v4)*0.1;
        sn=sm+cm;
        //salidad de datos
        System.out.println("La comision de ventas es:"+cm);
        System.out.println("El sueldo neto del vendedor es:"+sn);
     }
}
