import java.util.Scanner;

public class DosX extends Inventario{
    static  boolean repetir=true;

    public void seleccionarOperacion(){
        int opcion;
        Scanner guardar = new Scanner(System.in);
      
        do{
            System.out.println("que desea realizar 1)guardar 2)editar producto 3)ver productos 4)salir");
            opcion=guardar.nextInt();
       
               switch (opcion) {
                   case 1:
                       agregarProductos();
                       break;
                   case 2:
                      editarProducto();
                       break;
                       case 3:
                       mostrarProductos();
                   break;
                       case 4:
                      repetir=false;
                       break;
               
                   default:
                   System.out.println("seleccione una opcion valida");
                       break;
               }
        }while(repetir);

    }
    @Override
    public void mostrarProductos(){
        System.out.println("productos de dos X: ");
        for(Productos  x:listaProductos){
           if(x.getCodigo()<=999999){
            System.out.println("nombre: \t"+x.getNombre()+"\n"+"precio: \t"+x.getPrecio()+"\n"+"cantidad: \t"+x.getCantidad()+"\n"+"id:    \t"+x.getCodigo()+"\n");
           }
        }
    }
       
}