import java.util.ArrayList;
import java.util.Scanner;

public class DosX {
      static Scanner guardar=new Scanner(System.in);
    static ArrayList<productosDosX>lista= new ArrayList<>();

 
     public static void agregarProductosDosX(){
        lista.add(new productosDosX("lata",12,100,129382382));
        lista.add(new productosDosX("mega",42,300,17666682));
        lista.add(new productosDosX("ultra",12,100,13444482));
        lista.add(new productosDosX("superior",12,100,1211113382));
        for(productosDosX  x:lista){
            System.out.println("nombre: "+x.getNombre());
        }
    }
}
