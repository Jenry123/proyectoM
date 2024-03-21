import java.util.Scanner; 

public class Almacen {
static Scanner  sc = new Scanner(System.in);
//eliminar el objeto tiposproductos no se ocupa
static  DosX objDosX;
static  Corona objcorona;
static Inventario objInventario;
    public static void seleccionarMarcaProductos(){
        int  opcion;
      
       
        String continuar;
        do{
            System.out.println("Selccione la marca del producto: ");
        System.out.println("\n 1- Corona");
        System.out.println("\n 2- Dos X ");
        System.out.println("\n 3-ver reporte total del dia");
        opcion=sc.nextInt();

        switch (opcion) {
            case 1:
           objDosX.agregarProductosDosX();
                 break;

            case 2:
             objcorona.agregarProductosCorona();
                break;
            
            case 3:

                break;
        
            default:
            System.out.println("ingrese una opcion valida");
                break;
        }
        System.out.println("desea buscar otro producto s/n");
         continuar=sc.next();
        }while(continuar.equals("s"));
    }
}
