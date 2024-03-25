import java.util.ArrayList;
import java.util.Scanner;
public class Inventario {
static Corona objC;
static DosX objX;
public static void imprimirTotalVentas(){
    System.out.println(("el total de productos restantes de la marca corona es de : \n \t"));
        objC.mostrarProductos();
        System.out.println("-------------------------------------------------------------------");
        System.out.println("\n el total de ventas realizadas con dos x son de: \n \t");
         objX.mostrarProductos();
        
}
 
}


