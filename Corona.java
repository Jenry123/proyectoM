import java.util.ArrayList;
import java.util.Scanner;
public class Corona{
    static Scanner guardar=new Scanner(System.in);
    static ArrayList<ProductosCorona>listaProductos=new ArrayList<>();

 
    
     public static void agregarProductosCorona(){
        listaProductos.add(new ProductosCorona("familiar",12,100,129382382));
        listaProductos.add(new ProductosCorona("mega",42,300,17666682));
        listaProductos.add(new ProductosCorona("modelo",12,100,13444482));
        listaProductos.add(new ProductosCorona("barrilito",12,100,1211113382));
        
      
        for(ProductosCorona  x:listaProductos){
            System.out.println("nombre: "+x.getNombre());
        }

       
    }
}
